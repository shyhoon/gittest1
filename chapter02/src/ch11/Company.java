package ch11;

public class Company {
	// 회사는 하나여야할때 
	//1 . 생성자를 private로 만든다.
	
	private Company() {
	}
//	Company sert = new Company();
	// 2. static 변수를 활용해서 내부에서 객체를 생성한다. 해처리 게이트웨이같은
	private  static Company instance = new Company();
	// 유일한 객체  instance를 만들어서 주소값을 담은 상태이고 생성자와 객체 모두 private상태라서 밖에서는
	// set메서드(public)를 만들어 주지 않는한 접근하지 못한다.
	
	// 3. 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드를 제공 해야 한다.
	public static Company getInstance() {
		// 방어적 코드 
		return instance;
	}// 객체를 생성하지 않아도 스태틱 메서드 사용 가능하다
} 
