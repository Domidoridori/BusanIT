package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		int inum3 = 10;
		byte bnum3 = (byte)inum3;
		System.out.println(inum3);
		
		double dnum4 = 3.14;
		int inum4 = (int)dnum4;
		System.out.println(dnum4);

	}

}
