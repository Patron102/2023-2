package week5;

public class train0927_6 {

	public static void main(String[] args) {
		int [][] gugu  = new int [10][10];
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugu[i][j] = i * j;
			}
		}
	System.out.printf("2 x 7 = %d\n", gugu[2][7]);
	}
	
}
