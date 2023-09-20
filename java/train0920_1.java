package week4;

public class train0920_1 {
	
	public static void main(String[] args) {

//		int n = 4;
//		int s = square(n);
//		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d", n, s);
//		
//	}
//	
//	public static int square(int length) {
//		return length * length ;
//	}
	
		double cal = wongidung(7, 5);
		System.out.printf("%.1f", cal);
	}
	
	public static double wongidung(double r, double h) {
		return Math.PI * r * r * h;
	
	}

}
