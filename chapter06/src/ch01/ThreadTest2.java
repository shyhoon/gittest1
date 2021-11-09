package ch01;

class MyThreadEx2 extends Thread{							// Thread도 java.lang패키지에 있어서 따로 import안해도 사용가능
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
		System.out.println(Thread.currentThread());
	}
	
	@Override
	public void run() {								   	
		int i;
		for ( i = 0; i < 50; i++) {
			
			System.out.println(name+ ":" + i + "\t"); 	
			
			try {												// 대부분 해야하는예외처리는 자바에서 알려준다
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}// end of run
	
}// end of MyThreadEx2

public class ThreadTest2 {
	// 메인 쓰레드(=메인함수)(얘도 작업자)
	public static void main(String[] args) {					// 메서드는 위에서부터 아래로 흐름진행
		
		System.out.println(Thread.currentThread());				// static메서드라 클래스이름으로접근
		System.out.println("메인쓰레드 시작");
		
		MyThreadEx2 th1 = new MyThreadEx2("작업자 1");			// 작업자가 두명이라 따로따로 실행
		th1.start();  											// 쓰레드에 작업을 시작하는 명령어

//		for (int i = 0; i < 50; i++) {
//			System.out.println("test :" + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} //0.2
//		}

		System.out.println("메인 쓰레드 종료");  
		
	}// end of main
	
}// end of class
// 하나의 더 작업자를 만들기 위해선 쓰레드를 상속
// 그 다른 작업자가 수행할거는  run메서드에서 작성한다
// 여러 쓰레드의 작업 우선순위를 정할 수 있다 그냥 이런 개념이 있다고만 생각 , 이걸 활용해서 뭔갈 하진 않는다
// 쓰레드에 우선순위를 줄 수 있다 우선순위는 0~10까지 숫자가 높을 수 록 우선순위가 높다 main스레드는 우선순위가 5


//쓰레드를 사용방법 
//작업자를 만들기 위해서는 Thread를 상속한다
//할일을 run이라는 메서드에 작성한다
//약속(쓰레드 작업자를 요청해서 어떠한 일을 시킬때는 run이란 메서드를 사용 현재메서드가 누구인지 찌기어주는 녀석 , 

//MyThreadEx2 th2 = new MyThreadEx2("작업자2");				//작업자 또 생성
//th2.start();
//
//MyThreadEx2 th3 = new MyThreadEx2("작업자3");
//th3.start();
//