package ch09;

	// 인터페이스를 구현(implements)하는 방법 인터페이스도 강제성이 있다
	public class Refrigerator extends HomeAppliances implements RemoteController,SoundEffect {
	// 자바에서는 단일 상속만 되어 하나의 추상클래스만 "상속" 받을 수 있지만 인터페이스는 여러개를 ,사용하여"구현"할수있다.	
	// 자바에서는 하나의 클래스에 상속은 한번만 가능하기때문에 인터페이스를 같이 사용 

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
	}

	@Override
	public void notification() {
		System.out.println("띠리리링~~");
	}

}
