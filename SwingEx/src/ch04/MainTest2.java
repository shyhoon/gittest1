package ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame1 extends JFrame{
	
	public MyFrame1() {
		
		setTitle("gif사용해보기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 					// Container JFrame안에 있는 클래스		
		c.setLayout(new FlowLayout());						//getContentPane()는 가장 기본적으로 깔린 패널을 가져 오는것(부모패널)
		
		JLabel textLabel = new JLabel("펭하 입니다");
		ImageIcon img = new ImageIcon("1.jpg"); 			// ImageIcon 어떤 백그라운드에 그림을 붙일때 사용  
		
		JLabel imgeLabel = new JLabel(img);		
		JLabel bottomTextLabel = new JLabel("연락하세요");
		
		c.add(textLabel);
		c.add(imgeLabel);									//ImageIcon은 component가 아니라 JLabel에 넣어서 add해야한다
		c.add(bottomTextLabel);
		
		setSize(500,500);
		setVisible(true);
		
		
	}
	
}


public class MainTest2 extends JFrame{


	public static void main(String[] args) {
	new MainTest2();	
	}
}
