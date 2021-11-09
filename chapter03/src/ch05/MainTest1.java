package ch05;

public class MainTest1 {
	public static void main(String[] args) {
		
		Banana banana = new Banana("바나나",500,100,"태국");
		Peach peach = new Peach("복숭아",500,100);
		
			banana.showInfo();
			peach.showInfo();
			
			// 자바에서 다형성이란 
			// 부모 타입 인스턴스 변수에 자식 객체를 생성할 수 있다
			Fruit fruit = new Banana("바나나",500,100,"태국"); // 업 캐스팅  fruit의 주소는 바나나인데
			// 상속구조가 아니면 사용할 수 없다.
			// 부모 자식 관계에서 사용 가능하다.
			// 현실에서 바나나 = 과일은 성립하지만 과일=바나나는 성립하지 않는다와 똑같다고 보면된다.
			
			// 그 역은 성립하지 않는다.
			// 즉 자식 인스턴스 변수에 (참조변수) 부모 인스턴스를 생성 시킬 수 없다.
//			Banana banna2 = new Fruit(); 
	}
}
