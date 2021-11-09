package ch09;

import java.util.Iterator;

public class MainTest {
	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();

		// 다형성 - 배 (신체,선박,과일)
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyRobot;

		// 확장 for문 turOn() 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		// remote에 접근하여 배열 한칸씩 remoteController에 담기는걸 반복하며,수행문을 수행한다는 말
		}
		System.out.println("-------------------------");
		
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("------------------------------");

		// instanceOf 연산자 사용
		// 다형성을 사용해서 같은 타입으로 여러 객체를 넣게 되었을대 원하는 객체만 불러오고 싶을 경우에 사용
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체 입니다.");

			// 도전과제
			//remote[i] 로 접근해서 name 출력해주세요
			//System.out.println(toyRobot.name);
			//System.out.println(remote[i].);
				String name = ((ToyRobot) remote[i]).name; // 다운캐스팅
				System.out.println(name);
			}

			if (remote[i] instanceof Televison) { // 만약 리모트 i의 인스턴스가 델레비전이라면
				System.out.println("텔레비전 객체 입니다.");
			}

		}

	} // end of main

}
