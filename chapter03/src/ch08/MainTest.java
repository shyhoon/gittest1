package ch08;

public class MainTest {
public static void main(String[] args) {
	
	Unit marine1 = new Marine("����1");
	Unit zealot1 = new Zealot("����1");
	Unit zergling1 = new Zergling("���۸�1");

	marine1.showInfo();
	zealot1.showInfo();
	zergling1.showInfo();
	
	zealot1.attack(marine1);
	zealot1.attack(marine1);
	zealot1.attack(marine1);
	marine1.showInfo();
}
}
