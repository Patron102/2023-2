package week9;

import java.util.Scanner;

public class train1025_3 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = ss.next();
		System.out.print("학번 : ");
		int number = ss.nextInt();
		System.out.print("학점 : ");
		double grade = ss.nextDouble();
		ss.close();
		
		System.out.printf("[%s]님의 학번은 %d이며, 학점은 %.2f입니다.", name, number, grade);
	}
}
