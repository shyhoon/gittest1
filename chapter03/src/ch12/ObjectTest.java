package ch12;

import java.lang.*;
//���� ����ϴ� �⺻ Ŭ������ ���� ��Ű��
//���α׷��ֽ� import���� �ʾƵ� �ڵ����� import��
//.*�� ���θ� �����Ѵٴ°� ����
// ������Ʈ�� java.lang�Ѵ� ���α׷��������ʾƵ� �ڵ����� ����ȴ�
// ������Ʈ�� java.lang�� �����ִ°�

class Student extends Object{
	
	@Override
	public String toString() { // toString�޼��� ������
		return "�л�Ŭ����";
	}
}
public class ObjectTest extends Object{

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1); 
		System.out.println(System.identityHashCode(s1));
		//--> ������ �ּҰ��� �������� toString�� ������ �߱⿡ "�л�Ŭ����" ��� ���´�
		// ���� �ּҰ� : 733957003
		
		String str2 = new String("�ȳ��ϼ���");
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		//--> ������ �ּҰ��� �������� String�� �׻� toString�� �����ǵ��ֱ⿡ "�ȳ��ϼ��䰡"���´�
		// --> ���� �ּҰ� 22429093

	}// end of main
	
}
