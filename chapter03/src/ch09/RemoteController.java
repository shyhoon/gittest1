package ch09;

public interface  RemoteController { 


	
	public static final int SERIAL_NUMBER = 1000; 
	int SERIAL_NUMBER1 = 1000; 

	public abstract void turnOn();
	void turnOff();

}

// 인터페이스 장점
// 표준화 가능 하다.
// 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
// 클래스간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다.

// 정리 
// 객체 지향 패러다임 핵심 
// 객체와 객체간에 상호협력해서 코드를 설계해 나간다(버스,질럿,)
// 객체와 객체간에 관계를 정의하여 코드를 설계해 나간다
// (상속, 포함관계 , 추상클래스, 인터페이스)
// 다형성(클래스를 다양한 형태로 바라볼 수 있다)! 

// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
// 멤버 변수, 일반 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을 멤버로 가질 수 있다
// 
// 중요 중요 인터페이스는 표준, 약속, 규칙 입니다.-->추상 클래스보다 추상화가 더 높다
// 추상클래스에서 추상메서드를 쓸때는 무조건 abstract를 써야하고 인터페이스에서는 오로지 추상메서드만 가지니까 생략이 가능

// 사용방법
// class  대신 interface라는 키워드를 사용 한다.
// class와 같이 public이나 default를 사용할 수 있다.
// default는 같은 패키지에서만 사용가능
// public은 같은 챕터에서 가능
//인터페이스도 데이터 타입으로 사용할 수 있다

// 제약 사항 // 배우면서 기본적인 문법이나 암기는 필요하다 암기하자 
// 모든 멤버 변수는 public static final 이어야 한다.
// 모든 메서드는 추상 클래스 이어야 하고 , public abstract 키워들 생략 할수도 있다