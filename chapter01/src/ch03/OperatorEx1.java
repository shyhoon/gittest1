package ch03;

public class OperatorEx1 {
public static void main(String[] args) {

	
	int i = 10;
	double d = 20.5;

	// 1
	// �� ���� ���� ���� �Ͽ� result1 ������ ���
	// ����� 30.5�� ��� �ϼ���. -�ڵ�����ȯ, ���������
	
	double result1 = i + d;
	System.out.println(result1);
	
	// 2
	// result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���
	// �� ������ �������� ���� �������ּ���. - ��������ȯ
	
	System.out.println((int)result1);

	// 3
	// i ������ ���� -1�� �� �� ����ϼ���
	// ��, ���� ������ ��� - ���ҿ�����(���� ���� �����ڴ� ���� �����ڰ� �ƴϱ⿡ �� �� ����)

	i --; // i ������ ������ 1�� ����� ��ɾ� �̴�.
	System.out.println(i);
	
	// 4
	// d ������ ���� -20.5�� ��� �ϼ���
	// ��, d ������ ���� �������� ������ - ��ȣ ������
	
	System.out.println(-d);
	
	// 5
	// ���� i�� d, ���� �����ڸ� ����ؼ� result2 ������ 
	// �����ϰ� ������ true ���� ��⵵�� ���� �����
	// ����ϼ��� - ���� ������ , ���� ������ Ÿ���� ������ �� �� �ִ���

	boolean result2 = (i < d );
	System.out.println(result2);

	int num1 = 10;
	int num2 = 30;
	
	// 6
	// ���� result3�� �����ϰ�
	// num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� ����� ��� ����ϼ���
	// ��������, ���迬����, ���� ������ Ÿ��
	
	boolean result3 = ( num1 > 50 ) && ( num2 < 50);
	System.out.println(result3);
	
	boolean result4 = ( (num1 -= 3) > 45) && ( (num2 += 10) < 50);
	System.out.println(result4); //f
	System.out.println(num1); // 7 
	System.out.println(num2); // 30
	
	boolean result5 = ((num1 += 4) >43) || ((num2 -= 3) > 20);
	System.out.println(result5); //t
	System.out.println(num1); // 11
	System.out.println(num2); // 27
	

	// 7
	// num1�� num2 �� �� ū ���� ���� �����ڸ� ����ؼ�
	// max ������ ���� ��� ������ּ���
	// ��, ����� �ʱ�ȭ�� ���ÿ� ���ּ���

     int max = (num1 > num2) ? num1 : num2; 
     //������ Ÿ���� int�� ���� - ���������� ���ͷ��� ���� ������ ������ ������ int�� ������� �Ѵ�.
     System.out.println(max);
	int max1 = (num1 < num2) ? num2 : num1;
	System.out.println(max1);
	
	
	
}
}
