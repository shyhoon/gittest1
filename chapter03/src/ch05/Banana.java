package ch05;

public class Banana extends Fruit{ 


	public Banana(String name, int price, int fresh, String origin) {
		super(name, price, fresh);
		this.origin = origin;
	}

	String origin;

	
//	public Banana() {                //<== ����� �Ҵ�� ������ �����ε��� �ȵǳ�?
//		name = "�ٳ���";
//		price =  3000;
//		fresh = 100;
//		origin = "�±�";
//	}
//	
	
}
