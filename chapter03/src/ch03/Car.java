package ch03;

public class Car {

	String name;
	int price;
	// ���԰��� has a���� // ��Ӱ���� ���ϱ� ������ ��Ȯ�� oop�������� �����ؾ��Ѵ�.
	// ��ü���� ���ǿ����� ���踦 ���������� ��Ӱ���� ���� �ʱ⶧���� ������� �����ȵȴ�
	Engine engine;
	
	
	public Car(String name , int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 500); // ������ ��ü�� ����� ���� ������ ���߿� ������ �޼��带 ����Ҷ� ��������
	}
	
	public void showInfo() {
		System.out.println("name :" + name);
		System.out.println("price :" + price);
	}
	
}
