package ch07;

public class MainTest1 {
	public static void main(String[] args) {
	
		Bank bank = new Bank();
		// ��� ������ ���� Ȯ��
		// int balance --> 0
		// double --> 0.0
		// ����Ÿ�� --> null
		
		bank.deposit(10_000);
		bank.showInfo();
		
		// ����� �մϴ�.
		int money = bank.witdraw(5_000);          
		//<--? withdraw�Լ��� return���� �ֱ⿡ return���� ���� ������ �ʿ��ϴ�
		System.out.println("���� ���� �ݾ� : " + money);
		bank.showInfo();
		
		// ������ �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ���� ��
		//bank.balance = 100_000;
		bank.showInfo();
		
		// getter�޼���� 
		// getter, setter
		// read only �б⸸ �����Ѱ� ����Ȯ�� ����
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		// setter ����غ���
		bank.setBalance(0);
		bank.showInfo();
		
		// ���� ���� ������ 
		// 4����
		// public - ������ ������ ����ϰ� �Ѵ�.
		// default - ���� ��Ű��(package) �������� ������ ����Ѵ� (��� �����տ� �ƹ��ŵ� ���� �ʴ°�) 
		// protected - ��Ӱ��迡�� ������ ��� �Ѵ�.
		// private - ���� Ŭ���� ������ ������ ����Ѵ�.
		
		
		
}
}
