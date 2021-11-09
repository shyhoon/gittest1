package ch03;

public class WarriorMainTest {

	public static void main(String[] args) {
		
		// 직접 코드를 실행 시켜 주세요.
		
		Warrior warrior1= new Warrior();
		/* 변수 이름을result를 하지말아야하는 이유는 객체의 이름으로 연관성이없다*/ 
		warrior1.name = "뚠따따";
		warrior1.power = 500;
		warrior1.species = "오크";
		warrior1.weapon = "오함마";
		
		warrior1.warriorCondition();
		
//		int warrior1 = warriorda
		
		
	}
	
}
