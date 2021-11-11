package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


interface CallbackBtnAction {										// �������̽� ����
	public abstract void clickedAddBtn();

	public void clickedMinusBtn();

	public void clickedMultipleBtn();

	// �Ű� ������ �� ���� ����
	public void passValue(int value);

}// end of interface

class MainActivity extends JFrame implements CallbackBtnAction {	// �ݹ� �޴� ��ü (������ �������̽� ������)

	int count; 														// �������Ҷ� �� ���������
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
	public void clickedAddBtn() {									// �ݹ�Ǿ����� �޼���
		 
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("���ϱ� �ݹ� �޾ҽ��ϴ�.");
		int countMultiple = this.count * this.count;
		this.count = countMultiple;
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		System.out.println("value ���� ���� ���� :" + value);
		label.setText(value + "");
	}

}// end of mainActivity


class SubActivity extends JFrame implements ActionListener {// �ݸ� (ȣ����)
														// :�ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��带 ȣ�� ����
	JButton btnAdd;
	JButton btnMinus;
	JButton btnMultiple;
	JButton btnPassValue;

	CallbackBtnAction callbackBtnAction; 						// �ݹ� �޴� ��ü�� �ּҰ��� ���� ����

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿�!!
		this.callbackBtnAction = callbackBtnAction; // �ݹ��� ��ü�� �޼��� ������ ������ �ٸ� �޼��尡 ����ϰ� �����
													// ���������� CallbackBtnAction�� �������ִ� MainActivity
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
	public void actionPerformed(ActionEvent e) { //SubActivity���� �̺�Ʈ�� Ȯ���ϸ� MainActivity�� �ݹ�Ǹ����

		JButton targetBtn = (JButton) e.getSource();
		
		if (targetBtn == btnAdd) {
			callbackBtnAction.clickedAddBtn(); 							// MainActivity�� �޼���� �ݹ�
		} else if (targetBtn == btnMinus) {
			callbackBtnAction.clickedMinusBtn();
		} else if (targetBtn == btnMultiple) {
			callbackBtnAction.clickedMultipleBtn();
		} else if (targetBtn == btnPassValue) {
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
//�׻� â�������� ���� ���� ���ο�� ���������� �Ƿ��� �´�
	// ���½ð��� �������ؼ� ������ ������


// �ݹ� �޴� �ڵ�
// �������̽��� ���� �����Ͽ� �������ϰ�  �������� �������� �޼��带 ȣ���ϸ� �������� �޼��� ����
// ���� �ٸ���ü�� �ݹ��� ���ؼ� ��ȣ�ۿ��ϰ� �����


