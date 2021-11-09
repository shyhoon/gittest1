package ch01;

public class ThreadTest1 {

	//메인 함수 <-- 메인 쓰레드(내가 잦ㄱ성한걸 작동시키는)
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(500); // static메서드 ,500분의 1초란뜻 = 0.5초동안 잠들고 다시 for문동작 하는걸 반복
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end of for
		
		
		
	}//end of main
}// end of class
//프로세스란 크롬이나 그림판 같은 프로그램을 실행키면 ram공간에 올라가는걸 뜻함 
// 각각의 작업 하나의 단위를 쓰레드라고 한다
// 멀티 쓰레드란 여러 쓰레드로 다중작업을 하는것
// cpu에서는 한번의 작업만 가능하므로 쓰레드가 여러개면 한번에 작업이 이뤄지는게 아닌 왔다갔다하며 작업을한다