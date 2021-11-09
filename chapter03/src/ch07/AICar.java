package ch07;

public class AICar extends Car{

	@Override // 추상메서드를 일반메서드로 재정의
	public void drive() {
		System.out.println("자율 주행 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}
	@Override
	public void stop() {
		System.out.println(" 스스로 멈춥니다.");
	}
	@Override
	public void wiper() {
		System.out.println("스스로 와이퍼 동작을 합니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("스스로 세차를 합니다. ");
	}
	
	
	
	
	
	
	
}
