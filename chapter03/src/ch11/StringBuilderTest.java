package ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		// ��Ʈ���� ä���̳� ���ڰ� ��� �Ͼ������ �޸� �ڿ� ���� ���� ���ؼ� �׷���� ������ ���۸� ����Ѵ�
		// StringBuilder, StringBuffer Ȱ��
		// ���������� �������� char[]��(ĳ����Ÿ�� �迭)�� ��� ������ ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ���� �ϴ�.
		// StringBuffer�� ��Ƽ������ ���α׷��ֿ��� ����ȭ�� ����
		// ���� ������ ���α׷�(���� �����ִ°͵�)������ StringBuilder ����ϱ⸦ ����
		
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder); // java
		System.out.println(System.identityHashCode(builder)); //�ּҰ�:22429093
		
		System.out.println("---------------------");
		
		builder.append(android); 
		System.out.println(builder); // javaandroid
		System.out.println(System.identityHashCode(builder)); //�ּҰ�:22429093 �������

		
		// append �޼���
		// ���� �߰��Ͽ� ���� ���� �������ִ� �޼��� , �ּҺ����� ����
		builder.append("�ȳ��ϼ���");
		System.out.println(builder);
		builder.append("�ݰ����ϴ�");
		builder.append("hi");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		// ����ȯ�Ҷ� toString();
//		String tempStr = builder; 
		// builder�� ������Ÿ���� StringBuilder , tempStr�� ������Ÿ���� String�̶� ����ȯ�� ��������Ѵ�
		String tempStr = builder.toString(); // .toString(); -> StringŸ������ ��ȯ�϶�� �޼���
		System.out.println(tempStr);
				
		
	}
}
