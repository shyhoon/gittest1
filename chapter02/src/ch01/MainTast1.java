package ch01;

public class MainTast1 {

	public static void main(String[] args) {
	
		Order order1 = new Order();
		//��� ������ Ư��.
		System.out.println(order1.orederId); //��Ʈ�� �ʱⰪ�� 0 ���� �������ϱ�
		System.out.println(order1.buyerId); //�������� �ʱⰪ�� null ���� �������ϱ�
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println(order1.sellerId);
		
		//1.order1 ���� �ְ� ȭ�鿡 ������ּ���
		
		order1.buyerId = "�̽���";
		order1.orderDate = "09-21";
		order1.sellerId = "��ٸ���";
		order1.productId = 2154832;
		order1.orederId = 654651321;
		
		
		
		
		Userinfo userInfo1 = new Userinfo();
		//2. userinfo1 �� �ְ� ȭ�鿡 ���
		
		userInfo1.phoneNumber = "01026545684";
		userInfo1.userAddress = "eikdiwldkfe";
		userInfo1.userId = "shlee33";
		userInfo1.userName = "�̽���";
		userInfo1.userPassWord = "likejrheit";
		
	}
}
