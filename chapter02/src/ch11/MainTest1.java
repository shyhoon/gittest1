package ch11;

import java.util.Calendar;

public class MainTest1 {
	public static void main(String[] args) {
		//�̱��� ����

//		Company company0 = new Company();
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();

		// ȭ�鿡 �ּҰ��� ����� ������.
		System.out.println(Company.getInstance());
		System.out.println();
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		// ���� ��ü�� �ϳ��� ���� ���� �ּҰ��� ���� �ȴ�.
		// �̱������� jdk����
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
	
	
	
	
	
	}
	
	
	
	
	
}
