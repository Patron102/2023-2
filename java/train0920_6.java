package week4;

public class train0920_6 {

	public static void main(String[] args) {
		printGrade(96);
		printGrade(86);
		printGrade(70);
		printGrade(55);
	}
	
	public static void printGrade(int score) {
		String grade = "";
		
		if (score >= 90) {
			grade = "A";
		}
		
		else if (score >= 80) {
			grade = "B";
		}
		
		else if (score >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		
		System.out.printf("%d점의 학점 : %s\n", score, grade);
		
	}

}
