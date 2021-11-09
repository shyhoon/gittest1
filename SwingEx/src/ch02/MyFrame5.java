package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame{
	
	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("���콺 �̺�Ʈ");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel(" hello java ~ ");
		label.setSize(150,50); 								// ũ�Ⱑ ������ ���ڰ� ©���⵵ �Ѵ�
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		
		label.setLocation(12,40);							// .setLocation ��ġ���������ִ� �޼���
	};

	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {			// MouseListener ���� �������̽����� �͸�����ü�� ����
			
			// ���콺�� �������� �� ����Ǵ� �޼���
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			// ���콺�� ���� ���� �� ����Ǵ� �޼���
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			// ���콺�� ������ �� ����Ǵ� �޼���
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			// ���콺�� ��� ���� �� ����Ǵ� �޼���
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			// ���콺�� Ŭ�� �Ǿ��� �� ����Ǵ� �޼���
			@Override
			public void mouseClicked(MouseEvent e) {		// e�� ���콺�� Ŭ���Ǿ������� ȯ�������� �����ִ� 
				System.out.println(e.getX() + ": ��ǥ�� X"); 	// e.getX() e�� x��ǥ�� �������� �޼��� 
				System.out.println(e.getY() + ": ��ǥ�� Y");
				
				label.setLocation(e.getX(),e.getY());		
			}
		});
		
	}
	
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		new MyFrame5();
	}
}
