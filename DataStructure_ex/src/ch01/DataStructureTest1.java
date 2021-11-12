package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student{
	String name;
	int grade;
	
}
public class DataStructureTest1 {

	public static void main(String[] args) {
		
		List list0;
		// List �����迭�� �� �ϳ��� ArrayList
		
		// ������ �ְ�(�ε���) �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> member = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		// ����Ʈ ����� ���ÿ� �ʱ�ȭ
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3)); 			// aslList �޼��� ��� 
		
		
		// �� �߰�
		list.add(3);	// index 0
		list.add(null);	// index 1��°
		list.add(1, 10);// index 1��°�� 10�� ����(null�� �ε��� 2������ �з� ����)
		System.out.println("�� Ȯ�� :" + list); 				// to string �� �������ؼ� �ּҰ��� �ƴ� ���� ���´�
		// �� ���� 
		list.remove(2);
		System.out.println("�� ���� Ȯ�� : " + list);
		// �� ���� ����
		list.clear();
		System.out.println("�� ���� Ȯ�� : " + list);
		// �� ��� ���
		System.out.println("�� ��� ��� : " + list.get(1));
		for (Integer i : list) {
			System.out.println("for ����� :" + i);
		}
		
		// while �����(ArrayList���� while���)
		// ��� ��ȸ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ� ��
		
		Iterator<Integer> iter = list.iterator(); 				
		
		while(iter.hasNext()) { 
			System.out.println("while ��� ��� :" + iter.next()); 		
			
		}
		
		// �� �˻����
		System.out.println(list.contains(1)); 									
		System.out.println(list.contains(10));
		System.out.println(list.indexOf(10)); 									// 1��° �ε����� �ִ�
		System.out.println(list.indexOf(300)); 									// ������ -1�� ��ȯ �Ѵ�
		System.out.println(list.indexOf(3));									// 0��° �ε����� �פ���.
		
		// ���� 1
		ArrayList<String> names = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while(flag) {
			String name = sc.nextLine();
			if (name.equals("����")){							// .equals�� ���ڿ� �� , �����ڴ� ���ں��Ҷ� ���
				flag = false;
			}else{
				names.add(name);
			}
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
}
// ctrl t �� �������� �����ش�
//.iterator(); list�� Iterator�� �ٲ��ش�
// ()���� ������ �ε����� ��ȣ�� ��ȯ,������ -1�� ��ȯ �ϴ� �༮.
