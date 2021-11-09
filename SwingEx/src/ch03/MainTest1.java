package ch03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customJPanel;
	JButton btnStart;
	JButton btnStop;
	BorderLayout borderLayout;
	JPanel bottomPanel;

	boolean isOn = true; // boolean은 처음에 값을 안주면 false다
	// thread 사용할 이미지
	int among1XPoint = 0;
	int among1YPoint = 370;

	int among2XPoint = 200;
	int among2YPoint = 200;

	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		// 스레드 동작 시작
		Thread thread = new Thread(customJPanel);
		thread.start();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongImage1 = ImageIO.read(new File("among1.png"));
			amongImage2 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다");
			e.printStackTrace();
		}
		customJPanel = new CustomJPanel();
		borderLayout = new BorderLayout();
		bottomPanel = new JPanel();

		btnStart = new JButton("START");
		btnStop = new JButton("STOP");

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
//		this.setLayout(borderLayout);
		this.add(customJPanel, BorderLayout.CENTER); 							// 명시 안해주면 기본이 CENTER
		this.add(bottomPanel, BorderLayout.SOUTH);

		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		bottomPanel.add(btnStart);
		bottomPanel.add(btnStop);
	}

	private void addEventListener() {

		btnStart.addActionListener(this);
		btnStop.addActionListener(this);

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				switch (code) {
				case KeyEvent.VK_UP:
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					among2XPoint += 10;
					break;
				}

				repaint();
			}
		});
	}

	// 내부 클래스 만들기
	private class CustomJPanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 먼저 있어야한다 super
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {

			boolean isRight = true;

			while (true) {
				if (isOn) {
					if (isRight) {
						among1XPoint += 10;
					} else {
						among1XPoint -= 10;
					}

					if (among1XPoint == 400) {
						isRight = false;
					}
					if (among1XPoint == 0) {
						isRight = true;
					}
					// 이미지 1과 이미지 2와 좌표값이 x,y일치 한다면 이미지 2를 없애라
					if ((among1XPoint == among2XPoint) && (among1YPoint == among2YPoint)) {
						amongImage2 = null;
					}

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				repaint();
			} // end of while
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/// 1. 버튼이 start,stop 구분해주세요.
		JButton buttons = (JButton) e.getSource();
		if (buttons == btnStart) {
			isOn = true;
		} else {
			isOn = false;
		}

		// 2. 변수를 새롭게 활용해서 while멈추거나 다시 시작할 수 있게 코드를 수정 합니다.

	}
}

public class MainTest1 {

	public static void main(String[] args) {
		new MiniAmongUs();
	}
}
