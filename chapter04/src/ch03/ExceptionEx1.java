package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			
			for (int i = 0; i < 10; i++) {         	// ���ܰ� �߻��� �ڵ带 try���� �ۼ�
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {// error�� ���� e��� �Ű����� ���� ���� ����
			System.out.println(e);					// ����ܰ� �߻��ߴ��� ���
			System.out.println("���ܰ� �߻���");		// ���൵�� ���� 
		}

		System.out.println("������ ������� �ʾҽ��ϴ�."); 	

		

	}
	// ������ ���� ����ó���� �ϰԵǸ� ���α׷����� ���� ���� �ʰ� ��� ����Ǿ� ����!!!
}
//for (int i = 0; i < 10; i++) {
//System.out.println(arr[i]);
//}
// == �迭�� ������ ����� �䱸
//���ؽ� ������ ������ ����