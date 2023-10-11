package week6;

public class StudentTest {

	public static void main(String[] args) {
		Student KimMeta = new Student("김메타", "012", 90, 80, 70);
		KimMeta.printStr();
	}
}

class Student {
	String name;
	String id;
	int kor;
	int eng;
	int math;
	double avr;
	String grade;
	String max;

	Student() {
		name = "이름 없음";
		id = "000";
		kor = 00;
		eng = 00;
		math = 00;
		avr = 00.0;
		grade = "N";
		}

	double average() {
		avr = (kor + eng + math) / 3;
		return avr;
	}
	
	String grade() {
		if (avr >= 90) { grade = "A"; }
		else if (avr >= 80) { grade = "B"; }
		else if (avr >= 70) { grade = "C"; }
		else if (avr >= 60) { grade = "D"; }
		else { grade = "F";}
		return grade;
	}
	
	String max() {
		if (kor >= eng && kor >= math) { max = "국어"; } 
		else if (eng >= kor && eng >= math) { max = "영어"; } 
		else { max = "수학"; }

		return max;
	}
	
	Student(String n, String i, int k, int e, int m) {
		name = n;
		id = i;
		kor = k;
		eng = e;
		math = m;
		average();
		grade();
		max();
	}
	
	void printStr() {
		System.out.printf("================\n" + 
								  "이름 : %s, 학번 : %s\n" + 
								  "================\n" +
								  "국어 : %d\n수학 : %d\n영어 : %d\n" + 
								  "================\n" + 
								  "평균 : %.2f\n등급 : %s\n최고 점수 과목 : %s"
								  , name, id, kor, eng, math, avr, grade, max);
	}
}
