package ch05;

import java.util.ArrayList;

public class MainTest3 {

	public static void main(String[] args) {
		
		// ������ : �迭(�ڷᱸ��(arraylist����)) ���迡���� ��� ����
		// �ϳ��� ������ ������ �����͸� ������ �����ϱ� ���� ���
		
		// 1. 
		Banana banana1 = new Banana("�ٳ���",500,100,"�±�");
		Banana banana2 = new Banana("�ٳ���",500,100,"�±�");
		Peach peach1	= new Peach("������",500,100);
		
		Banana[] bananaBuKet = new Banana[2];
		bananaBuKet[0] = banana1;
		bananaBuKet[1] = banana2;


		//1��
		
//		for (Banna banana: bananaBuKet) {
//			banana.showInfo();
//		}
		
		// ������
		Peach peach2 = new Peach("������",500,100);
		Peach peach3 = new Peach("������",500,100);
		
		// �迭 ����ؼ� ��� �ּ���
		// �迭�� 2ĭ
		
		Peach[] peachBucket = new Peach[2];
		peachBucket[0] = peach1;
		peachBucket[1] = peach2;
		
		// for�� ����ؼ� showIbnfo �޼��� ȣ��
		for (Peach peach : peachBucket) {
			peach.showInfo();
		}
		
		// 3. �������� ��� �Ѵٸ�
		Fruit[] fruitBuket1 = new Fruit[4];
		fruitBuket1[0] = banana1;
		fruitBuket1[1] = peach2;
		fruitBuket1[2] = banana2;
		fruitBuket1[3] = peach3;
		
		for (Fruit fruit : fruitBuket1) {
			fruit.showInfo();
		}
		
		// ArrayList������ �������� �̿밡��
		ArrayList<Fruit> fruitBuket = new ArrayList<Fruit>();
		fruitBuket.add(banana2);
		fruitBuket.add(0, peach1);
		fruitBuket.size();
		for(Fruit banana : fruitBuket) {
			banana.showInfo();
		}
		
		
		
		
		
	}
}
