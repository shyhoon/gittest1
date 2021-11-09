package ch02;

import java.util.Scanner;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		MyComponents mc = new MyComponents();
		
		System.out.println("글자를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String userInput =  scanner.nextLine(); // nextLine는 엔터를치면 글자를 입력받게하는것
		
//		System.out.println(userInput);
		
		mc.textField.setText(userInput); // textField 클래스안에 setText란 메서드가있다
		
	}
	
	// nullpointexception일경우 두가지를 생각
	// 1. 객체를 생성 안해서
	// 2. 변수에 객체 주소를 안넣어줘서
	
	
	
	
	
	
	
	
	
	
}
