package ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMinTest1 {

	public static void main(String[] args) {
		
	Calendar calendar = Calendar.getInstance(); 
	System.out.println(calendar.getTimeInMillis()); 
																	   // ���� �����ϱ� ������ ������ ���� ���
	DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 	// ��¥�� ��ȯ ����� ������ �� �ִ�	

	
	String date = dateFormat.format(calendar.getTimeInMillis());   // ���� �ð��� ���� ���� format�������� ��ȯ
	System.out.println(date);

	}
}
// CalendarŬ������ ��¥ �ν��Ͻ�
// �޷��̳� �ð������� ��� �� �� ���� ����ϴ� ��ü 
// �̱��� ����
//�̱��� �����̶�  get�޼��带 ���� �����;��Ѵ� ���� ��ü������ �Ұ�,���� �ּҰ��� �����Ѵ�
//.getTimeInMillis()����ð��� 1000���� 1�ʷ� �����ִ� �޼���
// ��¥ ���� ���� ���۸��ϸ� ���´�