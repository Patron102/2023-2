package week5;

public class train0927_3 {

	public static void main(String[] args) {
		int[] arr = {88, 76, 92, 68, 55, 48, 82};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("총합 : %d", sum);
	}

}
