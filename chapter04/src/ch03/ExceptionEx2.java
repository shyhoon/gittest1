package ch03;

import java.io.FileInputStream;

public class ExceptionEx2 {

	public static void main(String[] args) {

		FileInputStream fis;

		try {
			fis = new FileInputStream("a1.txt");
		} catch (ArrayIndexOutOfBoundsException e) { 		// ���ܰ� �迭�����϶� ������
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (Exception e) { 							// exception�� �ֻ��� ����Ŭ������ �� �ɸ���
			System.out.println("���� ó��");					// ���� ���� Exception�� ó���� ����Ÿ������ ���Ѵ�
			return; 										// ���Ϲ��� �־ finally������ ����ȴ�.
		} finally {
													// try���� ����Ǹ� �ݵ�� ����, ���� �ڵ忡 ������ �־ ����
			System.out.println("�ݵ�� ����˴ϴ�.");
		}

		System.out.println("������ ���ᰡ ���� �ʾҽ��ϴ�."); 

	
		
	}
} // catch�� ������ ���� ��� ���� if elseó��
