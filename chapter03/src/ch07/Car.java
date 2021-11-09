package ch07;

public abstract class Car {

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}

	public abstract void drive(); // �޼����� ����� {}�� ������

	public abstract void stop();
	
	public abstract void wiper();
	
	// ��ũ(hook) �޼��� (�ʿ��ϸ� ���°� �������� ���°�
	public void washCar() {
		
	}

	
	//�ٽ�!! �߻�޼���
	// ���� Ŭ�������� ������ �� �� ���� �ؾ� �Ѵ�. --> finalŰ���� Ȱ�� (������
	final public void run() { // ���� ����Ŭ�������� run�̶� �޼��带 ������ �� �� ����
		startCar();				// �̰����� �ڵ� ������ �帧�� �̸� ������ �� �ִ�
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
// �߻�Ŭ������ �����ϰ� �ִ� Ŭ������ �߻�Ŭ����
//���ø� �޼��� ������ ������ ������ �ϳ�
// ������ �帧�� �����ΰ� �߰��߰��� ����ִ� �ڵ带 ���� -> ���ø� �޼��� �������� �����ӿ�ũ�� ���� ¥�� �ֵ�
// �����ӿ�ũ�� ������ �帧�� �������ֱ⶧���� �� �ȿ��� �ڵ带 �Ἥ ����ϴ� ��