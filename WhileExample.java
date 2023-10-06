package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int num = 0; // 초기값
		int sum = 0;
		
		while(num <= 10) { // 조건식 : true, false 값이 들어가야 함
			num ++; // 증가감식
			sum += num; // 실행문
			System.out.println(sum);
			
			
		}
//		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
	

}
