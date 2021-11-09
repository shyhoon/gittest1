package ch10;

public class GateWay {

	public static int zealotCount = 0;
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "게이트웨이";
	}
	// 질럿 생산하기
	public Zealot createZealot() {
		System.out.println("질럿" + name +"  을 생산합니다.");
		zealotCount++;
		return new Zealot("질럿"); //-> heap영역에 객체를 생성했지만 이름은 만들어 주지 않은것?
	}
	
	
}
