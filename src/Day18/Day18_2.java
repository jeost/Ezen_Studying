package Day18;

import java.util.Vector;

public class Day18_2 {
	
	public static void main(String[] args) {
		Vector<Board> list = new Vector<>();
		//리스트에 객체 바로 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		//객체 생성 후 리스트에 객체 추가
		Board board = new Board("제목2", "내용2", "글쓴이2");
		list.add(board);
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		System.out.println("확인 : " + list);
		System.out.println("객체 검색 : " + list.contains(board));
		System.out.println("객체 위치 검색 : " + list.indexOf(board));
		
		list.remove(2); System.out.println("2번 인덱스 삭제 후 : " + list);
		list.remove(2); System.out.println("2번 인덱스 삭제 후 : " + list);
		
		for(int i = 0; i<list.size(); i++) {
			Board temp = list.get(i);
			System.out.println(temp.제목 +"\t"+ temp.내용 + "\t" + temp.작성자);
		}
		for(Board temp : list) {
			System.out.println(temp.제목 +"\t"+ temp.내용 + "\t" + temp.작성자);
		}
	}
}
