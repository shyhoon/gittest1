package ch05;

public class Subway {
	int subWaynumber;
	int passengerCount;
	int money;
	
	public Subway (int subWaynumber) {
		this.subWaynumber = subWaynumber ; 
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(" ����ö " + subWaynumber+"ȣ���� �°���");
		System.out.println(passengerCount+"���̰�");
		System.out.println("������ ���ͱ��� : "+money+"�� �Դϴ�.");
	}
	
	
	
	
}
