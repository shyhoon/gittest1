package ch06;

public class Student {
	int studentId;
	String studentName;
	// 우리가 설계한 클래스를 참조 타입(데이터 타입)으로 사용한다.
	Subject subject;
	//Subject korea;
	//Subject math; //설계한 클래스를 참조 타입으로 사용하여 변수를 선언(객체의 상태를 선언)
	 
	//생성자
	public Student (int id, String name,String subjectName1,int score1,String subjectName2,int score2) {
		studentId = id;
		studentName = name;
		
		// ?? 참조 타입은 생성을 해야 사용할 수 있다.
		// 메모리에 존재 하게 만들어야 한다.
		subject = new Subject(subjectName1, score1,subjectName2,score2); // Subject의 클래스에 생성자를 지정하지 않아서 기본생성자로 나온다
//		korea = new Subject();
//		math = new Subject(); //생성자 안에 넣는것과 클래스 전체에 적용되는것과 효율면에서 
		                      //어떤 차이가 있나?
	}
	// 정보를 입력 받는 메서드 생성(국어 과목에 대한 정보 셋팅)
	/*public void setKoreaSubject(String name , int score) {
		korea.subjectName = name;
		korea.score	 = score;
	}
	// (수학 과목에 대한 정보 셋팅)
	public void setMathSubject(String name , int score) {
		math.subjectName = name;
		math.score =  score;
	}*/
	// 학생의 총점을 화면에 출력하는 기능 만들기
	public void showStudentScore() {
//		int total = korea.score + math.score;
//		System.out.println(studentName + "학생의 총점은 " + total + " 입니다.");
		int total = subject.score1 + subject.score2;
		System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
	}
	public static void main(String[] args) {
		
		Student Lee = new Student(1, "Lee", "국어", 80, "수학", 50) ;
		Lee.showStudentScore();
		Student Kim = new Student(2, "Kim", "국어", 100, "수학", 70);
		Kim.showStudentScore();
	}
}
