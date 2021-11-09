package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		// 자동차를 생성해서 showInfo호출해 주세요
		
		Car car1 = new Car("제네시스", 5500);
		car1.showInfo();
		
		// 엔진의 정보를 출력해주세요
		System.out.println(car1.engine=new Engine("불스", 500));
		car1.engine.showInfo();
		
		
	}
}
