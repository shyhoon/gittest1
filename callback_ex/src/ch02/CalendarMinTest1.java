package ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMinTest1 {

	public static void main(String[] args) {
		
		// CalendarŬ������ ��¥ �ν��Ͻ�
		// �޷��̳� �ð������� ��� �� �� ���� ����ϴ� ��ü 
		// �̱��� �������� ��������ִ�?
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		
		// ���� �����ϱ� ������ ������ ���� ����� �� �ִ�.
		// ��¥�� ��ȯ ��� ����
		 
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			
		// ���� �ð��� ���� ���� format�������� ��ȯ
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
			
			
	

	}
}
