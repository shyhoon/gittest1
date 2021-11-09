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

	// 컴퍼넌트의 종류들
	private JPanel panel;
	private JButton button;
	private JLabel label; // 화면에 글자를 만들어주는기능
	JTextField textField; // 글자를 입력할때 쓰는 기능
	private JPasswordField jPasswordField; // 비밀번호 입력할때 ***되는거
	private JCheckBox checkBox;// 체크표시

	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("컴포넌트 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);

		panel = new JPanel();
		button = new JButton("button");
		textField = new JTextField("힌트", 20);
		jPasswordField = new JPasswordField(20);
		checkBox = new JCheckBox("checkBox", true);// true false는 미리 체크를 해둘건가 아닐건가를 결정
		label = new JLabel("label");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout()); // 오류 났던이유는 패키지에서 안가져왔어서

		add(panel); // 패널을 만들고 거기다 붙이는것
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(jPasswordField);
		panel.add(checkBox);

	}

}
