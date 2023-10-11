package week6;

public class Cat {
	
	String name;       //이름
	String breeds;     //품종
	double weight;    //체중
	
	void claw() { //인스턴스 메소드1
		System.out.println("할퀴기");
		}
	
	void meow() { //인스턴스 메소드2
		System.out.println("야옹~");
		}
	
	
	public static void main(String[] args) { //메인 메소드
		Cat c = new Cat();
		
		c.name = "네로";
		c.breeds = "페르시안";
		c.weight = 4.73;
		
		System.out.printf("이름 : %s\n", c.name);
		System.out.printf("품종 : %s\n", c.breeds);
		System.out.printf("체중 : %.2fkg\n", c.weight);
	}
}
