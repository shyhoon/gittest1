package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		
		Powder powder = new Powder();
		Plastic plastic =  new Plastic();
		
		GenericPrinte<Powder> genericPrinter1 = new GenericPrinte<>(); // ���� �ڷ������� ���� �� �ִ� genericPrinter1
		
		genericPrinter1.setMaterial(powder);
		
		// ��� ������
		Powder tempPowder =  genericPrinter1.getMaterial(); // Object�� Ÿ���� ������������ �ٿ�ĳ������ ����������� Ÿ���� ���׸������ϸ� �׷��ʿ䰡 ��������
		System.out.println(tempPowder);
		
		System.out.println("--------------------------");
		// ���� 1.  �ö�ƽ���� ���׸� Ŭ������ �����ϰ� ��� ������ ��Ḧ ���� ����
		
		GenericPrinte<Plastic> genericPrinter2 = new GenericPrinte<>();
		
		genericPrinter2.setMaterial(plastic);
		System.out.println(genericPrinter2.getMaterial());// ������ �������
		System.out.println(genericPrinter2); //������ ������� ,genericPrinter2�� tostring�� �������߱⿡ �ּҰ��� �ƴ϶� �������Ѹ��ϰ��� ���´�
		
		System.out.println("--------------------------");
		//GenericPrinter toString();
		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);
		
		// ���׸��� Ư¡ ���� �ڷ����� �����ϴ½����� �ڷ��� �Ű�����(��ü����)�� ���̺�ȯ�Ǿ� ������ �Ǿ� ����
		// ���׸��� ��� ���� 
		// T�� �� �� �� ��"������ ������ϸ� �ƹ��ų� �� ���� ���ϰ� Ȱ���� �� �ֵ�
	}
	
}
