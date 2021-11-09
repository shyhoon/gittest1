package ch04;

public class Bus {

	// 버스 번호
	// 승객 수 
	// 수익금
	
	int busNumber;
	int passengerCount;
	int money;
	
	// 컴파일러가 기본 생성자를 만들어 준다.
	public Bus (int busNumber){
		this.busNumber = busNumber;
	}

	public void take(int money) {
//		this.money = money + money;
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(busNumber + " 번의 승객은 ");
		System.out.println(passengerCount + " 명이고 ");
		System.out.println(" 현재 수익금은 : " + money + "원 입니다.");
	}
	
	//머릿속에 어떤식으로 구성되는지 생각 설계와 사용하는 입장에대해
	
	
	
}
