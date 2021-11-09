package ch09;

import java.util.Iterator;

public class MainTest {
	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();

		// ������ - �� (��ü,����,����)
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyRobot;

		// Ȯ�� for�� turOn() ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		// remote�� �����Ͽ� �迭 ��ĭ�� remoteController�� ���°� �ݺ��ϸ�,���๮�� �����Ѵٴ� ��
		}
		System.out.println("-------------------------");
		
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("------------------------------");

		// instanceOf ������ ���
		// �������� ����ؼ� ���� Ÿ������ ���� ��ü�� �ְ� �Ǿ����� ���ϴ� ��ü�� �ҷ����� ���� ��쿡 ���
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü �Դϴ�.");

			// ��������
			//remote[i] �� �����ؼ� name ������ּ���
			//System.out.println(toyRobot.name);
			//System.out.println(remote[i].);
				String name = ((ToyRobot) remote[i]).name; // �ٿ�ĳ����
				System.out.println(name);
			}

			if (remote[i] instanceof Televison) { // ���� ����Ʈ i�� �ν��Ͻ��� ���������̶��
				System.out.println("�ڷ����� ��ü �Դϴ�.");
			}

		}

	} // end of main

}
