package ch11;

public class Company {
	// ȸ��� �ϳ������Ҷ� 
	//1 . �����ڸ� private�� �����.
	
	private Company() {
	}
//	Company sert = new Company();
	// 2. static ������ Ȱ���ؼ� ���ο��� ��ü�� �����Ѵ�. ��ó�� ����Ʈ���̰���
	private  static Company instance = new Company();
	// ������ ��ü  instance�� ���� �ּҰ��� ���� �����̰� �����ڿ� ��ü ��� private���¶� �ۿ�����
	// set�޼���(public)�� ����� ���� �ʴ��� �������� ���Ѵ�.
	
	// 3. �ܺο��� ������ �ν��Ͻ��� ������ �� �ִ� public �޼��带 ���� �ؾ� �Ѵ�.
	public static Company getInstance() {
		// ����� �ڵ� 
		return instance;
	}// ��ü�� �������� �ʾƵ� ����ƽ �޼��� ��� �����ϴ�
} 
