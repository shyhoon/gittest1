package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> STring���� �ڵ� ��ȯ
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean������ ���� �Ϸ�");
		}

		// ����1
		String str10 = "1001";
		String str11 = "2001";
		
		// str10 str11�� ���� ���� ���ּ���
		int add = (Integer.parseInt(str10) + Integer.parseInt(str11));
		System.out.println(add);
		// ����
		int multiple= (Integer.parseInt(str10) * Integer.parseInt(str11));
		System.out.println(multiple);
		
		
		
//		System.out.println("���ڿ� byte�� ��ȯ :" + b);
//		System.out.println("���ڿ� int�� ��ȯ :" + i);
//		
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(bool);
		
		// �ѱ۱��� Ȯ���ڵ� !!!!!!

		
	}
}
