package ch05;

import java.util.Scanner;

public class WhileMainTest4 {
//�����Լ�
	public static void main(String[] args) {
		
		//����ڰ� 0�� �Է��ϸ� ���α׷��� ���� ���Ѷ�
		//����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ������Ѷ�
		
		
		
		// do ~ while
		// ��ĳ�ʸ� ��� �ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ������ ���ּ���.
		// ���꿡 ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���.
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int num1;
		do { 

			//			System.out.println("���簪 : " + num1);
			System.out.println("���ڸ� �Է����ּ���");
			num1 = scanner.nextInt();
			sum += num1;
			
		} while (num1 != 0);
			
			System.out.println("������ ����� : " +sum+ "�Դϴ�.");
		
			// ȸ���� ������ ���
			
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println("���ڸ� �Է����ּ���");
//			num1 = scanner.nextInt();
//		sum += num1;
//			
//		}
//		System.out.println("������ ����� : " +sum+ "�Դϴ�.");
		
		
		
	}//end of main
	
}//end of class
