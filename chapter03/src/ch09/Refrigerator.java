package ch09;

	// �������̽��� ����(implements)�ϴ� ��� �������̽��� �������� �ִ�
	public class Refrigerator extends HomeAppliances implements RemoteController,SoundEffect {
	// �ڹٿ����� ���� ��Ӹ� �Ǿ� �ϳ��� �߻�Ŭ������ "���" ���� �� ������ �������̽��� �������� ,����Ͽ�"����"�Ҽ��ִ�.	
	// �ڹٿ����� �ϳ��� Ŭ������ ����� �ѹ��� �����ϱ⶧���� �������̽��� ���� ��� 

	@Override
	public void turnOn() {
		System.out.println("����� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����� ���ϴ�.");
	}

	@Override
	public void notification() {
		System.out.println("�츮����~~");
	}

}
