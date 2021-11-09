package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame {

	BufferedImage backgroundImage; //BufferedImage 타입 사용
	BufferedImage imageIcon;
	BufferedImage imageIcon2;
	BufferedImage imageIcon3;
	MyImagePanel myImagePanel;

	// 1. 3개이상 만들어서 화면에 올려주세요
	//2. 반복적인부분이보이면 arraylist
	
	// 생성자
	public MyFrame4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {															
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			imageIcon2 = ImageIO.read(new File("among1.png"));
			imageIcon3 = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");// file을 불러올때 예외가 발생할수 있어서 trycatch문 작성
		}											// ImageIO.read메서드 사용하여 이름 기입

		// myImagePanel 생성
		myImagePanel = new MyImagePanel(); 
		

	}

	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
	}

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) { // paintcomponenet메서드 사용
			super.paintComponent(g);				// 그림을 어떤식으로 넣을지 지정하는 메서드

			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 80, 80, null);
			g.drawImage(imageIcon2, 50, 50, 80, 80, null);
			g.drawImage(imageIcon3, 100, 50, 80, 80, null);

		}

	}// end of inner class 내부클래스

	// 메인함수
	public static void main(String[] args) {
		new MyFrame4();

	}// end of main
} // end of class
