package ch04;

public class Hero {

	String name;
	int hp;
	
	public Hero (String name,int hp) {
		this.name = name;
		this.hp = hp;
		
	}
	public void attack(String name) {
		System.out.println("기본 공격");
	}
	
}
