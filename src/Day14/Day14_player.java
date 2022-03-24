package Day14;

import java.util.Scanner;

public class Day14_player {
	
	//예제 1. 소리재생 2. 영상재생 동시에 실행가능하게
		// 소리 or 영상 재생시 한번 더 누르면 중지
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sound sound = new Sound();
		boolean soundsw = true;
		
		while(true) {
			System.out.println("1. 소리재생 2. 영상재생");
		int ch = scanner.nextInt();
		
		if(ch == 1) {
			if(Sound.soundstop) {
			Sound.soundstop(true);
			
			sound.start();
			// sound.soundstop = false; // 소리종료
			soundsw = false;
				}else {
					sound.soundstop(false);
					sound.stop=true; // 소리재생
				}
			}
		else if(ch == 2) {
			boolean moviesw = true;
			Movie movie = new Movie();
			if(moviesw) {
				Movie.Moviestop(true);
				
				movie.start();
				moviesw = false;
				}else {
					movie.Moviestop(false);
					moviesw = true;
				}
			}
		}
	}
}
