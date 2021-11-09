package ch04;

public class Warrior extends Hero{ // 오류 누르면 자도 ㅇ해결
	
	public Warrior(String name, int hp) {
		super(name, hp); // 부모에 있는 것 호출 super = hero 에 있느 ㄴ생성자 
		// 상속받는 입장에서 super을 사용하여 생성자를 적어줘야지 부모클래스에 있는 생성자에 입력이된다.
	}

	public void comboAttack(){
		System.out.println("2단 공격!");
	}
}
// 상속구조를 만들때는 하위 클래스를 먼저 만들어놓고 상속구조를 만들어도 되게따 싶으면 만들어야지 먼저 만들면 나중에 다 수정해야할 수 있디