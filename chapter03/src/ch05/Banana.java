package ch05;

public class Banana extends Fruit{ 


	public Banana(String name, int price, int fresh, String origin) {
		super(name, price, fresh);
		this.origin = origin;
	}

	String origin;

	
//	public Banana() {                //<== 상속을 할대는 생성자 오버로딩이 안되나?
//		name = "바나나";
//		price =  3000;
//		fresh = 100;
//		origin = "태국";
//	}
//	
	
}
