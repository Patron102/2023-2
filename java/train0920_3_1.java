package week4;

public class train0920_3_1 {

	public static void main(String[] args) {
		String name = "아무개라면";
		buy(name);
		boil(name);
		put(name);
		eat(name);
	}
	
	public static void boil(String name) {
		System.out.printf("\n물을 끓인다.");
	}
	
	public static void buy(String name) {
		System.out.printf("%s을 사온다.", name);
	}

	public static void eat(String name) {
		System.out.printf("\n%s을 맛있게 먹는다.", name);
	}
	
	public static void put(String name) {
		System.out.printf("\n%s을 넣는다.", name);
	}

}
