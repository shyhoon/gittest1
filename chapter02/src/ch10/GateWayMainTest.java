package ch10;

public class GateWayMainTest {

	public static void main(String[] args) {
		
		
		
		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(1);
		GateWay gateWay3 = new GateWay(1);
		
		Zealot zealot1 =gateWay1.createZealot(); //--> ������ ������ ȭ�鿡 ����Ϸ��� ���� ������ �ʿ�
		Zealot zealot2 =gateWay1.createZealot();
		Zealot zealot3 =gateWay1.createZealot();
		Zealot zealot4 =gateWay1.createZealot();
		Zealot zealot5 =gateWay1.createZealot();
		Zealot zealot6 =gateWay1.createZealot();
		Zealot zealot7 =gateWay1.createZealot();
		
		gateWay2.createZealot();
		gateWay2.createZealot();
		gateWay2.createZealot();
		gateWay2.createZealot();

		gateWay3.createZealot();
		gateWay3.createZealot();
		gateWay3.createZealot();
		gateWay3.createZealot();
		
		zealot1.showInfo();
		//static ������ �ν��Ͻ����� ������ �� �ִ� �����̴�.
		// --> ��ü�� �������� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
		// ex) �¾�(��ü�� �����Ǳ����� �޸𸮿� �ö� �ִ�)
		
		System.out.println("���� ������ ���� ��" + GateWay.zealotCount);
		
		
	}
}
