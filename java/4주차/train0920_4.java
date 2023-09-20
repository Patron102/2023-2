package week4;

public class train0920_4 {

	public static void main(String[] args) {
		turn0n(30);
		turn0n(25);

	}
	public static void turn0n(int temperature) {
		if (temperature > 25) {
			System.out.printf("현재 온도 %d도, 에어컨을 가동합니다.", temperature);
		}
		
		if (temperature <= 25) {
			System.out.printf("\n현재 온도 %d도, 에어컨을 가동하지 않습니다.", temperature);
		}
	}

}
