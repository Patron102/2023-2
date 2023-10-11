package week5;

public class train0927_1 {

	public static void main(String[] args) {
		
		countdown(5);
		gugu();

	}
	
	public static void countdown(int num) {
		System.out.println("카운트다운을 시작합니다.");
		
		while(num >= 0) {
			System.out.printf("%d..\n", num);
			num--;
		}
		
		System.out.println("히히발싸!");
	}
	
	public static void gugu() {
		for (int i = 1; i <= 9; i ++) {
			System.out.printf("3 x %d = %d\n", i, 3 * i);
		}
	}

}
