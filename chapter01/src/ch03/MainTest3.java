package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		//����, ���� ������
		// ++ , --
		
		int num1 = 1;
		num1 ++;
		System.out.println(num1);
		
		int num2 = 1;
		num2--;
		System.out.println(num2);
		
		
		//1. ���� �����ڰ� �ڿ� �� ��� 
		int num3 = 10;
		int num4;
		
//		num4 = num3++; //���� num3 ���� ������ �������� num3�� 1����
		num4 = num3++;//num3���� ���� 1�������Ŀ� ������ ����
		
		System.out.println(num4);
		System.out.println(num3);
//		num3++ ������ ������ �ݷ��̳������� +1�̵Ǿ num4�� 10�̳����� num3�� 11�̳��´�
		//�����ݷ� �������� ������ ������ �ٸ����ִ� 
		
		
		int num5 = 100;
		int num6;
		
		//1. num5�� num6 ������ ��� �ּ���.
		//��. ���� �����ڸ� ����ؼ� num6 ������ 101�� ���� ���
		
		num6 = ++num5;
		System.out.println(num6);
		
		//2. num5�� num6 ������ ��� �ּ���.
		//��. ���� �����ڸ� ����ؼ� num6 ������ 101�� ���� ���
		
		
		num6 = num5++;
		System.out.println(num6);
		
		System.out.println(num5);
		
		//��� : ���� �����ڴ� ����(����)�� �ִ� ���� 1 ���� ��Ų��.
		// �� �տ� ���� ���� �ڿ� ���� �� ���꿡 ������ �ٸ���.
	}
}
