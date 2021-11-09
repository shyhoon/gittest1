package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// ArrayList ����

		// �����͸� ���� ���� �����
		// ! ArrrayList �� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book>/* �ڷ��� Ÿ�� */ shoppingCart = new ArrayList<Book>();

		// �߰� ��� 1
		// ������ �߰��ϱ�
		shoppingCart.add(book1); // 0 //�����Ͱ� ������� �߰�
		shoppingCart.add(book2); // 1
		shoppingCart.add(book3); // 2
		shoppingCart.add(book4);// 3

		System.out.println(shoppingCart.size());
		// ȭ�鿡 ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo(); // .��. �˾ƵѰ�
		}

		
		System.out.println("---------------------------");
		// �߰� ��� 2
		shoppingCart.add(2, book5); //  .add(�ε��� ��ȣ) , (���� ��ü �̸�)) 
		// for�� 2��° ���(foreach)
		for (Book b : shoppingCart) { // ������� shoppingCart�� ������ŭ �ݺ��Ͽ� b���� �ִ´� 
			b.showInfo();
		}// foreach�� ���� �׳� �ϱ�
		// for ( (�ڷ���Ÿ��) (�̸�) : (�迭�̸�)){}  
		
		
		System.out.println("---------------------------");
		// ���� �ϱ�
		shoppingCart.remove(0); // ������ �ε��� ��ȣ �Է�
		// foreach

//		shoppingCart.clear(); // ���� ���� 
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		
		
		System.out.println("---------------------------");
		// �����ϱ� (set�޼��� ���
		shoppingCart.set(2, book1); //( ������ �ε��� ��ȣ�� ���� ��ü�� / 2��° �ε����� book1���� ����
		// for each�� �����ؼ� ȭ�鿡 ���
		for (Book book : shoppingCart) {
			book1.showInfo();
		}
		// foreach���� �ε����� �������� ���Ѵ� ���� �߰��� ������ �ȵǱ⶧���� �ܼ��� ó������ ������ �ݺ��� �ؾ��Ҷ� ���
		// ���������� ���� �����ؾ��Ҷ� �ε����� ������ �� �ִ�  for���� ���
		// C R U D ���α׷����� �⺻ ����,����
		// create , read , update , delete

	}
}
