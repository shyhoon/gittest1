package ch03;

import java.util.logging.Logger;

class Student {

	String name;
	int grade;

}

public class ExceptionEx4 {

	public static void main(String[] args) {
		// �α׶� ������ ����� ����°�
		// �α� ����� ���Ŀ� spring�̳� �ȵ���̵忡 �� ���������� ����
		Logger logger = Logger.getLogger("myLogger");

		Student student = null;

		try {
			student.name = "ȫ�浿";
		} catch (Exception e) {
			logger.warning("�����߻�" + e.toString());
		}

		System.out.println("������ ������� ����!");

	}
}
