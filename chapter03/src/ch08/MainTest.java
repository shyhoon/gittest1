package ch08;

public class MainTest {
public static void main(String[] args) {
	
	Unit marine1 = new Marine("마린1");
	Unit zealot1 = new Zealot("질럿1");
	Unit zergling1 = new Zergling("저글링1");

	marine1.showInfo();
	zealot1.showInfo();
	zergling1.showInfo();
	
	zealot1.attack(marine1);
	zealot1.attack(marine1);
	zealot1.attack(marine1);
	marine1.showInfo();
}
}
