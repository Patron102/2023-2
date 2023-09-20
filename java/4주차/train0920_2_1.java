package week4;

public class train0920_2_1 {


	public static void main(String[] args) {
		int n = rollDice();
		System.out.printf("주사위의 눈 : %d", n);
	}
	
	public static int rollDice() {
		double x = 6 * Math.random();
		int temp = (int) x;
		return temp +1;
	}
	
}
