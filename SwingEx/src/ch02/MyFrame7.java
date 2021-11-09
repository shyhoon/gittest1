package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {
	
	JTextArea area; 													// JTextArea ���ڸ� �ѹ��� ���� ���� �༮?
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
		
	}
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
		
	}
	private void addEventListener() {
//		area.addKeyListener(this); 								// ���� KeyListener�� �����޾Ҵٸ� ���������� this�� �ᵵ ����
		area.addKeyListener(new KeyAdapter() { 							// ��������ϵ� ���������� �� �ϳ�
			@Override
			public void keyPressed(KeyEvent e) {     					// Event e ������ ������ �ý��� �ݹ� �޼���
				
				if (e.getKeyCode()== KeyEvent.VK_UP ) {
					area.append("���� ����Ű ������");						// .append()�޼��� �����̴� ���� 
				} else if (e.getKeyCode()== KeyEvent.VK_DOWN){ 			
					area.append("�Ʒ��� ����Ű ������");		    	// .getKeyCode()�޼��� �̺�Ʈ�߻��� Ű�� �ڵ带 �������� ����
				} else if (e.getKeyCode()== 37) {						
					area.append("���� ����Ű ������");
				} else if (e.getKeyCode()==39) {
					area.append("������ ����Ű ������");
				}
			}
		});
		}

	// ���ڸ� ������ �� ȣ��, ����Ű���� ����
//	@Override
//	public void keyTyped(KeyEvent e) { 
								
//		System.out.println("keyTyped : " + e.getID());
//	}
	// Ű���带 ������ �� ȣ��, ��� Ű���忡 ����
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed :" + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + ""); 									// + "" ���ڿ��� ��ȯ
//		area.append(e.getKeyCode()+ "\n"); 									// "\n" ���ڿ� ��ĭ ����
		
		// ���� ����Ű ������
		// �Ʒ��� ����Ű
		// ���� ����Ű
		// ������ ����Ű
//		
//		if (e.getKeyCode()== KeyEvent.VK_UP ) {
//			area.append("���� ����Ű ������");
//		} else if (e.getKeyCode()== KeyEvent.VK_DOWN){ // ���� �ǹ��ִ� �ڵ�� ����
//			area.append("�Ʒ��� ����Ű ������");
//		} else if (e.getKeyCode()== 37) {
//			area.append("���� ����Ű ������");
//		} else if (e.getKeyCode()==39) {
//			area.append("������ ����Ű ������");
//		}
//		
		
//		
//	}
//	// Ű���带 ���� �� ȣ�� , ��� Ű���忡 �����մϴ�.
//	@Override
//	public void keyReleased(KeyEvent e) {
////		System.out.println("keyReleased : " + e.getID());
//		
//	}
	
//	private void addEventListener() {
//		area.addKeyListener(new KeyAdapter() { 	//KeyAdapter�� �߻�Ŭ�����ε� �� new�� ����Ͽ� ��ü�� ������ �� �ֳ���?			
//			@Override
//			public void keyPressed(KeyEvent e) {     					
//				
//				if (e.getKeyCode()== KeyEvent.VK_UP ) {
//					area.append("���� ����Ű ������");						 
//				} else if (e.getKeyCode()== KeyEvent.VK_DOWN){ 			
//					area.append("�Ʒ��� ����Ű ������");		    
//				} else if (e.getKeyCode()== 37) {						
//					area.append("���� ����Ű ������");
//				} else if (e.getKeyCode()==39) {
//					area.append("������ ����Ű ������");
//				}
//			}
//		});
//		}
//	
	
}
