package ch03;

import java.util.Scanner;

public class MainTest6 {
public static void main(String[] args) {
	// ���� ������ (�������� �����ְ� ���ϴ� �����ؼ� �� ������ )
	// ���ǽ� ? ���1 : ���2;
	
	int num1 = (5 > 3) ? 10 : 20;
	System.out.println(num1);
	
	int num2 = (5 < 3) ? 10 : 20;
	System.out.println(num2);
	
	//JDK ������� ������ �̿��� ���ô�.(Scanner-��� �Է°��� ���� �� �ְ����ִ� ����)
	int max; 
	System.out.println("�Է� ���� �� ���� ū ���� ��� �ϼ���.");
	Scanner scanner = new Scanner(System.in);// new��� ������ (Ű����)
	System.out.println("�Է� 1 : ");
	int x = scanner.nextInt();
	System.out.println("�Է� 2 : ");
	int y = scanner.nextInt();
	
	// ���� ������ ��
	max = ( x > y ) ? x : y;
	
	System.out.println("ū ���ڴ� : " + max + " �Դϴ�.");
	
}
}
