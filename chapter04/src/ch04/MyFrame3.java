package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel { 			// �ܼ�ȭ�ؼ� �ٶ󺸱�// �г��� �Ӽ� ���� �ż��� �����ǿ� �����ڸ� ����

	private Image image;

	public ImagePanel(String imagename) {	 			// �����ڰ� 2�� (������ �����ε�)
		image = new ImageIcon(imagename).getImage();
	}

	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage(); // ImageIcon�� .getImage���, �̹������� ���� ����
	}

	@Override
	public void paint(Graphics g) { 					// �׸��� ������� ������ ����

		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null); // g.drawImage��� �׸��� ���� �Է�
	} // �������,�׸�������ġ,���α��� ,����,�����ؼ� null�� ����
}

////////////////////////////////////////////////////////////////////////////////////////////

public class MyFrame3 extends JFrame {  		// �ܼ�ȭ�ؼ� �ٶ󺸱�// �г� ������ �� �ʱ�ȭ // �ܼ�ȭ�ؼ� �ٶ󺸱�

	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Jpanel�� �̹��� �ֱ�");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel("image1.jpg");
		imagePanel2 = new ImagePanel("image2.jpg");
		button = new JButton("��ư�Դϴ�.");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));			 // �г��� �ΰ��ϱ� ��ġ�� ������� ���� ��������Ѵ�
		add(imagePanel);
		add(imagePanel2);

		imagePanel.add(button);

	}

	public static void main(String[] args) {
		new MyFrame3();
	}

}// ������ �����ϸ� �������� ã�� �ܼ�ȭ�� ������
