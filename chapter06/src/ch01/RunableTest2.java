 package ch01;

import javax.swing.JFrame;

class MyRunable2 extends JFrame{
	
	int grade= 10;
	
	public MyRunable2() {
//		runable.run(); // .strat가 안되는 이유는 Thread를 상속받지 않아서 
		
	}
	
	// 자바 문법
	// 구현객체
	Runnable runable = new Runnable() { // Runnable이 
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // end of for
			
		}// end o run
	};
	
	
}





public class RunableTest2 {

	public static void main(String[] args) {
	
		MyRunable2 myRunable2 = new MyRunable2();
		// 문제 1. 객체 생성과 동시에 run메서드를 실행 시켜 주세요.	(run메서드를 내부에서 실행)
		// 문제 2. 외부에서 run메서드 동작 시켜 주세요.			(run메서드를 외부에서 실행)
		myRunable2.runable.run();
		
	}
}// end of class
