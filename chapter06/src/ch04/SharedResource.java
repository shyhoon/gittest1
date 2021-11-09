package ch04;

class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.money = money;
		}
	}
	// �Աݱ��
	public synchronized void saveMoney(int money) { 									// synchronized�޼���
		// 10���� ����																		
		int currentMoney = getMoney();
		System.out.println("�޼��� ���� Ȯ�� 1: savemoney");									// logging
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("�Ա��� ���� �ܾ� :" + getMoney());
	}

	public void withdrawMoney(int money) {
		
		int a = 100;
		
		synchronized (this) {															// synchronized ��  
			int currentMoney = getMoney();												
			
			System.out.println("�޼��� ���� Ȯ�� 1: withdrawmoney"); 						// logging
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (money> currentMoney) {
				System.out.println("�߸��� �Է��Դϴ�");
			}else {
				setMoney(currentMoney - money);
				System.out.println("����� ���� �ܾ� :" + getMoney());
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

		// ���� 10���� ���� �Ǿ� �ִ� ���·� ��ü ����
		BankAccount account = new BankAccount(); 		// shared resource���� Thread���� �����ϴ� �ڿ����ִ� ����
		Father father = new Father(account);			// ������ �ƺ��� ���� ���������� Thread�� �ٶ� �� �ְ� account��°� ����
		Mother mother = new Mother(account);
		
		// �ƹ����� �Ա��ϴ� ����
		father.start();									// Thread���� ����
		// ��Ӵϰ� ����ϴ� ����
		mother.start();									// Thread���� ���� 	
		
		// ���� ó�� �ݾ� :10 + 1���� - 5õ�� = 10�� 5õ��
		// ����� 110000 �ǵ�ġ ���� ����� ���� �� �ִ�.
		
		// ����ȭ
		// �Ӱ迵���� �߻� �ɶ��� (�۾��ڰ��� �ڿ��� �����ϴ� ����)
		// ���� �ڿ�(������) ����ϰ� �ֱ� ������ ��ȣ ó���� ����� �Ѵ�.
		// �ٸ� �۾��ڰ� ��뤷���� ���ϵ��� lock�� �ɾ� �ش�.
		// ������ ���Ѽ� �۾��� �ϰ� �Ѵ�.
		
		// �ϴ� ���
		// 1. synchronized�޼���
		// 2. synchronized���
		
		
	}

}
