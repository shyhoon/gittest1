package ch01;

import java.util.Iterator;

public class ArrayMainTest3 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�� ����ó��","�Ŀ���ڿ���"	);
		Book book2 = new Book(2, "�÷���UI����","���ȣ"	);
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�","������"	);
		Book book4 = new Book(4, "�������θ����϶�","������"	);
		Book book5 = new Book(5, "���ǿ���","�����϶�"	);
		
		
		// ���� 
		//1. �迭�� �̿��ؼ� shoppingCart ����(�迭)�� ��ü�� ��� ���ô�.
		
		Book[] shoppingCart = new Book[5];
		
		// 2. ������ å�� ��ٱ��Ͽ� ��� ���ô� 3����
		
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book5;
				
		// 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ��� �ϼ���
		
		System.out.println(shoppingCart[0]);
		System.out.println(shoppingCart[1]);
//		System.out.println(shoppingCart[2].showInfo()); <--?
		//PrintStream ������ Println(boolean) �޼���� �μ�(void)�� ������ �� �����ϴ�.
		// println�޼���� void�� �� �� ���ٴ¸��ΰŰ����� ��??


		
		shoppingCart[0].showInfo();
		shoppingCart[1].showInfo();
		shoppingCart[2].showInfo();
		
		
//		for (int i = 0; i < shoppingCart.length; i++) {
//			shoppingCart[i].showInfo(); 
//			}
//		// for ���� �������ּ���.
//		for (int i = 0; i < shoppingCart.length; i++) {
//			if(shoppingCart[i] != null) {
//			shoppingCart[i].showInfo(); 
//			//null point execption- shoppingCart�� ���� null �̸� �������� �����ǵ� �������� ���� ��ü�� �޼��带 ��� �Ҽ� �����ϱ� ������ ���°��̴� 
//			} 
//		}
//		
		//4.
		
		shoppingCart[0] = book5;
		
		// 5. �ε��� 1��°�� book3 �߰� �� �ּ���
		// 0, 1 = book3 ,   1 --> 2, 2--> 3, 3 -->4
		
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;
		

		
		// ���� -> �迭�� ��� �ִ� ���� �����ҷ��� null�� ����
		// 3��° �ε����� ���� ������.
		
		shoppingCart[3] = null;
		
		// �迭�� �߰��� �ҷ��� ���� �ε��� ������ �ϳ��� �и鼭 ó�� �ؾ� �ؼ� �ð��� ���̵��.
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo(); 
				} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
