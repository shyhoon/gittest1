package ch06;

public class Student {
	int studentId;
	String studentName;
	// �츮�� ������ Ŭ������ ���� Ÿ��(������ Ÿ��)���� ����Ѵ�.
	Subject subject;
	//Subject korea;
	//Subject math; //������ Ŭ������ ���� Ÿ������ ����Ͽ� ������ ����(��ü�� ���¸� ����)
	 
	//������
	public Student (int id, String name,String subjectName1,int score1,String subjectName2,int score2) {
		studentId = id;
		studentName = name;
		
		// ?? ���� Ÿ���� ������ �ؾ� ����� �� �ִ�.
		// �޸𸮿� ���� �ϰ� ������ �Ѵ�.
		subject = new Subject(subjectName1, score1,subjectName2,score2); // Subject�� Ŭ������ �����ڸ� �������� �ʾƼ� �⺻�����ڷ� ���´�
//		korea = new Subject();
//		math = new Subject(); //������ �ȿ� �ִ°Ͱ� Ŭ���� ��ü�� ����Ǵ°Ͱ� ȿ���鿡�� 
		                      //� ���̰� �ֳ�?
	}
	// ������ �Է� �޴� �޼��� ����(���� ���� ���� ���� ����)
	/*public void setKoreaSubject(String name , int score) {
		korea.subjectName = name;
		korea.score	 = score;
	}
	// (���� ���� ���� ���� ����)
	public void setMathSubject(String name , int score) {
		math.subjectName = name;
		math.score =  score;
	}*/
	// �л��� ������ ȭ�鿡 ����ϴ� ��� �����
	public void showStudentScore() {
//		int total = korea.score + math.score;
//		System.out.println(studentName + "�л��� ������ " + total + " �Դϴ�.");
		int total = subject.score1 + subject.score2;
		System.out.println(studentName + "�л��� ������ " + total + "�Դϴ�.");
	}
	public static void main(String[] args) {
		
		Student Lee = new Student(1, "Lee", "����", 80, "����", 50) ;
		Lee.showStudentScore();
		Student Kim = new Student(2, "Kim", "����", 100, "����", 70);
		Kim.showStudentScore();
	}
}
