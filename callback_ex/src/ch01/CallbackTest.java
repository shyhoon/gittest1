package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �������̽��� �����Ѵ�.
interface CallbackBtnAction {
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedMultipleBtn();
	// �Ű� ������ �� ���� ����
	public void passValue(int value);
	
	//3�� �޼���

}// end of interface


// �ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 �����Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction{

	int count;
	int c1;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);

	}

	@Override
	public void clickedAddBtn() {
		// �ݹ�Ǿ����� �޼��� : 
		System.out.println(this.getClass().getName()+ "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count+ "");
		
	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("���ϱ� �ݹ� �޾ҽ��ϴ�.");
		int countMultiple = this.count *this.count;
		this.count = countMultiple;
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		System.out.println("value ���� ���� ���� :" + value);
		label.setText(value + "");
	}

}// end of mainActivity



// �ݸ� (ȣ����):�ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ�� �Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnMultiple;
	JButton btnPassValue;
	// ��ư 3�� ����
	//1. ��� ������ ������ �� �ش�.
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		//�߿�!!
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnMultiple = new JButton("���ϱ� ��ư");
		btnPassValue = new JButton("�� ���� ��ư");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		btnAdd.addActionListener(this);
		add(btnMinus);
		btnMinus.addActionListener(this);
		add(btnMultiple);
		btnMultiple.addActionListener(this);
		add(btnPassValue);
		btnPassValue.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println("���ϱ� ��ư�� Ŭ�� �Ǿ����ϴ�");
		
		// 1. ��ư ����
		JButton targetBtn = (JButton) e.getSource();
		if (targetBtn == btnAdd) {
			// ���ϱ� ��ư
			callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus){
			// ���� ��ư
			callbackBtnAction.clickedMinusBtn();
			
		} else if(targetBtn == btnMultiple) {
			
			callbackBtnAction.clickedMultipleBtn();
		}else if(targetBtn == btnPassValue) {
			
			callbackBtnAction.passValue(100);
		}
		
	}

}

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);

	}
}
