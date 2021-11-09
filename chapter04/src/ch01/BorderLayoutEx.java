package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = { "북", "센터", "남", "동", "서" };
	String[] directions = { BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.EAST,
			BorderLayout.WEST };

	// A.B이면 하나로 봐야한다
	// BorderLayout.NORTH이면 BorderLayout이랑 NORTH가 따로따로가 아니고 하나인것
	// BorderLayout에들어가서 NORTH에 접근하라는 명령어
	// 따라서 NORTH의 데이터타입만 알면된다
	// 또한 원시코드를 확인해보면 NORTH메서드는 static이라 객체를 생성안해도 클래스로접근하여 바로 사용 가능하다.

	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayout 연습"); // = super.setTitle("BorderLayout 연습);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		borderLayout = new BorderLayout();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
			// 0 <- (북),1<-(센터),...
		}
	}

	private void setInitLayout() { 
		setVisible(true); 
		// for
//		super.add(buttons[1],BorderLayout.NORTH);
//		super.add(buttons[1],BorderLayout.CENTER);
//		super.add(buttons[2],BorderLayout.SOUTH);
//		super.add(buttons[3],BorderLayout.EAST);
//		super.add(buttons[4],BorderLayout.WEST);

		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i]);
		}

	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
// gui프로그램을 만들때는 항상 틀을 먼저 만들자(강사님이 하시는 형태로 연습)