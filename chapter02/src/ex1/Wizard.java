package ex1;

public class Wizard {

	// 멤버 변수
	// hp , power ,  name
	int 	hp;
	int 	power;
	String 	name;
	String 	skill;
	int level;
	// 생성자도 만들어 주세요
	public Wizard (int hp, int power, String name,String skill,int level) {
		this.hp 	= hp;
		this.power 	= power;
		this.name 	= name;
		this.skill 	= skill;
		this.level 	= level;
	}
	// 메서드
	public void hunt(Warrior warrior) {
		warrior.hurt(power);
		System.out.println(name+"가 "+skill+"을 사용하여 "+power+"의 데미지를 "+warrior+"에게 가했습니다.");
		System.out.println(warrior+"가 "+power+" 의 피해를 입었습니다.");
		 level++;
	}
	public void hurt(int damage ) {
	 this.hp -= damage;

	}
	public void showInfo() {
		System.out.println(name+"의 hp : "+hp+" level : "+level+" power : "+power+"입니다." );
	}
	// 전사를 공격 한다.
	// 상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요
	// 최대한 만잏 연습
}
