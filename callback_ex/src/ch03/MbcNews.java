package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MbcNews implements WriteArticle{

	private String printDate() { // 날짜 나오게하는것
		DateFormat formater = new SimpleDateFormat("yyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	@Override
	public void printArticle(String article) { // 기사 만들기
		System.out.println("@@@ MBC @@@");
		System.out.println(article);
	}
	
}
