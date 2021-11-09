package ch01;


class MyThread3 extends Thread{
	
	@Override
	public void run() { // 쓰레드가 해야할 일을 적는 메서드
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread()); //.currentThread()는 현재 작동하는 쓰레드가 누구인가 알려주는 역할
		}
		
		
	}
	
	
	
}




public class ThreadTest3 {
	
	// 메인 쓰레드
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		// 작업자 3명 생성
		
		MyThread3 thread3 = new MyThread3();
		MyThread3 thread4 = new MyThread3();
		MyThread3 thread5 = new MyThread3();
		
		// 작업을 시작 시켜 주세요
		thread3.start();
		thread4.start();
		thread5.run();
		
		
	}// end of main
}// end of class
