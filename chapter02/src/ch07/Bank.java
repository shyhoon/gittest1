package ch07;

public class Bank {

	// ���� ����
	private int balance;
	
	// �޼���
	
	// �Ա� ���
	public void deposit(int money) {
		this.balance += money;
	}
	
	// ��� ���
	public int witdraw(int money) {
		this.balance -= money;
		return money;
	}
	public void showInfo() {
		System.out.println("���� �ܾ��� : " +this.balance+ " �Դϴ�.");
	}
	
	// getter �޼��� ����� �޼��带 ���ؼ� ������������� ������ �Ѱ��ִ°�
	// �Ϲ������� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� ���� �Ѵ�.
	// ��������� �����ϴ°�
	// �Ϲ������� get�޼����� �̸��� get...���� �Ѵ�.
	// �Ű������� �־����� �ʾƼ� ���� �аų� ���� �Ұ� read only
	public int getBalance() {
		return this.balance;
	}
	// setter �޼��� �����
	// �Ϲ������� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� ���� �Ѵ�.
	// �Ϲ������� get�޼����� �̸��� get...���� �Ѵ�.
	// ��������� ���� �� �� �ְ� �Ű������� ����
	// �ʿ信���ؼ� ����ų� �ȸ��� �� �ִ�
	// ��������� ���� �Է� �� ����� �ڵ带 ��������ν� �ѹ��� �����ؼ� ����� ���ִ�.
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("�߸��� �Է� �Դϴ�.");
		}else {
			this.balance = balance;
		}
	}
	// oop������ �����Ҷ��� ��������� ��������(private)�Ͽ� �ʿ信���� getter,setter�޼��带 ����Ѵ�
	
	
	
}
// public class�� .java ���� �ȿ� �� �ϳ��� ����� �� �ִ�.
class Student{
	
}
