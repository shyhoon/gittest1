package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// �ѹ� ������ String�� �Һ�(immutable)
		// abc�� ����� d�� �߰��Ϸ��� ���� abcd�� �������Ѵ�
		
		//String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ� ���ο� ���ڿ��� �����ȴ�.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java); //java
		System.out.println(System.identityHashCode(java));// �ּҰ� :22429093
		//System.identityHashCode �ּҰ� Ȯ���ϴ� �޼���
		
		System.out.println("-------------------");
		
		// java = java + android;
		java = java.concat(android);
		// concat�޼��� - �������ְڴٴ� �޼���
		System.out.println(java); //javaAndroid

		System.err.println(System.identityHashCode(java));// �ּҰ� : 733957003
		
		
		// �̷��ԵǸ� ä���ϰų� �ϸ� �޸��� ���� �������� ������ �ٸ� �༮�� ��� 
	}
}
