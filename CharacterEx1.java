package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = '가';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 44033;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);

		String str1 = "Hello, Java\0";
		System.out.println(str1);
	}

}
