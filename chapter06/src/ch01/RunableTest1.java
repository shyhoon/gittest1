package ch01;

import javax.swing.JFrame;

// Runnable인터페이스를 구현하여 Thread 사용
class MyRunable1 extends JFrame implements Runnable { // Runnable 인터페이스를 활용해서 쓰레드를 만들수도 있다
														
	@Override
	public void run() {

		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");				// tab간격만큼 띄어주는녀석
		}
	}

}

public class RunableTest1 {
	// 메인쓰레드 
	public static void main(String[] args) {
		
		MyRunable1 myRunable1 = new MyRunable1(); 
		
		// Runable 구현한 객체는 Thread를 생성해서 매개변수에 담고 쓰레드를 시작한다.
		Thread thread1 = new Thread(myRunable1);
		thread1.start();

		Thread thread2 = new Thread(myRunable1);
		thread2.start();

	}
}
