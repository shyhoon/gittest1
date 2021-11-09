package ch04;

public class UserInfoMainTest {

	public static void main(String[] args) {
		
		
		UserInfo userInfo3 = new UserInfo("questzz","qwer123","¶Óµûµû");
		System.out.println(userInfo3.userId);
		System.out.println(userInfo3.userPassWord);
		System.out.println(userInfo3.userName);
		UserInfo userInfo = new UserInfo("user02");
		UserInfo userInfo2 = new UserInfo("user02","1234");
		
		
		
	}
	
}
