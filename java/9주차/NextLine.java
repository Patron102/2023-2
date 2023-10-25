package week9;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("숫자 입력 : ");
		n = ss.nextInt();
		
		System.out.print("문자열 입력 : ");
		ss.nextLine();
		s = ss.nextLine();
		//s = ss.next();
		
		System.out.println("숫자 : " + n);
		System.out.println("문자 : " + s);
		ss.close();
	}

}
