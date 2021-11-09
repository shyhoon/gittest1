package ch03;

public class Car {

	String name;
	int price;
	// 포함관계 has a관계 // 상속관계는 편리하긴 하지만 정확한 oop개념으로 설계해야한다.
	// 객체간의 현실에서의 관계를 생각했을때 상속관계는 맞지 않기때문에 상속으로 만들면안된다
	Engine engine;
	
	
	public Car(String name , int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 500); // 실제로 객체를 만들어 주지 않으면 나중에 엔진의 메서드를 사용할때 오류난다
	}
	
	public void showInfo() {
		System.out.println("name :" + name);
		System.out.println("price :" + price);
	}
	
}
