package ch03;

class Cal {
	
	public int sum(int n1, int n2) {
		return n1+n2;
		
	}
	
	public int multiply (int n1, int n2) {
		
		
		
		return n1 * n2;
	}
	
}

class Cal2 extends Cal{
	
	public int minus(int n1,int n2) {
		return n1 - n2 ;
	}
	
	
	// 오버라이드 (부모에 있는 메서드를 필요에 의해서 재정의 해서 사용 하는 개념) 원래는 같은메서드 이름과 같은 매개변수면 사용이안되는데 상속에서는 가능 
	// 부모 클래스의 오버라이딩한 메서드는 사용되지 않고 자식에 재정의한 메서드만 사용된다
	/*public int multiply (int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마세요.");
		}
		return n1 * n2;
	}*/
	//부모 클래스에서 가져올 메서드 이름을 치고 ctrl space누르면 자동완성되고 super키워드생성
	@Override // @ 는 어노테이션 오버라이드라는걸 알려주는 키워드
	public int multiply(int n1, int n2) {
			System.out.println("multiply 메서드를 실행합니다.");
			return super.multiply(n1, n2);
		}
//		return super.multiply(n1, n2);// 부모클래스(super)에가서 multiply메서드를 호출하라는 명령어
		// super키워드
		//만약 부모클래스의 메서드가 양이 너무많다면 메서드를 다 작성할 필요없이그냥 super.으로 부모클래스에 들어가면된다
	}
	
	
	
	
	


public class MainTest2 {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiply(10, 0));
	
		
		
		
		
		
	}


}