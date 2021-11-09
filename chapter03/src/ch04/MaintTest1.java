package ch04;


public class MaintTest1 {
	
	public static void main(String[] args) {

	
	Warrior warrior1 = new Warrior("전사 ", 100);
	// heap영역에 워리어 안에 히어로도 같이 생성?
	//heap영역 안에 생긴 "Warrior타입 객체데이터 공간 안"에는 상속받은 Hero클래스의 데이터가 있는건가?
	Wizard wizard1 = new Wizard("마법사 ", 50);
	Archer archer1 = new Archer("궁수 ", 100);
	
	
	String name = warrior1.name; // hero
	int hp = warrior1.hp; // hero
	warrior1.attack("전사");// hero
 
	
	warrior1.comboAttack();// hero
	
	warrior1.comboAttack()	; //warrior

	}
}