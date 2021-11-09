package ch08;

public abstract class Unit {

	protected int power; 
	protected int hp;
	protected String name;


	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름: " + this.name);
		System.out.println("=========");
		System.out.println("공격력: " + this.power);
		System.out.println("체력: " + this.hp);
	}

	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(this.name + "이(가)" + targetName + "을 공격합니다.");
		unit.beAttacked(power);
	}
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "이 죽었습니다.");
			this.hp = 0;
		}

	}
	public String getName() {
		return this.name;
	}
}
// protected 접근지시제어자를 사용하면 해당 클래스를 상속받는 클래스는 멤버 변수에 접근 가능하다 