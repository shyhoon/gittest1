package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MbcNews implements WriteArticle{

	private String printDate() { // ��¥ �������ϴ°�
		DateFormat formater = new SimpleDateFormat("yyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	@Override
	public void printArticle(String article) { // ��� �����
		System.out.println("@@@ MBC @@@");
		System.out.println(article);
	}
	
}
