        package ch05;

import java.util.Scanner;

public class ContinueTest {

	
	public static void main(String[] args) {
		
		// ����� continue
		// �����ϰ� �����ϴ� continue
		
		int num1;
		int count1 = 0;
		
		for (num1 = 1; num1 < 11; num1++) {
			
			//3�� ����̸� ������� ���ÿ�.  ��� %3 == 0 --> 3�� ����� �� 3���� �������� �������� ���� ���̴ϱ�
			if(num1 %3 == 0) {
				count1++;
				continue;
				
			}
			System.out.println("��� �� : "+ num1);
		}
		System.out.println("��� �� : "+num1);
		System.out.println("3�� ����� ���� : " + count1);
		
		
		
	
		
		// ����� �����Ͽ� Ȱ�뼺�� ����������. ġȯ������ ���ؾ��Ѵ�.
		// ��ĳ�� �̿��ؼ� MAX ��, MULTIPLE�� �޾Ƽ�  ���α׷��� �ϼ��� �ּ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MAX �� �Է� :");
		final int MAX = sc.nextInt();
		System.out.println("����� �Է� : ");
		final int MULTIPLE = sc.nextInt();
		final int MIN = 21;
		
		int num;
		int count =  0;
		
		for (num = MIN; num < MAX; num++ ) {
			
		
			if (num % MULTIPLE == 0) {
				count++;
				continue;
				
			}//end of if
			
		}// end of for
		
		
		System.out.println(MULTIPLE + "�� ����� ���� : " + count);
		

		
		
	}//end of main
}// end of class
