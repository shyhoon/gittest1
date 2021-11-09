package ch04;

class BankAccount{
	
	private int money = 100_000;
	
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.money = money;
		}
	}
	
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금후 계좌 잔액: " + getMoney());
	}
	
	public void withdrawMoney(int money) {
		
		synchronized (this) {
		
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					setMoney(currentMoney-money);
					System.out.println("출금후 계좌 잔액" + getMoney());
		}
	}
	
}

class Father extends Thread{
	
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.saveMoney(10_000);
	}
}

class Mother extends Thread{
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.withdrawMoney(5_000);
	}
}

public class MainTest1 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		father.start();
		mother.start();
		
		
		
		
		
		
		
		
		
		
		
	}
}
