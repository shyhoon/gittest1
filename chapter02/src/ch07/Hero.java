package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;
	
	// get
	public String getName() {
		return this.name; //그냥 name해도 괜ㅊ낳다
		
	}
	// set
	public void setName(String name) {
		//  방어적 코드 작성
		if (name == null || name == "" || name.length() < 2) {// 논리합,곱들은 두개이상도 사용가능
			System.out.println("잘못된 입력 입니다. 이름을 다시 작성해 주세요.");//jdk가만든String데이터 타입안에 length라는 메서드가 있다
		}else {
			this.name = name;
		}
	}
	
	//hp, defense , leve에 대한 get,set 메서드 만들어 주세욧
	// 메서드를 설계하는 코드 작성
	public int getHp() {
		return hp;
	}
	public double getDefense() {
		return this.defense;
	}
	public int getLevel() {
		return this.level;
	}
	
	
	
	public void setHp(int hp) {//방어적 코드도 작성해보기
		if(hp < 0) {
			System.out.println("잘못된 입력 입니다.");
		}else {
			 this.hp += hp;
		}
	}
	public void setDefense(double defense) {
		this.defense += defense;
	}
	public void setlevel(int level) {
		this.level += level;
	}

	// main 함수 (자바 문법, 따로 메인함수 파일을 안만들어도 여기서 실행시켜 볼수 있다.)
	public static void main(String[] args) {
		// Hero 객체 생성 후 getter, setter 메서드를 사용해 보세요.
		Hero hero1 = new Hero();
		// new Hero(); 이렇게만해도 객체가 생성된다.
		hero1.setName("뚠따따");
		String name = hero1.getName();
		System.out.println("돌려 받은 값 : " + name);
		
		hero1.setHp(500);
		int hp = hero1.getHp();
		System.out.println(name+"의 체력은 : "+hp+"입니다.");
		hero1.setDefense(50.5);
		double defense = hero1.getDefense();
		System.out.println(name+"의 방어력은 : "+defense+ "입니다.");
		hero1.setlevel(5);
		int level = hero1.getLevel();
		System.out.println(name+"의 레벨은 :"+level+ "입니다.");
				
	}
	// 멤버변수에 직접 접근하여 값을 변경할 수 있지만 oop객체지향 프로그래밍에선 메서드를 통해서 해야한다 
}
