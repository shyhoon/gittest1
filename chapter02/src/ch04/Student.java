package ch04;

public class Student {

	// ������ - constructor(�����߱�)
	// ��ü�� �����Ҷ� ������ ���� ������� ������� �����ϴ� �� (������ �ο���)
	
	int number;
	String name;
	int grade;
	
	// �⺻ ������ 
	// ����� ���� ������ ���� ��쿡��
	// �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� �ڵ忡�־� ������ش�.
	
	public Student() {
		
		
	} // �⺻������ ���
	
	
	
	
	// ������ ����� (�����ڰ� ���� ����  - ����� ���� ������)  ���»�����忡�� ���Ѵ� �⺻�����ں���
	// grade �ְ� �ڵ带 ���� �����ϰ� �������ּ���.
	
	public /*�������� ������*/Student/*class�̸� �Ȱ��� �ۼ� */ (int num,String name , int grade){
		number = num;
		// �Ű�����(�������� )�̸��� ��� ���� �̸��� ���ٸ� ��ǻ�ʹ� ������ ���ؼ�
		//this. Ű���带 ����ؼ� ����������Ѵ�.
		this.name = name;
		this.grade = grade;
	}
	
	// �޼��� ����
	public void showInfo() {
		System.out.println(
				name + "�л��� �й��� " + number + "�Դϴ�."
				+ " \n�г��� " + grade + "�Դϴ�." // \n�� ���� �ٷ� �̵�
				);
	}
	
	
}
