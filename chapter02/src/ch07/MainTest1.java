package ch07;

public class MainTest1 {
	public static void main(String[] args) {
	
		Bank bank = new Bank();
		// 멤버 변수에 성질 확인
		// int balance --> 0
		// double --> 0.0
		// 참조타입 --> null
		
		bank.deposit(10_000);
		bank.showInfo();
		
		// 출금을 합니다.
		int money = bank.witdraw(5_000);          
		//<--? withdraw함수는 return값이 있기에 return값을 담을 변수가 필요하다
		System.out.println("돌려 받은 금액 : " + money);
		bank.showInfo();
		
		// 신입이 실수로 멤버 변수에 바로 접근해서 잔액을 수정 함
		//bank.balance = 100_000;
		bank.showInfo();
		
		// getter메서드는 
		// getter, setter
		// read only 읽기만 가능한것 정보확인 느낌
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		// setter 사용해보기
		bank.setBalance(0);
		bank.showInfo();
		
		// 접근 제어 지시자 
		// 4가지
		// public - 누구나 접근을 허용하게 한다.
		// default - 같은 패키지(package) 내에서는 접근을 허용한다 (멤버 변수앞에 아무거도 적지 않는것) 
		// protected - 상속관계에서 접근을 허용 한다.
		// private - 같은 클래스 에서만 접근을 허용한다.
		
		
		
}
}
