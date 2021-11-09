package ch01;

public class MainTast1 {

	public static void main(String[] args) {
	
		Order order1 = new Order();
		//멤버 변수의 특성.
		System.out.println(order1.orederId); //인트는 초기값이 0 값을 안줬으니까
		System.out.println(order1.buyerId); //참조값은 초기값이 null 값을 안줬으니까
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println(order1.sellerId);
		
		//1.order1 값을 넣고 화면에 출력해주세요
		
		order1.buyerId = "이승훈";
		order1.orderDate = "09-21";
		order1.sellerId = "당근마켓";
		order1.productId = 2154832;
		order1.orederId = 654651321;
		
		
		
		
		Userinfo userInfo1 = new Userinfo();
		//2. userinfo1 값 넣고 화면에 출력
		
		userInfo1.phoneNumber = "01026545684";
		userInfo1.userAddress = "eikdiwldkfe";
		userInfo1.userId = "shlee33";
		userInfo1.userName = "이승훈";
		userInfo1.userPassWord = "likejrheit";
		
	}
}
