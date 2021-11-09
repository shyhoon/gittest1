package ch04;

public class Student {

	// 생성자 - constructor(모양맞추기)
	// 객체를 생성할때 다음과 같은 모양으로 만들어라고 지시하는 것 (강제성 부여됨)
	
	int number;
	String name;
	int grade;
	
	// 기본 생성자 
	// 사용자 정의 생성자 없는 경우에는
	// 컴파일러가 알아서 기본 생성자를 코드에넣어 만들어준다.
	
	public Student() {
		
		
	} // 기본생성자 모양
	
	
	
	
	// 생성자 만들기 (개발자가 직접 정의  - 사용자 정의 생성자)  쓰는사람입장에서 편한다 기본생성자보다
	// grade 넣고 코드를 정상 동작하게 수정해주세요.
	
	public /*접근지시 제어자*/Student/*class이름 똑같이 작성 */ (int num,String name , int grade){
		number = num;
		// 매개변수(지역변수 )이름과 멤버 변수 이름이 같다면 컴퓨터는 구분을 못해서
		//this. 키워드를 사용해서 구분해줘야한다.
		this.name = name;
		this.grade = grade;
	}
	
	// 메서드 정의
	public void showInfo() {
		System.out.println(
				name + "학생의 학번은 " + number + "입니다."
				+ " \n학년은 " + grade + "입니다." // \n은 다음 줄로 이동
				);
	}
	
	
}
