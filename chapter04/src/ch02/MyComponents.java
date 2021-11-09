package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame {

	// ���۳�Ʈ�� ������
	private JPanel panel;
	private JButton button;
	private JLabel label; // ȭ�鿡 ���ڸ� ������ִ±��
	JTextField textField; // ���ڸ� �Է��Ҷ� ���� ���
	private JPasswordField jPasswordField; // ��й�ȣ �Է��Ҷ� ***�Ǵ°�
	private JCheckBox checkBox;// üũǥ��

	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("������Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);

		panel = new JPanel();
		button = new JButton("button");
		textField = new JTextField("��Ʈ", 20);
		jPasswordField = new JPasswordField(20);
		checkBox = new JCheckBox("checkBox", true);// true false�� �̸� üũ�� �صѰǰ� �ƴҰǰ��� ����
		label = new JLabel("label");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout()); // ���� ���������� ��Ű������ �Ȱ����Ծ

		add(panel); // �г��� ����� �ű�� ���̴°�
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(jPasswordField);
		panel.add(checkBox);

	}

}
