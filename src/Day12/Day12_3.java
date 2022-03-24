package Day12;

import java.io.IOException;

public class Day12_3 {

	public static void main(String[] args) {
		
		// 도서 검색 프로그램
			// 조건
			// 1. 입력받기 [ system.in.read() ]
			// 2. String 배열 내 여러 도서가 저장
				//
			// 3. 검색기능, 수정기능
				// 검색기능 : 특정 문자를 입력받아 도서 내 포함된 문자가 있으면 모두 출력
				String[] 도서목록 = {	
					"된다! 네이버 블로그&포스트",
					"스프링 부트 실전 활용 마스터",
					"Tucker의 Go 언어 프로그래밍",
					"혼자 공부하는 C 언어"};			
				while(true) {
				System.out.println("1. 도서검색 2. 수정"); 
				try {
					byte[]bytes=new byte[100];
					int count = System.in.read(bytes);
					String select = new String(bytes, 0, count-2);
				switch(select) {
				case ("1") : {
					System.out.println("검색할 도서명 입력");
					byte[] input = new byte[100]; try {
						int count1 = System.in.read(input);
					String search = new String(input, 0, count1-2);
					System.out.println("--검색 결과--");
						for(String temp : 도서목록) {
							if(temp.indexOf(search) != -1) {
								System.out.println(temp);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}case("2"): {
					System.out.println("수정 페이지");
					System.out.println("수정될 도서명의 일부 입력 :");
					byte[]bytes2=new byte[100];
					int count2 = System.in.read(bytes2);
					String bsearch = new String(bytes2, 0, count2-2);
					int i = 0;
					for(String temp : 도서목록) {
						if(temp.contains(bsearch)) {
							System.out.println("도서번호 : "+i+"번 교재명 : " + temp);
						}i++;
					}
					System.out.println("도서번호 선택 : ");
						count = System.in.read(bytes);
					String ch = new String(bytes, 0, count-2);
						// 문자열로 받았으니 변환
						int index = Integer.parseInt(ch);
					System.out.println(" 기존 문자 : ");
						count = System.in.read(bytes);
						String oldstr = new String(bytes, 0, count-2);
					System.out.println(" 새로운 문자 : ");
						count = System.in.read(bytes);
						String newstr = new String(bytes, 0, count-2);
						//도서명을 수정시키고 집어넣기[대입]
					도서목록[index] = 도서목록[index].replace(oldstr, newstr); System.out.println("수정 완료");
				}
			} 
		}catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
}
