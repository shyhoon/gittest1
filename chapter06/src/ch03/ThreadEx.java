package ch03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreadEx extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	MyImagePanel imagePanel;
	JPanel imagePanel2;
	int xPoint = 200;
	int yPoint = 200;
	JButton button1;
	JButton button2;
	
	public ThreadEx() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("쓰레드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("image3.jpg"));
			imageIcon = ImageIO.read(new File("image4.png"));
		} catch (IOException e) {
			System.err.println("파일이 업습니다");
			System.exit(0);
		}
		imagePanel = new MyImagePanel();
		imagePanel2 = new JPanel();
		button1 = new JButton("버튼 1");
		button2 = new JButton("버튼 2");
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		imagePanel.setPreferredSize(new Dimension(500,400));
		add(imagePanel,BorderLayout.NORTH);
		
		imagePanel2.setPreferredSize(new Dimension(500,100));
		imagePanel2.setBackground(Color.WHITE);
		imagePanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		add(imagePanel2);          // 이걸 imagePanel2.BorderLayout.South하면 왜 버튼이 안보이나?
		
		imagePanel2.add(button1);
		imagePanel2.add(button2);
		
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				int keyCode = e.getKeyCode();
//				if (keyCode == KeyEvent.VK_UP) {
//					yPoint -= 10;
//					if (yPoint < 5) {
//						yPoint = 5;
//					}
//				} else if (keyCode == KeyEvent.VK_DOWN) {
//					yPoint += 10;
//					if (yPoint > 330) {
//						yPoint = 330;
//					}
//				} else if (keyCode == KeyEvent.VK_LEFT) {
//					xPoint -= 10;
//					xPoint = (xPoint < 0) ? 0 : (xPoint -= 0);
//				} else if (keyCode == KeyEvent.VK_RIGHT) {
//					xPoint += 10;
//					xPoint = (xPoint < 430) ? (xPoint += 10) : 430;
//				}

				switch (keyCode) {
				case KeyEvent.VK_UP:
					yPoint -= 10;
					if (yPoint < 5) {
						yPoint = 5;
					}
					break;
				case KeyEvent.VK_DOWN:
					yPoint += 10;
					if (yPoint > 330) {
						yPoint = 330;
					}
					break;
				case KeyEvent.VK_LEFT:
					xPoint -= 10;
					xPoint = (xPoint < 0) ? 0 : (xPoint -= 0);
					break;
				case KeyEvent.VK_RIGHT:
					xPoint += 10;
					xPoint = (xPoint < 430) ? (xPoint += 10) : 430;
				default:
					break;
				}
				
				repaint();

			}

		});
	}

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 400, null);
			g.drawImage(imageIcon, xPoint, yPoint, 80, 80, null);
		}
	}

	public static void main(String[] args) {
		new ThreadEx();
	}
}
