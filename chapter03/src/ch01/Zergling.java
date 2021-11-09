package ch01;

public class Zergling {

	private int power;
	private int hp;
	private String name;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름: " + this.name);
		System.out.println("=========");
		System.out.println("공격력: " + this.power);
		System.out.println("체력: " + this.hp);
	}

	public void beAttacked(int power) {
		this.hp -= power;
		if ( (this.hp != 0) || (this.hp < 0) ) {
			System.out.println("저글링이 죽었습니다.");
		} 

	}
	/*
	// 1. 저글링이 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zealot.beAttacked(power);
	}

	// 2. 저글링이 마린을 공격합니다.
	public void attackMarine(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		marine.beAttacked(power);
	}
	*/
	public String getName() {
		return name;
	}
	
	//1. 메서드 오버로딩을 사용해 보자 2개
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		marine.beAttacked(power);
	}
	
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zealot.beAttacked(power);
	}
}
