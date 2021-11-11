package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class HackerNews implements WriteArticle{					// �ݹ��� �޴� ��ü

	
	private String printDate() { 									// ��¥�� ����ִ� �޼���
		DateFormat formater = new SimpleDateFormat("yyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());	// ü�̴� ���
	} // end of printDate

	@Override 
	public void printArticle(String article) { 						// �ݹ� �Ǿ����� �޼���
		System.out.println("***HackerNews***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("��� �ۼ��� : " + printDate());
	}
	
}
