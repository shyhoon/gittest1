package ch09;

public class EmployeeMainTest {
// 메인함수 (코드의 시작점
	public static void main(String[] args) {
		
		int temp = Employee.getSerialNum(); // static 메서드 - 객체가 생성하기 전에 사용 가능 
		System.out.println(temp);
		
//		Employee test1; = new Employee();
//		test1.getEmployeeId(); //<--일반 메서드, new라는 키워드를 사용하여 객체를 생성하기전까지는 이렇게 사용 할 수 없다. 
//		
		
		
		
		
		
		Employee employee1 =  new Employee();
		System.out.println(employee1.serialNum);
		System.out.println(employee1.getEmployeeId());
		
		Employee employee2 =  new Employee();
		Employee employee3 =  new Employee();
		Employee employee4 =  new Employee();
		Employee employee5 =  new Employee();
		
		System.out.println(employee5.getEmployeeId());
		
		System.out.println(employee5.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);
		System.out.println(employee4.serialNum);
		// serialNume 을 다같이 공유하기때문에 다 같은 값을 가진다.
		// 멤버변수와 static변수는 다르다. employeeId와 serialNum은 다르다.
		System.out.println(employee3.getEmployeeId());
		System.out.println(employee3.getSerialNum());
		
		// static  변수, 멤버 변수 ,지역 변수 --> 메모리 위치 확인(메모리 위치가 각자 다르다
		
		// employee1 ~ 5 : 인스턴스 변수로 접근해서 getSerialNum() 실행
		employee1.getSerialNum();
		employee2.getSerialNum();
		employee3.getSerialNum();
		employee4.getSerialNum();
		employee5.getSerialNum();
		// 클래스 이름으로 접근해서 getSerialNum() 메서드 사용 
		Employee.getSerialNum();
		
		
	
	}// end of main
	
}// end of class
