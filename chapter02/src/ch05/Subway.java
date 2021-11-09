package ch05;

public class Subway {
	int subWaynumber;
	int passengerCount;
	int money;
	
	public Subway (int subWaynumber) {
		this.subWaynumber = subWaynumber ; 
		
	}
	
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
