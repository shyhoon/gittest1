package ch07;

public class AICar extends Car{

	@Override // �߻�޼��带 �Ϲݸ޼���� ������
	public void drive() {
		System.out.println("���� ���� �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}
	@Override
	public void stop() {
		System.out.println(" ������ ����ϴ�.");
	}
	@Override
	public void wiper() {
		System.out.println("������ ������ ������ �մϴ�.");
	}
	
	@Override
	public void washCar() {
		System.out.println("������ ������ �մϴ�. ");
	}
	
	
	
	
	
	
	
}