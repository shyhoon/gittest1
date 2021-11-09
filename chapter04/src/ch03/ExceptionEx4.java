package ch03;

import java.util.logging.Logger;

class Student {

	String name;
	int grade;

}

public class ExceptionEx4 {

	public static void main(String[] args) {
		// 로그란 오류의 기록을 남기는것
		// 로그 남기기 추후에 spring이나 안드로이드에 더 좋은도구를 쓴다
		Logger logger = Logger.getLogger("myLogger");

		Student student = null;

		try {
			student.name = "홍길동";
		} catch (Exception e) {
			logger.warning("오류발생" + e.toString());
		}

		System.out.println("비정상 종료되지 않음!");

	}
}
