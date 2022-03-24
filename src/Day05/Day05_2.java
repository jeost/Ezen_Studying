package Day05;

import java.util.Scanner;

public class Day05_2 { // c s

	public static void main(String[] args) { // m s
		
		// 회원제 방문록 프로그램 [ 2차원배열 ]
			// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 ]
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인 성공]
			// 2. 로그인 성공 시 메뉴 [ 1. 방문록 쓰기 2. 로그아웃
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인 된 아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
		
		// 준비
		Scanner scanner = new Scanner(System.in); //입력객체
			// 회원 100명[id,pw,name] 저장 배열
		String[][] memberlist = new String[100][3]; // 100행 3열 => 회원당 1행 저장 1열 id 2열 pw 3열 name
			// 방문록 100개[title,contents,writer] 저장 배열
		String[][] boardlist = new String[100][3]; // 게시물당 1행
		
		// 무한루프[종료x]
		while(true) { // while start
			
			System.out.println("---------회원제 방문록--------");
			System.out.println("---------------------------");
			System.out.println("1. 회원가입 2. 로그인");
			System.out.println("선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1) { // 회원가입
				System.out.println("--------- 회원가입 -------");
				System.out.println(" 아이디 입력 : "); String id = scanner.next();
				System.out.println(" 비밀번호 입력 : "); String pw = scanner.next();
				System.out.println(" 이름 입력 : "); String name = scanner.next();
				// String 3개 변수를 입력받아 memberlist 배열에 저장
					// 1. 빈 공간[정수 = 0 실수 = 0.0 객체 = null]을 찾아 저장. 빈 공간이 없으면 회원 수 초과
					// 2. 아이디 중복체크
				boolean idcheck = true;
				for(int d = 0; d<memberlist.length; d++) {
					if (memberlist[d][0] != null &&memberlist[d][0].equals(id)) {
						System.out.println(" id 중복. 재입력 ");
						idcheck = false; // 저장 안되게 false로 변경
						break;
					}
					if (idcheck == true) {
						for( int i = 0; i<memberlist.length; i++) {
							if(memberlist[i][0] == null) { // i번째 행 id가 비어있으면
								memberlist[i][0] = id;
								memberlist[i][1] = pw;
								memberlist[i][2] = name;
								
						break;
					} //if 2 end

						} // for2 end
						
					} // if end
				} //for end
				System.out.println("회원가입 완료");
			}// if end
			else if ( ch == 2) { // 로그인
				System.out.println("-------로그인 페이지-------");
				System.out.println(" 아이디 입력 : "); String id = scanner.next();
				System.out.println(" 비밀번호 입력 : "); String pw = scanner.next();
				//입력받은 id와 pw가 동일하면 로그인처리
				
				boolean logincheck = false; // 로그인 기본값
				for ( int i = 0; i<memberlist.length; i++) {
					
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) &&
							memberlist[i][1].equals(pw)) {
						//null은 equals 불가
						
						System.out.println(" 로그인 성공 ");
						logincheck = true; // 로그인 성공 값 저장
						while(true) {
						System.out.println("------------------------");
						System.out.println("---------방문록-----------");
						System.out.println("번호\t작성자\t제목\t내용");
							//모든 방문록 출력
							for(int j = 0; j<boardlist.length; j++) {
								System.out.printf("%d\t%s\t%s\t%s \n" + i ,
										memberlist[j][2],
										memberlist[j][0],
										memberlist[j][1]);
							}
						System.out.println("1.방문록 남기기 2. 로그아웃");
						System.out.println("선택 : "); int ch2 = scanner.nextInt();
						
						if( ch2==1 ) {
							System.out.println("------------글쓰기------------");
							System.out.println("title : "); String title = scanner.next(); // 제목
							System.out.println("content : "); String content = scanner.next(); // 내용
							// 배열 내 공백을 찾아 저장
							for(int j = 0; j<boardlist.length; j++) {
								if( boardlist[j][0] != null ) {
									boardlist[j][0] = title;
									boardlist[j][1] = content;
									boardlist[j][2] = id; // 로그인시 사용된 id 대입
									}
								}
							
							} //if 방문록 end
						if( ch2 == 2 ) {
							System.out.println("로그아웃 되었습니다."); break;
							} //if 로그아웃 end
						else {System.out.println(" 알 수 없는 입력 ");} 
						}// login while menu end
					} // login if end
				} // for end
				if(logincheck == false ) { System.out.println("알림]] 회원정보가 없거나 다릅니다");}
				
			} // else if end
			else {System.out.println(" 알림]] 알 수 없는 입력");}
		} // while end
		
	} // m e
	
} // c e
