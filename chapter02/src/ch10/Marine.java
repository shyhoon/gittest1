package ch10;

public class Marine {
	
	private int power;
	private int hp;
	private String name;
	
	public Marine(String name) {
		this.name 	= 	name;
		this.power	= 	5;
		this.hp		=	100;
		
	}
	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름: "		+ this.name);
		System.out.println("=========");
		System.out.println("공격력: "	+ this.power);
		System.out.println("체력: " 	+ this.hp);
	}
	// 공격 당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
//		if( (this.hp != 0) || (this.hp < 0) ) {
//			System.out.println("마린이 죽었습니다.");
//		}
		if (this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp=0;
		}
	}
	/*
	//1. 마리니 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zealot.beAttacked(power);
	}
	//2. 마린이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		String targetName = zergling.getName();// 멤버변수 name이 private라서 public으로 접근해줘야한다 따라서 get메서드사용
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zergling.beAttacked(power);
	}
	*/
	//getName
	
	public String getName() {// 멤버변수 name이 private라서 public으로 접근해줘야한다 따라서 get메서드사용
		return name;
	}
	//1. 메서드 오버로딩을 사용해 보자 2개
	public void attack (Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zealot.beAttacked(power);
	}
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "이(가)" + targetName+ "을 공격합니다.");
		zergling.beAttacked(power);
	}
	
	
	
}
