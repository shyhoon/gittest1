package ch08;

public class Person {

	// this ��
	// 1.�ν��Ͻ�(�޸𸮿� �ö� ���� )(��ü) �ڽſ� �޸𸮸� ����Ų��.
	// 2. �����ڿ��� �� �ٸ� �����ڸ� ȣ���� �� ����� �� �ִ�.
	// 3. �ڽ��� �ּ� (������, �ּҰ�)�� ��ȯ ��ų �� �ִ�.
	
	 String name;//default ���� ����������
	 int age;
	 
	 public Person (String name , int age) {
		 //1. �ڱ� �ڽ��� ����Ű�� this
		 this.name =  name;
		 this.age =  age;
	 }
	 
	 public Person () {
		 // �⺻ �����ڿ��� �ٸ� �����ڸ� ȣ�� 
		 this("�̸�����", 1);
//		 this.name = "�̸�����";
//		 this.age = 1;
	 }

	 // �ڽ��� �ּҰ�(������)�� ��ȯ ��ų �� �ִ�.
	 // ���� �д��� ����� �� �� �ִ�.
	 public Person getPersion () { //���� ������ Ÿ���� Person ,�ڱ� �ڽ��� ��ȯ
		 return this;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 
	 public void showInfo() {
		 System.out.println("�̸� : "+ name + "���� : " + age);
	 }
	 
	 // main 
	 public static void main(String[] args) {
		Person person1 = new Person();
//		person1.showInfo();
		person1.setName("ȫ�浿");
		// �������� �޾Ƽ� �ٸ� �ν��Ͻ� ������ �ּҸ� �Ҵ��� ����.
		Person person2 =  person1.getPersion();
//		person2.showInfo();
		person2.setName("�̼���");
		
		System.out.println(person1);
		System.out.println(person2);

		person1.showInfo();
		person2.showInfo();
		
	}// end of main 
	 
	 
}//end of class
