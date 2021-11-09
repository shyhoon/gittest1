package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	public MyFrame1() {
		inItData();
		setInitLayout();
	}

	private void inItData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();

	}

	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}

	// 내부 클래스 // 클래스안에 또 다른 클래스를 생성하는 개념/하나의 클래스에서만 어떤 클래스를 사용하려고할때 사용
	// static(정적 내부 클래스), static없으면 (인스턴스,내부클래스)
	static class MyPanel extends JPanel { // 패널에 메서드를 재정의하여 그림을 그리기위해 패널 클래스를 따로 만드는것
											// MyFrame1에서만 사용할것이기에 내부클래스로 작성 ->유지보수 하기도 편해진다
		@Override
		public void paint(Graphics g) { // JPanel에 있는 paint라는 메서드

			g.drawLine(300, 30, 150, 150);
			g.drawLine(300, 30, 450, 150);
			g.drawRect(150, 150, 300, 300);

		}

	}

	public static void main(String[] args) {
		new MyFrame1();
	}
}
