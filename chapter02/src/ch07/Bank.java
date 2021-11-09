package ch07;

public class Bank {

	// 정보 은닉
	private int balance;
	
	// 메서드
	
	// 입금 기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	// 출금 기능
	public int witdraw(int money) {
		this.balance -= money;
		return money;
	}
	public void showInfo() {
		System.out.println("현재 잔액은 : " +this.balance+ " 입니다.");
	}
	
	// getter 메서드 만들기 메서드를 통해서 멤버변수에대한 정보를 넘겨주는것
	// 일반적으로 get() 메서드를 만들어서 외부에서 확인할 수 있도록 구현 한다.
	// 멤버변수를 리턴하는것
	// 암묵적으로 get메서드의 이름은 get...으로 한다.
	// 매개변수를 넣어주지 않아서 값을 읽거나 변경 불가 read only
	public int getBalance() {
		return this.balance;
	}
	// setter 메서드 만들기
	// 일반적으로 set() 메서드를 제공해서 외부에서 멤버 변수에 접근할 수 있도록 구현 한다.
	// 암묵적으로 get메서드의 이름은 get...으로 한다.
	// 멤버변수를 변경 할 수 있게 매개변수를 지정
	// 필요에의해서 만들거나 안만들 수 있다
	// 멤버변수의 값을 입력 시 방어적 코드를 사용함으로써 한번더 검증해서 사용할 수있다.
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("잘못된 입력 입니다.");
		}else {
			this.balance = balance;
		}
	}
	// oop개념을 설계할때는 멤버변수를 정보은닉(private)하여 필요에의해 getter,setter메서드를 사용한다
	
	
	
}
// public class는 .java 파일 안에 단 하나만 사용할 수 있다.
class Student{
	
}
