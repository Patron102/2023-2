package week9;

public class train1025_1 {

	public static void main(String[] args) {
		//기본 변수
		int age = 22;
		int n = age;
		
		age = 33;
		System.out.printf("age : %d, n : %d", age, n);
		
		//레퍼런스 변수
		String str = "hello";
		String tStr = str;
		
		str += "!!!";
		System.out.printf("\nstr : %s, tStr : %s",str, tStr);
		
		//클래스
		Hello h0 = new Hello();
		Hello h1 = h0;
		h0.n = 100;
		
		System.out.printf("\nh0.n : %d, h1.n : %d", h0.n, h1.n);

	}
}

class Hello { int n; }
