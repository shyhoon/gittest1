
package ch04;

public class Subway {

	// ȣ�� ��ȣ �������
	// �°���
	// ���ͱ�
	
	int subWaynumber;
	int passengerCount;
	int money;
	
	// ������ - ȣ�� ��ȣ�� �޴� ������
	public Subway (int subWaynumber) {
		this.subWaynumber = subWaynumber ; 
		
	}
	// �޼��� take , showInfo 
	
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
