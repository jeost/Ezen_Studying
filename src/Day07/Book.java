package Day07;

public class Book { // c s
	// - 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원
	String ISBN; // 도서번호
	String bName; // 도서명
	String bWriter; // 작가
	Boolean bRental; // 대여여부
	String mId; // 대여회원id
	
	
	// - 생성자 : 빈생성자(메소드호출용) 모든 필드를 받는 생성자(도서등록용)
	public Book() {	
	}


	public Book(String iSbn, String bName, String bWriter, Boolean bRental, String mId) {
		
		ISBN = iSbn;
		this.bName = bName;
		this.bWriter = bWriter;
		this.bRental = bRental;
		this.mId = mId;
	}
	
	// - 메소드 : 1. 도서검색 , 2. 도서목록 , 3. 도서대여 , 4. 도서반납 , 5. 도서등록 , 6. 도서삭제
	void 도서검색() { // 검색 s
		System.out.println(" 검색 단어 입력 : "); String bName = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) { // for s
			if ( temp != null && temp.bName.equals(bName)) { // if s
				System.out.println(bName+"의 정보입니다.");
				System.out.print("번호 : "+temp.ISBN+"\t");
				System.out.print("작가 : "+temp.bWriter+"\t");
				if(temp.bRental) {
					System.out.println("대여 가능");
				}else {
					System.out.println("대여 불가");
				}
				
			} // if e
		}// for e
		System.out.println("검색한 책이 없습니다.");
	} // 검색 e

	void 도서목록() { // 목록 s
		System.out.println("----도서 목록----");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		for(Book temp : Day07_5_BookApplication.books) {
			if (temp.ISBN!=null) { // 빈칸이 아니면
				System.out.println(temp.ISBN+"\t"+temp.bName+"\t"+temp.bWriter+"\t"+temp.bRental);
			}
			else if(temp!=null) { // 빈칸이면
				return;
			}
		}
		
	} // 목록 e
	
	void 도서대여(String loginid) { // 대여 s
		System.out.println("도서 ISBN : "); String iSbn = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) { // for s
			if ( temp != null && temp.ISBN.equals(iSbn) && temp.bRental) { // 대충 있으면
				System.out.println(" 대여 가능 ");
				temp.bRental=false; temp.mId=loginid;
				return;
			}else { // 없으면
				System.out.println(" 대여 불가 ");
				return;
			}
		} // for e
		System.out.println("해당하는 도서가 없습니다.");
	} // 대여 e
	
	void 도서반납(String loginid) {//반납 s
		System.out.println("---도서반납 페이지---"); 
	
	도서대여목록(loginid); { // 대여목록 s
		System.out.println("----대여한도서 목록----");
		System.out.println("ISBN\t도서명\t작가\t대여가능여부");
		
		for(Book temp : Day07_5_BookApplication.books) {
			System.out.println(temp.ISBN+"\t"+temp.bName+"\t"+temp.bWriter+"\t"+temp.bRental);
			if (temp.ISBN!=null && temp.mId.equals(loginid)) { // 빈칸이 아니면서 아이디가 일치하면
				temp.bRental=true; temp.mId=null; 
				System.out.println("반납 완료");
				return;
			}
			else if(temp!=null) { // 빈칸이면
				return;
			}
		}
		
	}// 대여목록 e
	}//반납 e
	void 도서대여목록(String loginid) {
		
	}


	void 도서등록() { // 등록 s
		System.out.println("등록할 도서명 입력 : "); String bName = Day07_5_BookApplication.scanner.next();
		System.out.println("도서의 ISBN 입력 : "); String iSbn = Day07_5_BookApplication.scanner.next();
		//ISBN 중복체크
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(iSbn)) {
				System.out.println("현재 사용중인 ISBN입니다."); return; // 도서등록 메소드 종료(등록실패)
			}
		}
		System.out.println("도서의 작가명 입력 : "); String bWriter = Day07_5_BookApplication.scanner.next();
		
		//변수를 합치기
		Book book = new Book(iSbn , bName , bWriter , true , null);
		System.out.println(" 등록이 완료되었습니다."); System.out.println("--등록된 도서 정보--");
		System.out.println("도서 번호 : "+ iSbn); System.out.println("제목 : " +bName);
		System.out.println("작가 : "+bWriter); return;
	} // 등록 e
	
	void 도서삭제() {
		
	}
} // c e