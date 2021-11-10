package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		//int --> Integer
		Integer num = new Integer(17);											// 박싱한 상태
		int n = num.intValue();													// 언박싱
		System.out.println(n);
		
		
		Integer num1 = 17;														// 자동 박싱(자동 형변환)
		int n1 = num1;															// 자동 언박싱(자동 형변환)
		System.out.println(n);
		
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
																				// 8 + "" --> String으로 자동 변환
		byte b = Byte.parseByte(str);											// String --> 기본데이터타입으로 형변환
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean형으로 변경 완료");
		}

		String str10 = "1001";
		String str11 = "2001";
		
		// str10 str11 덧셈 연산
		int add = (Integer.parseInt(str10) + Integer.parseInt(str11));
		System.out.println(add);
		// 곱셈
		int multiple= (Integer.parseInt(str10) * Integer.parseInt(str11));
		System.out.println(multiple);
		
		
		
//		System.out.println("문자열 byte값 변환 :" + b);
//		System.out.println("문자열 int값 변환 :" + i);
//		
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(bool);
		

		
	}
}
