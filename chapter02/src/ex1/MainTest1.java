package ex1;

public class MainTest1 {

	public static void main(String[] args) {
		// 프로그램 실행 흐름을 만들어 보세요. 만든 클래스로 프로그램 실행
		
		Warrior w1 = new Warrior(1000,100,"울라프","도끼 던지기",1);
		Wizard m1 = new Wizard(500, 300, "카서스"	, "진혼곡",1);
		
		w1.hunt(m1);
		m1.hunt(w1);
	
		w1.showInfo();
		m1.showInfo();
	}
}
