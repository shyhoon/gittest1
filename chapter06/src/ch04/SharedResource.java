package ch04;

class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.money = money;
		}
	}
	// 입금기능
	public synchronized void saveMoney(int money) { 									// synchronized메서드
		// 10만원 상태																		
		int currentMoney = getMoney();
		System.out.println("메서드 동작 확인 1: savemoney");									// logging
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금후 계좌 잔액 :" + getMoney());
	}

	public void withdrawMoney(int money) {
		
		int a = 100;
		
		synchronized (this) {															// synchronized 블럭  
			int currentMoney = getMoney();												
			
			System.out.println("메서드 동작 확인 1: withdrawmoney"); 						// logging
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (money> currentMoney) {
				System.out.println("잘못된 입력입니다");
			}else {
				setMoney(currentMoney - money);
				System.out.println("출금후 계좌 잔액 :" + getMoney());
			}
		}
	}
} // end of bankAccount class

class Father extends Thread {
	BankAccount account;
	public Father(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {
	BankAccount account;
	public Mother(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.withdrawMoney(5_000);
	}
}

public class SharedResource {

	public static void main(String[] args) {

		// 현재 10만원 저금 되어 있는 상태로 객체 생성
		BankAccount account = new BankAccount(); 		// shared resource상태 Thread간의 공유하는 자원이있는 상태
		Father father = new Father(account);			// 엄마와 아빠는 각각 다형성으로 Thread로 바라볼 수 있고 account라는걸 공유
		Mother mother = new Mother(account);
		
		// 아버지가 입금하는 동작
		father.start();									// Thread동작 실행
		// 어머니가 출금하는 동작
		mother.start();									// Thread동작 실행 	
		
		// 정상 처리 금액 :10 + 1만원 - 5천원 = 10만 5천원
		// 결과값 110000 의도치 않은 결과를 만날 수 있다.
		
		// 동기화
		// 임계영역이 발생 될때는 (작업자간에 자원을 공유하는 상태)
		// 현재 자원(데이터) 사용하고 있기 때문에 보호 처리를 해줘야 한다.
		// 다른 작업자가 사용ㅇ하지 못하도록 lock을 걸어 준다.
		// 순서를 지켜서 작업을 하게 한다.
		
		// 하는 방법
		// 1. synchronized메서드
		// 2. synchronized블록
		
		
	}

}
