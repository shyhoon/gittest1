
package ch12;

public class MaintTest1 {

	
	public static void main(String[] args) {
		
		Book book1 = new Book(1,"���̾�","�츣�� �켼1");
		Book book2 = new Book(1,"���̾�","�츣�� �켼2");
		
		System.out.println(book1 == book2);
		
		// equals�޼���� String �ּҰ��� ���Ҷ� ���� ����.
		// �ʿ信���� �������Ͽ� ���
		boolean result = "a".equals("a"); // a�� a�� �����ϱ� true ��� ���´�
		System.out.println(result);
		System.out.println("a" == "a");
		System.out.println("--------------");
//		boolean r1 = "1".equals("2") ; 
		
		// equals �޼��� ������ �ߴ� (bookŬ���� �ȿ��� )
		if(book1.equals(book2)) {
			System.out.println("���� å�Դϴ�.");
		}else {
			System.out.println("�ٸ� å�Դϴ�.");
		}
		
		
		System.out.println("a" == "a");

	}
}
// ��ü���� �ٽɰ��� �����غ��� ��α� 1~11������