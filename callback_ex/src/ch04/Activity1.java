package ch04;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{

	String name;
	JPanel panel;

	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {	// 콜백 받는 객체
		@Override												// 인터페이스를 --> 익명 클래스로 사용
		public void checkPosition(int x, int y) {				// 따라서 본래 인터페이스의 메서드를 재정의
			System.out.println(name + "콜백 받은값 x :" + x);
			System.out.println(name + "콜백 받은값 y :" + y);
		}
	};
	
	public Activity1(String name) {
		this.name = name;
		setTitle(name);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		setVisible(true);
		add(panel);
		panel.setBackground(Color.blue);
	}
	
}
