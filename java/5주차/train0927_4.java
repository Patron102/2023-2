package week5;

public class train0927_4 {

	public static void main(String[] args) {
		int[] arr = {42, 66, 57, 54, 88, 64, 71};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("총합 : %d, 평균 : %.2f", sum, (double)sum/arr.length);
	}

}