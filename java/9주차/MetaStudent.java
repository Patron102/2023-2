package week9;

public class MetaStudent {

	public static void main(String[] args) {
		MStundent ms = new MStundent(20233654, "박효기", 80);
		System.out.printf("학번 : %d\n이름 : %s\n점수 : %d\n========================\n", ms.id, ms.name, ms.getScore());
		ms.setScore(100);
		System.out.printf("학번 : %d\n이름 : %s\n점수 : %d", ms.id, ms.name, ms.getScore());
	}
}

public class  MStundent{
	int id;
	String name;
	private int score;
	
	public MStundent(int _id, String _name, int _score) {
		id = _id;
		name = _name;
		score = _score;
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int _score) {
		score = _score;
	}
}
