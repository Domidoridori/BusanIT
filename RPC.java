package ifexample;

import java.util.Scanner;

public class RPC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 키보드 입력을 받기 위한 Scanner 클래스 생성
		int player = scanner.nextInt();
		// nextInt()나 next()로 키보드 값 받아오기
		int computer = (int)(Math.random()*3)+1;
		// 가위바위보 게임의 if문 작성
		if (computer == 0) {
			System.out.print("가위");
		} else if (computer == 1) {
			System.out.print("바위");
		} else {
			System.out.print("보");
		}
		System.out.println("를 냈습니다.");
		
		if (computer == player) {
			System.out.println("비겼습니다.");
		} else if ((computer == 1 && player == 2) || (computer == 2 && player == 3) || (computer == 3 && player == 1)) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");			
		}
			
		
		// 가위=0 바위=1 보=2
		// if문 종료
		System.out.println(player);
		System.out.println(computer);
		System.out.println(Math.random()*3+1);
		
		
	}
}
