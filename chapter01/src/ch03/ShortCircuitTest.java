package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		
		
		int num1 = 5;
		int i = 0;
		
//		boolean value = ((num1 = num1 + 10) < 10) && (( i = i + 2) < 10);
		boolean value = ((num1 += 10) < 10) && (( i += 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);// ����Ŷ��������̶� �޺κ��� ���� �򰡸� ���� �ʾƼ� ���� �ȴ�ܼ� 0�̴�
		
		value = ((num1 = num1 + 10 ) < 10 ) || (( i = i +2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
