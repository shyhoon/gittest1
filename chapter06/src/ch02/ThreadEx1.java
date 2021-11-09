package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true; 												// flag변수 개념 . 어떤 실행에 깃발을 꼿는다

	@Override
	public void run() {

		while (flag) {
			System.out.print("-");

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}// end of run
}// end of class

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println("작업자를 생성 하겠습니다.");
		
		MyThread1 thread1 = new MyThread1();				// main스레드가 실행되어 새로운 작업자를 만들고 새로만든 작업자도 실행
		thread1.start();

		System.out.println("0번을 입력하면 중지합니다.");
		Scanner scanner = new Scanner(System.in);
//		int userInput = scanner.nextInt();
//		do { 												// 처음 userInput한값으로 do while문 안에서 계속 무한반복이된다
//			if (userInput == 0) {
//				thread1.flag = false;
//			}
//		} while (userInput != 0);

		int input;
		do {
			 input= scanner.nextInt();
			if (input == 0) {
				thread1.flag=false;
			}
		} while (input != 0);
	}
}


//이런식염 ㄴ프로그램 무한 수행이라 컴터가 뻗는다
// 문제 3.
// do while 사용해서 한번 잘못입력해도 다시 입력하면 멈출 수 있게
// 코드를 어케짤지 모르면 분할앤정복방식으로 먼저 써보기
// 1. do while 사용방법
// 2. do 안에 어떤 코드가 들어갈지 생각해서 작성
// 3. while 문에 조건식을 구현

//if(userInput==0) {
//thread1.stop();// 선그어진건 deprecated(더이상 유지 보수 하지 않음) 언젠간 사라질 수있는 녀석 왠만해서 ㄴ사용하짐 ㅏㄹ라는 뜻
//				// .stop()은쓰레드를 멈추게하는 역할
//thread1.flag = false; // 따라서 .stop을 안쓰고 다른 방법을 쓴것
//}