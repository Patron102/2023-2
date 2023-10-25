package week9;

public class myMathTest {

	public static void main(String[] args) {
		System.out.println(MyMath.max(1.23, 3.45));
		System.out.println(MyMath.min(5.43, 3.21));
	}
}

class MyMath {
	static double max(double a, double b) { 
		if (a>b)  return a;   else  return b;  
		//return (a>b) ? a : b;
	}
	
	static double min(double a, double b) { 
		if (a<b)  return a;   else  return b; 
		//return (a<b) ? a : b;
	}
}
