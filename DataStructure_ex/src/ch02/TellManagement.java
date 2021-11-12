package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TellManagement {

	// ���� �޼���
	public static void insert(HashMap<String, Phone>map) {				// key�� StringŸ�� 
		Phone phone;													// value�� PhoneŸ�� 
		
		String name,address,telephone; 									// �ѹ��� �������� ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : ");
		name = s.next();
		System.out.println("�ּ� : ");
		address = s.next();
		System.out.println("��ȭ��ȣ : ");
		telephone = s.next();
		
		phone = new Phone(name, address, telephone);					// ��ü ����
		
		map.put(phone.name, phone); 					// ���� �߰��Ҷ� key�� value���� ������Ÿ���� ��������Ѵ�
	}
	// ���� �޼���
	public static void delete(HashMap<String, Phone>map) {
		
		String dellName;
		Scanner s = new Scanner(System.in);
		System.out.println("������ �̸� >>");
		dellName = s.next();
		if (map.containsKey(dellName)) {
			map.remove(dellName);
		}else {
			System.out.println(dellName + "�� ��ϵ��� ���� �̸��Դϴ�.");
		}
	}
	//ã�� �޼���
	public static void search(HashMap<String, Phone>map) {
		String searchName;
		Scanner s = new Scanner(System.in);
		System.out.println("ã�� �̸� >>");
		searchName = s.next();
		if (map.containsKey(searchName)) {
			System.out.println(searchName + ":" + map.get(searchName).telephone);
		}else {
			System.out.println(searchName + " �� ���� ����Դϴ�.");
		}
	}
	//��ü���� �޼���
	public static void showInfo(HashMap<String, Phone>map) {
		
//		���1
		Set<String>names = map.keySet();							// keySet�޼��带 ����Ͽ� iteratorȰ��
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);
		}
//		���2
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key).telephone);
		}
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Phone>map = new HashMap<String, Phone>();				// ����Ǵ� ������ �����
		map.put("�̽���", new Phone("�̽���", "�λ�", "010-2333-4333"));				// ������ �� �Է�
		map.put("������", new Phone("������", "�λ�", "010-2333-4333"));
		//�޼��� �̿�
		insert(map);
		search(map);
		showInfo(map);
		System.out.println(map);
		
		//Ȱ��
		int muni;
		
		System.out.println("--------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("--------------");
		
		
		// ��ĳ�� �̿�
		String number;
		Scanner s = new Scanner(System.in);

		
		while(true) {
			System.out.println("�߰� 0,���� 1, ã�� 2, ��ü����� 3, ���� 4");
			number = s.next();
		switch (number) {
		case "0": 
			insert(map);
			break;
		case "1" :
			delete(map);
			break;
		case "2" :
			search(map);
			break;
		case "3" :
			showInfo(map);
			break;
		case "4" :
			System.out.println("����Ǿ����ϴ�.");
			return; 															// while���� ����
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		}		
		
		
		
	}
}
