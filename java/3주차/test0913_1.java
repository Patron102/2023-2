package week3;

public class test0913_1 {

	public static void main(String[] args) {
		

		int a = 1;
		int b = 1;
		// 전위 연산
		System.out.println(++a); // 2 출력
		System.out.println(--b); // 0 출력
		
		a = 1;
		b = 1;
		
		//후위 연산
		System.out.println(a++); //1 출력
		System.out.println(b--); //1 출력
	}

}
