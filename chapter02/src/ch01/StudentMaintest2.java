package ch01;

public class StudentMaintest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		// 1.�����ؼ� name, height, weight, grade
		// ���� �༭ ȭ�鿡 ������ּ���.
		
		student1. name= "ö��";
		student1. height= 180;
		student1. weight= 80;
		student1. grade= 17;
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		
		
		System.out.println("--------------");
		
		Student student2 = new Student();
		// 1.�����ؼ� name, height, weight, grade
				// ���� �༭ ȭ�鿡 ������ּ���.
		student2.grade = 18;
		student2.name = "����";
		student2.weight = 45;
		student2.height = 165;
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
	}//end of main
	
}//end of class
