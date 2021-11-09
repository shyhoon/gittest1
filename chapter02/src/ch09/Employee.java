package ch09;

public class Employee {

	public static int serialNum = 1000; // seraiNum�� static ���� ���  class �� ������ ������
	
	private int employeeId; // employeeId �������
	private String employeeName;
	private String department;
	
	public Employee() {                           // ctrl space������ �⺻������ ����� ��"���� ����Ű��
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	// static �޼��� Ȱ��
	public static int getSerialNum() {        // static �޼���� new��� Ű���带 ���� ���� �̸� ��밡���ϴ�.
		//���� : static�޼��� �ȿ����� ��� ����(=�ν��Ͻ� ����)�� ����� �� ����. -> ��ü�� �����Ǳ����� ������ ��ü�� ���� ���� ������ 
		// why? : static�� ��ü�� �޸𸮿� ��������� ���� Ŭ���� �̸����� �����ؼ� ����� �� �ִ� ex. Employee.getSerialNum();
		// ��ü�� �����Ǳ� ���� ����� �� �ִ� �޼���
		// ���� static �޼��� �ȿ����� static������ ��밡���ϴ�
		// �¾�ó�� �̸� ���ִ� �༮
		// Ŭ������ new�� ����Ͽ� ���������� ��밡���ϴ�
		// static �޼��� �ȿ��� ������ static������ ��� ����
//		department = "������";
		return serialNum;
		
	} 
	
}
