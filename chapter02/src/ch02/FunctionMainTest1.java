package ch02;

public class FunctionMainTest1 {

	
	public static void main(String[] args) {
		
		// �Լ� ��� ��� (��� ���߱� )
		int addResult1 =  add (10, 77);
		System.out.println(addResult1);
		
		int addResult2 = add(10,30);
		System.out.println(addResult2);
		
	}//end of main
	
	// add �Լ��� ����
	public static int add(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		
		return result; // ���� Ű���带 ������ �� ���࿡ ������� ��ȯ
		
	}
	
}//end of class
