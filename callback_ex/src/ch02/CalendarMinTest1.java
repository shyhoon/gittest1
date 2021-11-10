package ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMinTest1 {

	public static void main(String[] args) {
		
		// Calendar클래스란 날짜 인스턴스
		// 달력이나 시간계산등을 사용 할 때 많이 사용하는 객체 
		// 싱글톤 패턴으로 만들어져있다?
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		
		// 보기 불편하기 때문에 형식을 만들어서 사용할 수 있다.
		// 날짜로 변환 방법 지정
		 
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			
		// 현재 시간을 내가 정한 format형식으로 변환
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
			
			
	

	}
}
