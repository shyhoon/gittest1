package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TellManagement {

	// ����
	public static void insert(HashMap<String, Phone>map) {// �Է°��� �޾� ���ο� ��ü�� ����°�
		Phone phone;
		
		String name,address,telephone; // �ѹ������⵵ ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : ");
		name = s.next();
		System.out.println("�ּ� : ");
		address = s.next();
		System.out.println("��ȭ��ȣ : ");
		telephone = s.next();
		
		phone = new Phone(name, address, telephone);
		
		map.put(phone.name, phone); 
	}
	
	// ����
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
		// �̸��� �Է��ϸ� �ش��ϴ� key����ã�Ƽ� ����key�� �̸��� �Է� �޾Ƽ� ���
		
	}
	
	//ã��
	public static void search(HashMap<String, Phone>map) {
		String dellName;
		Scanner s = new Scanner(System.in);
		System.out.println("ã�� �̸� >>");
		dellName = s.next();
		if (map.containsKey(dellName)) {
			System.out.println(dellName + ":" + map.get(dellName).telephone);
		}else {
			System.out.println(dellName + " �� ���� ����Դϴ�.");
		}
		// key �̸��� �Է� �޾Ƽ� ã�� ȭ�鿡�����ּ���
		
		
	}
	//��ü����
	public static void showInfo(HashMap<String, Phone>map) {
		
//		���1
		Set<String>names = map.keySet();
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
		// ȭ�鿡 ��ü ������ �ѷ� �ִ� ����� ����� �ּ���
		
	}
	
	
	public static void main(String[] args) {
		
		HashMap<String, Phone>map = new HashMap<String, Phone>(); // ���ο� ��ü�� ����� put�Ͽ� ����Ǵ� ������ �����
		map.put("�̽���", new Phone("�̽���", "�λ�", "010-2333-4333"));
		map.put("������", new Phone("������", "�λ�", "010-2333-4333"));
		//�⼭�� �̿��غ���
//		insert(map);
//		search(map);
		System.out.println("--------------");
//		showInfo(map);
		
		System.out.println("-------------");
//		System.out.println(map);
		
		//���࿡ �帧 ����� ����
		int muni;
		
		System.out.println("--------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("--------------");
		
		
		// ��ĳ�� �̿��ؼ�
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
			return; // while���� ����
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		}		
		
		
		
	}
}
