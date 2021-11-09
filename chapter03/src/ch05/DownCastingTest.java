package ch05;

public class DownCastingTest {

	public static void main(String[] args) {
		
		//1. Banana에만 origin 멤버 변수를 추가하고 Fruit에는 추가 안한상태
		
		Fruit fruit = new Banana("바나나",500,100,"태국");

		String origin = ((Banana)fruit).origin;
		System.out.println("원산지 : "+ origin);
		
//		2. Banana와 Fruit에 origin 멤버변수를 추가
		String origin0 = fruit.origin; 
		System.out.println(origin0); // <- origin0 = null why??
		

		
		
	}// end o f main
	
	
}// end of class
// 다운 캐스팅을 사용한다면 가능 
// 업케스팅 -> 다운캐스팅(컴파일러에게 자식 객체 타입으로 바라 보라고 명시 형변환)

//System.out.println(fruit.origin);          // <==왜 null이 나오는거지 시스아웃으로 런타임실행되면 바나나 쪽을 먼저 확인하게 되는것 아닌가?
// 컴파일러는 부모타입 인스턴스 변수 타입을 바라보고 있는 상태
// 작성자는 바나나가 생성될걸 알지만 컴퓨터는 fruit.만 쳤을때는 Fruit타입
// heap영역에 부모 타입으로 인스턴스 변수에 자식이 생성된건데 컴파일러는 변수 타입을 부모타입으로만 인식한다 
//따라서 컴파일러에게 객체의 타입으로 바라보라고 해줘야지 객체타입의 변수에 접근 가능 
// 보류 멤버변수는 컴파일 시점에 실행되어 컴파일러가 변수의 데이터타입을 확인하지만 (멤버변수는 컴파일 시점에 타입을 확인 )
// 보류 메서드는 런타임 시점에 실행되어 컴파일러가 변수에 넣어주는 객체의 입장에서 먼저 메서드를 확인하여 실행된다. (자식쪽의 메서드가 없다면 부모쪽을 실행시키게된다
