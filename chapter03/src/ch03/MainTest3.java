package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		// �ڵ����� �����ؼ� showInfoȣ���� �ּ���
		
		Car car1 = new Car("���׽ý�", 5500);
		car1.showInfo();
		
		// ������ ������ ������ּ���
		System.out.println(car1.engine=new Engine("�ҽ�", 500));
		car1.engine.showInfo();
		
		
	}
}
