package ch09;

public class EmployeeMainTest {
// �����Լ� (�ڵ��� ������
	public static void main(String[] args) {
		
		int temp = Employee.getSerialNum(); // static �޼��� - ��ü�� �����ϱ� ���� ��� ���� 
		System.out.println(temp);
		
//		Employee test1; = new Employee();
//		test1.getEmployeeId(); //<--�Ϲ� �޼���, new��� Ű���带 ����Ͽ� ��ü�� �����ϱ��������� �̷��� ��� �� �� ����. 
//		
		
		
		
		
		
		Employee employee1 =  new Employee();
		System.out.println(employee1.serialNum);
		System.out.println(employee1.getEmployeeId());
		
		Employee employee2 =  new Employee();
		Employee employee3 =  new Employee();
		Employee employee4 =  new Employee();
		Employee employee5 =  new Employee();
		
		System.out.println(employee5.getEmployeeId());
		
		System.out.println(employee5.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);
		System.out.println(employee4.serialNum);
		// serialNume �� �ٰ��� �����ϱ⶧���� �� ���� ���� ������.
		// ��������� static������ �ٸ���. employeeId�� serialNum�� �ٸ���.
		System.out.println(employee3.getEmployeeId());
		System.out.println(employee3.getSerialNum());
		
		// static  ����, ��� ���� ,���� ���� --> �޸� ��ġ Ȯ��(�޸� ��ġ�� ���� �ٸ���
		
		// employee1 ~ 5 : �ν��Ͻ� ������ �����ؼ� getSerialNum() ����
		employee1.getSerialNum();
		employee2.getSerialNum();
		employee3.getSerialNum();
		employee4.getSerialNum();
		employee5.getSerialNum();
		// Ŭ���� �̸����� �����ؼ� getSerialNum() �޼��� ��� 
		Employee.getSerialNum();
		
		
	
	}// end of main
	
}// end of class
