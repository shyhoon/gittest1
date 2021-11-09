
package ch04;

public class Subway {

	// 호선 번호 멤버변수
	// 승객수
	// 수익금
	
	int subWaynumber;
	int passengerCount;
	int money;
	
	// 생성자 - 호선 번호를 받는 생성자
	public Subway (int subWaynumber) {
		this.subWaynumber = subWaynumber ; 
		
	}
	// 메서드 take , showInfo 
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(" 지하철 " + subWaynumber+"호선의 승객은");
		System.out.println(passengerCount+"명이고");
		System.out.println("현재의 수익금은 : "+money+"원 입니다.");
	}
	
	
	
	
}
