package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static ProductDao productDao = new ProductDao();
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", "root", "1234");
		}catch(Exception e) {System.out.println("DB연동오류"+e);}
	}
	//제품 등록
	public boolean add(Product product) {
		try {
		String sql = "insert into product(pname,pimage,pcontent,pcategory,pprice,pactivation,mnum) values(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, product.getPname());
		ps.setString(2, product.getPimg());
		ps.setString(3, product.getPcontent());
		ps.setString(4, product.getpCategory());
		ps.setInt(5, product.getPprice());
		ps.setInt(6, product.getPactivation());
		ps.setInt(7, product.getMnum());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("상품추가오류"+e);} return false;
	}
	//모든 제품 출력
	public ArrayList<Product> list(String category, String search){
		ArrayList<Product> productlist = new ArrayList<>();
		try {
			String sql = null;
			if(category == null && search == null) {
				sql = "select * from product";
				ps = con.prepareStatement(sql);
			}
		else if(search==null) { // 검색어 없으면
				sql = "select * from product where pcategory=? order by pnum desc";
			ps = con.prepareStatement(sql);
			ps.setString(1, category);
			}else { // 검색어 있으면
				sql = "select * from product where pcategory=? and pname like '%"+search+"%' order by pnum desc";
				ps = con.prepareStatement(sql);
				ps.setString(1, category);
			}
			rs=ps.executeQuery();
			while(rs.next()) {
				Product product = new Product(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getInt(6),
					rs.getInt(7),
					rs.getString(8),
					rs.getInt(9));
				productlist.add(product);
			}return productlist;
		}catch(Exception e) {System.out.println("제품출력오류"+e);}
		return null;
	}
	//제품 조회
	
	//제품 삭제
	public boolean delete(int pnum) {
		try {
			String sql = "delete from product where pnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("제품삭제오류"+e);}
		return false;
	}
	//제품 수정
	public boolean update(Product product) {
		try {
			String sql="update product set pname=?, pimage=?, pcontent=?, pcategory=?, pprice=? where pnum=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPimg());
			ps.setString(3, product.getPcontent());
			ps.setString(4, product.getpCategory());
			ps.setInt(5, product.getPprice());
			ps.setInt(6, product.getPnum());
		}catch(Exception e) {System.out.println("제품수정오류"+e);}
		return false;
	}
	public boolean activation(int pnum) { // 상태변경
		try {
		//현재 제품의 상태
		String sql = "select pactivation from product where pnum=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, pnum);
		rs = ps.executeQuery();
		if(rs.next()) {
			String upsql = null;
			if(rs.getInt(1)==1) {
				upsql = "update product set pactivation=2 where pnum=?";
			}
			if(rs.getInt(1)==2) {
				upsql = "update product set pactivation=3 where pnum=?";
			}
			if(rs.getInt(1)==3) {
				upsql = "update product set pactivation=1 where pnum=?";
			}
			ps=con.prepareStatement(upsql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
			}
		}catch(Exception e) {System.out.println("제품상태변경오류"+e);}
		return false;
	}
}
