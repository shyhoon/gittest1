package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{

	// ���� ����
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	final int JBUTTONS_SIZE = 6;
	
	// ���̾ƿ� Ʋ �����
	
	//1. ������
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	//2. ���� �ʱ�ȭ���ִ� �޼���
	private void initData() {
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT,1,10)); // -->��ġ������ layout��� ����

		for (int i = 0;i<JBUTTONS_SIZE; i++) {
			System.out.println("i"+i);
		buttons.add(new JButton((i+1)+"��° ��ư"));
	}
	}// end of initData

	// 3. ���� �����ϴ� �޼���
	private void setInitLayout() {
		setVisible(true);
	
//		add(buttons[0]); // add�� ������ ��ư(���۳�Ʈ)�� ���̰ڴٴ� �� �ǹ� 
//		add(buttons[1]);

		for (int i = 0;i<JBUTTONS_SIZE; i++) {
			add(buttons.get(i)); // .�����ڴ� ���� �������Ű� �����
		}
		
		int i = 0;
		for (JButton jButton : buttons) {
			add(buttons.get(i));
			i++;
		}
		
	}// end of setInitLayout

		
}//  end of MyFrame2

public class FlowLayoutEx {

	public static void main(String[] args) {
		
		new MyFrame2();
		
		
		
	}
}

// ���� �ذ�ɷ� C R U D
// ���Ҿ�������� <-- ���� �ذ� ��� �ϳ��� ©�� ���۸��ϸ� �ذ� 
// 1. �������
// 2. ���� �߰��ϴ� ���
// 3. ���� �߰��ϴ� ���


//�迭�� ����ؼ� �������ּ���.

//private JButton button1;
//private JButton button2;
//private JButton button3;
//private JButton button4;
//private JButton button5;
//private JButton button6;
//

//JButton button1 = new JButton();
//JButton button2 = new JButton();
//JButton button3 = new JButton();
//JButton button4 = new JButton();
//JButton button5 = new JButton();
//JButton button6 = new JButton();
//private JButton[] buttons1 = new JButton[]{button1,button2,button3,button4};
//private JButton[] buttons = new JButton[6];



//buttons[0] = button1;
//buttons[1] = button2 ;
//buttons[2] = button3 ;
//buttons[3] = button4;
//buttons[4] = button5;
//buttons[5] = button6 ;


//	 Ŭ������ ���赵�ε� Ŭ�������� ���๮�� ����Ͽ� ���α׷��� ���� ��ų �� ���� ���๮�� �����ڳ� �Լ��ȿ����� ��� �����ϴ�
// 	�׷��� Ŭ�������� sysout�� �� �� ����.
// ������� ����Ǵ°� �����ڳ� �Լ� �ȿ� �־���Ѵ� Ŭ�����ȿ� ���๮�� ������ ���๮�� ������ ��Ÿ�� �߿� ��Ȯ�� ��� ������ ����Ǵ��� ���ϱ⵵ ��ȣ

//1.	private JButton[] buttons1 = new JButton[]{button1,button2,button3,button4}; 
// �� ���� ������ ������ �ȿ��� �̷��� ���๮�̶� �����Ѱ�
//2.	private JButton[] buttons2;
//	private MyFrame2() {
//		this.buttons2 = new JButton[6];
//		buttons[0] = button1;
//		buttons[1] = button2 ;
//		buttons[2] = button3 ;
//		buttons[3] = button4;
//		buttons[4] = button5;
//		buttons[5] = button6 ;
//} // 1���� 2���� �ڵ�� �����Ŵ� �����ڿ��� �߾���ϴ°� �ٿ��� �� �� �ְ� ���ִ� �����̴�.

// �׷��� ����� ���๮�̶�� �ϳ�?
//Ŭ���������� ���� ������ ����

// for�� ����
// �迭�� ����ϴ� ���
//buttons[0] = new JButton("1��° ��ư");
//buttons[1] = new JButton("2��° ��ư");
//buttons[2] = new JButton("3��° ��ư");
//buttons[3] = new JButton("4��° ��ư");
//buttons[4] = new JButton("5��° ��ư");
//buttons[5] = new JButton("6��° ��ư");

//for (int i = 0; i < buttons.length; i++) {
//	buttons[i] = new JButton();
//	System.out.println(i+"��° ��ư");
//}


// ArrayList ����ϴ� ���1
// for�� ����
// ArrayList�� ó������� 0�Դϴ�.
//buttons.add(new JButton ("1��° ��ư"));
//buttons.add(new JButton ("2��° ��ư"));
//buttons.add(new JButton ("3��° ��ư"));
//buttons.add(new JButton ("4��° ��ư"));
//buttons.add(new JButton ("5��° ��ư"));
//buttons.add(new JButton ("6��° ��ư"));

//int i = 0;
//for (JButton jButton : buttons) { //--> foreach���� �ε����� �������� ���ϹǷ� ���⼱ ����ϸ� �ȵȴ�
//	jButton =  new JButton();
//	i++;
//	System.out.println(  i+"��° ��ư");
//}



//for (int i = 0;  i< buttons.length; i++) {
//	add(buttons[i]);
//	System.out.println(i+"���� ��ư");
//}



//add(buttons.get(0)); 
//add(buttons.get(1)); 
//add(buttons.get(2)); 
//add(buttons.get(3)); 
//add(buttons.get(4)); 

