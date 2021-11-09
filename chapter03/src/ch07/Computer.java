package ch07;

public abstract class Computer { // abstract키워드가 있으면 추상 클래스

	// 추상 메서드(몸체가 없다
	public abstract void display(); // 메서드의 선언부,시그니처
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
			
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
// 부모클래스가 추상 클래스이고 자식클래스가 일반 클래스이면
// 일반 클래스를 abstract키워드(강제성이 있다)를 사용하여 추상클래스로 만들어주거나
// 추상메서드를 일반 메서드로 재정의 해주거나 해야한다
// 추상클래스의 사용 요령
// 추상클래스를 쓰는 사람입장(객체의 특성)에 맞춰서 추상메서드를 무조건 구현하여 쓰도록 한다
// ex.스마트폰이라는 부모 클래스가 있고 자식 클래스의 아이폰,삼성폰이 있다면 
// 스마트폰의 기본 특성을 추상메서드로 하여 자식 클래스에서 추상메서드를 무조건 구현하도록 하는것 

// 