package ch11;

public class StringTest1 {

	public static void main(String[] args) {
	
		// String ���� ���
		// heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		String str1 = new String ("abc");

		// data=static=constant pool������ ����
		String str2 = "abc";
		String str3 = "abc";
		//�� ���� �޸𸮿� �ö󰡴� ��ġ�� �ٸ���
		// heap������ ���� �������� �ؿ� ���� constant pool������ �ּҰ��� ���ԵǴ°ǰ���
		// �ƴϸ� �׳� �ƿ� static������ ����ٴ� �ǰ�
		
		System.out.println(str1 == str2); //--> false �޸� ��ġ�� �ٸ��ϱ� �ٸ��ٴ� ������� �����°�
		System.out.println("===============");
		System.out.println(str2 == str3);
		
		String str4 = new String("abc");
		String str5 = new String("abc");
		
		System.out.println("------------------");
		System.out.println(str4 == str5); // ������ �ٸ���ü�� �ּҰ��� �ٸ���
		System.out.println("------------------");
		
		String str6 = "abc";
		String str7 = "abc";
		System.out.println(str6 == str7);
		// constat pool�������� ���� ���̸� ���� ������ �ʰ� ���� ���� �ٶ󺸰��Ѵ�(�����Ѵ�)
		// ��� : �� �޸𸮴� ��ü�� ������ �� ���� �ٸ� �ּҰ��� ��������,
		// ���Ǯ�� ������ ���ڿ��� ���� ���� ��� ��� ���� �ּ� ���� ������(���� ���ڿ��ϰ��)
		
		
		
	}// end of main 
	
}// end of class
