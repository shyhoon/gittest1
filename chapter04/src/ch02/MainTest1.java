package ch02;

import java.util.Scanner;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		MyComponents mc = new MyComponents();
		
		System.out.println("���ڸ� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String userInput =  scanner.nextLine(); // nextLine�� ���͸�ġ�� ���ڸ� �Է¹ް��ϴ°�
		
//		System.out.println(userInput);
		
		mc.textField.setText(userInput); // textField Ŭ�����ȿ� setText�� �޼��尡�ִ�
		
	}
	
	// nullpointexception�ϰ�� �ΰ����� ����
	// 1. ��ü�� ���� ���ؼ�
	// 2. ������ ��ü �ּҸ� �ȳ־��༭
	
	
	
	
	
	
	
	
	
	
}
