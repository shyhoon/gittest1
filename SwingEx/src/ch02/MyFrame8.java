package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1; 										// ��׶��� �̹��� ���� �ø��� �̹���
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�̹��� ��׶��� ����2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
		} catch (Exception e) {
			System.err.println("������ �����ϴ�."); 						// err�ϸ� ���������� ǥ��
			System.exit(0); 										// System.exit(0);���α׷��� �����Ű�� ��ɾ�
		}

		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);						//.setResizable(false); ũ�⸦ Ȯ��,��Ұ� �ȵǰ� �ϴ� �޼���
		this.add(imagePanel); 

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// switch������ ����
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					yPoint -= 10;
					yPoint = (yPoint < -10) ? (yPoint = 0) : (yPoint = yPoint);
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint += 10;
					yPoint = (yPoint > 450) ? 400 : yPoint + 10; 
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint -= 10;
					if (xPoint < -10) {
						xPoint = 0;
					}
					System.out.println("xPoint: " + xPoint);
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint += 10;
					int num = (xPoint > 450) ? (xPoint = 400) : (xPoint = xPoint);
				}

				repaint();										 // repaint(); �ٽ� �׸��� �׸��� �ϴ� �޼���

			} // end of keyPressed
			
		});
	}

	// ���� Ŭ����
	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) { 				// paintComponent �׸��� �׷��ִ� �޼���
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);

		}

	}

}// end of class
//boolean up = e.getKeyCode() == KeyEvent.VK_UP;
//
//switch (e.getKeyCode()) {
//case up :
//	y
//	break;
//
//default:
//	break;
//}
