package week4;

public class train0920_9 {

	public static void main(String[] args) {
		printScholarship("Park", 100, 92);
		printScholarship("Kim", 82, 96);
		printScholarship("Choi", 82, 88);
	}
	
	public static void printScholarship(String name, int math, int eng) {
		String result = "";
		
		if (math >= 90 && eng >= 90) {
			result = "전액 장학금!";
		} else if (math >= 90 || eng >= 90) {
			result = "반액 장학금!";
		} else {
			result = "전액 등록금!";
		}
		System.out.printf("%s => %s\n", name, result);
	}

}
