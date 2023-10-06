package ifexample;

public class IfExample3 {

	public static void main(String[] args) {
		int score = 90;
		char grade;

		if (score >= 90) {	
		    grade = 'A';
		    System.out.println("이번 학기 성적은 A등급입니다.");
		}

		else if (score >= 80) {
		    grade = 'B';
		    System.out.println("이번 학기 성적은 B등급입니다.");
		}

		else if (score >= 70) {
		    grade = 'C';
		    System.out.println("이번 학기 성적은 C등급입니다.");
		}

		else if (score >= 60) {
		    grade = 'D';
		    System.out.println("이번 학기 성적은 D등급입니다.");
		}

		else {
		   grade = 'F';
		   System.out.println("이번 학기 성적은 F등급입니다.");
		   
		}
		
 	}

}
