package Day14;

import java.util.Scanner;

public class Day14_player {
	
	//���� 1. �Ҹ���� 2. ������� ���ÿ� ���డ���ϰ�
		// �Ҹ� or ���� ����� �ѹ� �� ������ ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sound sound = new Sound();
		boolean soundsw = true;
		
		while(true) {
			System.out.println("1. �Ҹ���� 2. �������");
		int ch = scanner.nextInt();
		
		if(ch == 1) {
			if(Sound.soundstop) {
			Sound.soundstop(true);
			
			sound.start();
			// sound.soundstop = false; // �Ҹ�����
			soundsw = false;
				}else {
					sound.soundstop(false);
					sound.stop=true; // �Ҹ����
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
