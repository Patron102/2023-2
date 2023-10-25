package week9;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		// acc.balance = 1000; -> ERROR 출력됨. private 필드는 외부에서 사용이불가능하기 때문임.
		acc.setBalance(1000);
		System.out.printf("잔액 : %d", acc.getBalance());
	}
}

class Account{
	private int balance;
	
	// 게터 메소드
	public int getBalance() {
		return balance;
	}
	
	//세터 메소드
	public void setBalance(int b) {
		balance = b;
	}
}
