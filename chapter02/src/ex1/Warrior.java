package ex1;

public class Warrior {
	// 멤버 변수
	// hp , power , name
	int hp;
	int power;
	String name;
	String skill;
	int level;
	// 생성자도 만들어 주세요
	public Warrior(int hp, int power, String name, String skill,int level) {
		this.hp		= hp;
		this.power	= power;
		this.name 	= name;
		this.skill 	= skill;
		this.level	= level;
	}
	// 메서드
	public void hunt(Wizard wizard) {
		wizard.hurt(power);
		System.out.println(name+"가 "+skill+"을 사용하여 "+power+"의 데미지를 "+wizard.name+"에게 가했습니다.");
		System.out.println(wizard.name+"가 "+power+" 의 피해를 입었습니다.");
		level++;
	}
	public void hurt(int damage) {
		this.hp -= damage;
		
	}
	public void showInfo() {
		System.out.println(name+"의 hp : "+hp+" level : "+level+" power : "+power+"입니다." );
	}
	// 마법사를 공격 한다. 객체와 객체상호작용하게도 해보기
	// 상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요

}
