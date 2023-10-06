package operator;

public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = gameScore++ + 100 + 25;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		System.out.println(2 >= 1);
	}
}
