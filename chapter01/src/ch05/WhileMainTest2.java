package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
	// ����� �Ẹ��
		
		final int VALUE = 100;
		int num1 = 1;
		int sum1 = 0;
		
		while(num1 <= VALUE ) {
			sum1 = sum1 + num1;
			num1++;
		}
		System.out.println("����� :" + sum1);
		
		
		
		System.out.println("---------------------------------------------");
		
		// ����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 ������ �ּ���.
//		System.out.println("������ �Է��� �ּ���: ");
//		Scanner scanner = new Scanner(System.in);
//		int point = scanner.nextInt();
	
		System.out.println("���� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		
		
		final int LIMIT_VALUE1 = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE1) {
			
			sum = sum + num;
			num++;
			
		}
		System.out.println("����� :" + sum);
		
	}
}
