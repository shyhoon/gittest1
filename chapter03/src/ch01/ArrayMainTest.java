package ch01;

public class ArrayMainTest {
	public static void main(String[] args) {
	
//		 �迭
//		 �迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���̴�.
//		 ������ �ϳ��� ������ �� �����ϱ� ���� ���̶�� �迭�� �������� �����͸� �ϳ��� ������ �����ϱ� ���Ѱ��̶� �Ҽ��ִ�.
		
		int number = 10; // �������� ��� (���� ������ ����
		
//		 "�迭 ����" ��� (���𰡸� "���� �ٱ���"�� ����°� )
		int[]	arr1 = new int[3];			//1. ����� �ַ� ����
		int arr2[ ]		=	new int[10];	//2. ���
		//int�� ���� �� �ִ� �迭�� ���� heap������ intŸ���� 3���� ĭ�� ������ arr1�̶�� �̸��� ����  
		
//		 �ʱ�ȭ �ϴ� ��� (���� �ִ� ���)
		arr1[0] 	= 33; 							// 0��° ĭ�� 33�� �ְڴٴ� ��ɾ�
		arr1[1]	=	10;
		arr1[2]	=	11; 						// 2��° ĭ�� 11�� �ְڴٴ� ��ɾ�
		
//		��� ���α׷����� �ε����� 0���� ���� , �迭�ȿ� �ִ� ���� ���� ã������ �ε����� ���
//		�迭�� ũ��(n)�� �ε����� ��������ȣ�� �ٸ���, �ε����� ��������ȣ = n - 1
//		ex. 788�� ������ �ε��� ��ȣ �� 787
		
		// �迭 ����� ���ÿ� �ʱ�ȭ
		int[] numbers1 = new int[] {11,20,30}; // ��Ŀ��� ũ��� 3 
		int[] numbers2 = {10,50,100};             // �Ѵ� �Ȱ��� �迭�� ����°�
		
		// ��� ���
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]); 
		System.out.println(numbers1 ); //�ּҰ����°�
		System.out.println(arr1);
		// c r u d 
		
		
		//
		String[ ] strArr =  new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";
		String[] strArr1 = {"�����","ī����","����"};
		System.out.println(strArr1.length);
		System.out.println(strArr1[0]);
		System.out.println(strArr1[1]);
		System.out.println(strArr1[2]);
		// 1. ȭ�鿡 0,1,2,3,4, ������ּ���. �� for�� ��� ����
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		System.out.println(strArr[4]);
		
		System.out.println(strArr.length); // strArr�� ����
		
		
		// �ڵ� ���� null���� ������� ������.
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}
		
		// ��� ���α׷��� ������ index�� 0 ���� �����մϴ�.
		// �迭�� ����Ҷ� ���� for���� �����ؼ� ���� ��� �մϴ�.
		
//		new int[22]; // ���� 22 , �ε����� ũ�� 21
//		new int[74]; // ���� 74 ,73
//		new int[283];//	���� 283, �ε����� ũ�� 282
		
		
		
		
		
		
		
		
		
		
		
}// end of main
}// end of class
