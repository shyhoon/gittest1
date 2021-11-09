package ch01;

//설계된 학생 클래스를 사용해보는 입장.
public class StudentMaintest1 {
//메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		Student s1;
		Student s2;
		// 스택영역에만 만들어진것 
		s1 = new Student();
		//여기까지는 힙영역에 s1(객체)하나만 만들어진것 s2는 안만들어짐
		s2 = new Student();
		// 이제 2개가 생성
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}//end of main
	
}//end of class
