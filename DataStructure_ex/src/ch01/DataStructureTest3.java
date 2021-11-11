package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest3 {

	public static void main(String[] args) {
		
		Map map0;
		//map �迭
		// key�� value ������ �����͸� �����Ѵ� //null�� ���
		HashMap<String, String>map1 = new HashMap<>();
		
		//null���� ������� �ʰ� �ϴ� ��� hashtable���
		Hashtable<String, String>map2 = new Hashtable<>();
		
		// ���� �߰� �ϴ� ��� 
		map1.put("A01", "������������"); // �����͸� ������ add�� �ƴϰ� put�޼��带 ����
		map1.put("A02", "���������Ĺ�");	// map�迭�� key�� �ߺ��� ���ȵȴ�  
		map1.put("A03", "�������׷κ�");
		map1.put("B01", "��õ��������");
		map1.put("B02", "��õ�����Ĺ�");
		map1.put("B03", "��õ���׷κ�");
		map1.put("C01", null);
		System.out.println(map1);
		
//		map2.put("D01", null); // null���� ������� �����Ƿ� ����
		System.out.println(map2);
		
		//���� ��� ���\
		// get�޼��� ����Ͽ� key������ �����ؾ� �Ѵ�
		System.out.println("---------------------");
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("A02"));
		System.out.println(map1.get("A03"));
		
		// �������
		System.out.println("--------------------");
		System.out.println(map1.remove("C01"));
//		map1.clear();
		System.out.println(map1);
		
		// ������ Ȯ�� ���
		System.out.println(map1.size());
		System.out.println(map1);
		
		// map �迭 for�� ��� ���
		// java.util.Map.Entry
		for (Entry<String,String> entry : map1.entrySet()) {
			System.out.println("key:" + entry.getKey() + "value :" + entry.getValue());
		}
		System.out.println("--------------------");
		for (String key : map1.keySet()) {           		// keySet() ���Ű�� �������� �޼���
			System.out.println(key + ":"+map1.get(key)); // key�� �Է��ϸ� value ���� ���´�
			
			
		}
	}
}