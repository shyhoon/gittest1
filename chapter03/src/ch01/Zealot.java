package ch01;

public class Zealot {
	
	private int power;
	private int hp;
	private String name;
	
	public Zealot(String name) {
		this.name 	= name;
		this.power 	= 10;
		this.hp 		= 100;
	}
	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름: "		+ this.name);
		System.out.println("=========");
		System.out.println("공격력: "	+ this.power);
		System.out.println("체력: "		+ this.hp);
	}

	public void beAttacked(int power) {
		this.hp -= power;
		if( (this.hp != 0) || (this.hp < 0) ) {
			System.out.println("질럿이 죽었습니다.");
		}
		

	}
	/*// 공격 합니다 -> 질럿이 마린을 공격하는 동작
	// 다른 객체와 상호작용 - 메서드로 참조  변수 전달
	public void attackMarine (Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		marine.beAttacked(this.power);
	}
	public void attackZergling (Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zergling.beAttacked(power);
	}
*/
	public String getName() {
		return name;
	}
	
	
	// 메서드 오버로딩을 사용해 보자
	// 메서드 이름이 같아도 컴파일러는 메서드 이름과 매개변수의 이름,개수를 확인하여 같은 이름이어도 구분한다
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		marine.beAttacked(this.power);
	}
	
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zergling.beAttacked(power);
	}
	
	
	
	
}
