package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel { 			// 단순화해서 바라보기// 패널의 속성 설정 매서드 재정의와 생성자를 통해

	private Image image;

	public ImagePanel(String imagename) {	 			// 생성자가 2개 (생정자 오버로딩)
		image = new ImageIcon(imagename).getImage();
	}

	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage(); // ImageIcon과 .getImage사용, 이미지파일 명을 기입
	}

	@Override
	public void paint(Graphics g) { 					// 그림을 어떤식으로 넣을지 지정

		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null); // g.drawImage사용 그림의 값을 입력
	} // 대상지정,그림시작위치,가로길이 ,높이,사용안해서 null로 설정
}

////////////////////////////////////////////////////////////////////////////////////////////

public class MyFrame3 extends JFrame {  		// 단순화해서 바라보기// 패널 생성과 값 초기화 // 단순화해서 바라보기

	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Jpanel에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel("image1.jpg");
		imagePanel2 = new ImagePanel("image2.jpg");
		button = new JButton("버튼입니다.");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));			 // 패널이 두개니까 배치를 어떤식으로 할지 정해줘야한다
		add(imagePanel);
		add(imagePanel2);

		imagePanel.add(button);

	}

	public static void main(String[] args) {
		new MyFrame3();
	}

}// 구조가 복잡하면 공통점을 찾아 단순화를 잘하자
