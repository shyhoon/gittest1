package ch07;

public abstract class Car {

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다");
	}

	public abstract void drive(); // 메서드의 선언부 {}는 구현부

	public abstract void stop();
	
	public abstract void wiper();
	
	// 후크(hook) 메서드 (필요하면 쓰는것 강제성이 없는것
	public void washCar() {
		
	}

	
	//핵심!! 추상메서드
	// 하위 클래스에서 재정의 할 수 없게 해야 한다. --> final키워드 활용 (마지막
	final public void run() { // 이제 하위클래스에선 run이란 메서드를 재정의 할 수 없다
		startCar();				// 이것으로 코드 실행의 흐름을 미리 정해줄 수 있다
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
// 추상클래스를 포함하고 있는 클래스는 추상클래스
//템플릿 메서드 패턴은 디자인 패턴중 하나
// 실행의 흐름을 만들어두고 중간중간에 비어있는 코드를 설계 -> 템플릿 메서드 패턴으로 프레임워크가 많이 짜여 있따
// 프레임워크란 실행의 흐름이 정해져있기때문에 그 안에서 코드를 써서 사용하는 것