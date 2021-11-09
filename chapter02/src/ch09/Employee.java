package ch09;

public class Employee {

	public static int serialNum = 1000; // seraiNum은 static 변수 잠시  class 의 공간을 빌린것
	
	private int employeeId; // employeeId 멤버변수
	private String employeeName;
	private String department;
	
	public Employee() {                           // ctrl space누르면 기본생성자 만들수 이"ㅆ는 단축키다
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	// static 메서드 활용
	public static int getSerialNum() {        // static 메서드는 new라는 키워드를 쓰기 전에 미리 사용가능하다.
		//주의 : static메서드 안에서는 멤버 변수(=인스턴스 변수)를 사용할 수 없다. -> 객체가 생성되기전에 생성할 객체의 변수 값을 지정은 
		// why? : static은 객체가 메모리에 만들어지기 전에 클래스 이름으로 접근해서 사용할 수 있다 ex. Employee.getSerialNum();
		// 객체가 생성되기 전에 실행될 수 있는 메서드
		// 따라서 static 메서드 안에서는 static변수만 사용가능하다
		// 태양처럼 미리 떠있는 녀석
		// 클래스는 new를 사용하여 만들어줘야지 사용가능하다
		// static 메서드 안에서 변수는 static변수만 사용 가능
//		department = "개발팀";
		return serialNum;
		
	} 
	
}
