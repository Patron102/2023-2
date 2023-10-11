package week6;

public class Dog {

	
	String name;       //이름
	String breeds;     //품종
	int age;    //나이
	
	Dog() {}
	Dog(String _name, String _breads, int _age) {
		name = _name;
		breeds = _breads;
		age = _age;
	}
	
	void wag() {
		System.out.printf("[%s] 살랑살랑~\n", name);
	}
	void bark() {
		System.out.printf("[%s] 멍멍!\n", name);
	}
	void printState() {
		System.out.printf("================\n이름 : %s\n품종 : %s\n나이 : %d\n", name, breeds, age);
	}
	
	public static void main(String[] args) { //메인 메소드
		Dog d1 = new Dog();
		d1.name = "워윅";
		d1.breeds = "자운";
		d1.age = 34;
		
		Dog d2 = new Dog();
		d2.name = "칼날부리";
		d2.breeds = "협곡";
		d2.age = 1;
		
		d1.printState();
		d2.printState();
		
		d1.wag();
		d2.bark();
		
	}
}
