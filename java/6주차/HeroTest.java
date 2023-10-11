package week6;

public class HeroTest {
	
	public static void main(String[] args) {
		Hero IronMan = new Hero("아이언맨", 100, 120);
		Hero Hulk = new Hero("헐크", 200, 80);
		
		System.out.println(IronMan.toStr());
		System.out.println(Hulk.toStr());
	}
}

class Hero {
	String name;
	int power;
	int speed;
	
	Hero(String n, int p, int s) {
		name = n;
		power = p;
		speed = s;
	}
	
	String toStr() {
		return String.format("히어로   [ 이름 : %s, 파워 : %d, 스피드 : %d ]", name, power, speed);
	}
}