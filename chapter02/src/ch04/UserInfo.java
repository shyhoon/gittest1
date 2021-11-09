package ch04;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	// alrt + shift + s,o (generate constructor using Fields)
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	
	
	public UserInfo(String userId, String userPassWord) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
	}



	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}



	public UserInfo(String userId, String userPassWord, String userName) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	
/*	// ������ �����ε� (�����ڸ� �����̸�(���⼱ userinfo)���� ������ ���������) 
	// �߿�! �����ڴ� ��ü�� ������ �� ó�� ����Ǵ� �ڵ� �Դϴ�.
	// �����Ϸ��� ������ �̸��� ���Ƶ� �����ڵ��� �Ű������� �ٸ��� ������ �� �ֵ�
	
	// 1. �⺻ �����ڸ� ����� �ּ���. �����ڸ� ���� �ȸ���� �����Ϸ��� �⺻���� ����� �⺻�����ڸ� �׷��� �츮�� ����� �����Ϸ��� ��������� �ʴ´�
	public UserInfo() {
		
	}
	// 2.  useId�� �޴� �����ڸ� ����� �ּ���.
	public UserInfo (String userId) {
		this.userId = userId;
	}
	// 3. useId , userPassword �� �޴� �����ڸ� ������ּ���.
	public UserInfo (String userId, String userPassword) {
		this.userId = userId;
		this.userPassWord = userPassword;
	}
	// 4. useId , userPassword , userName �� �޴� �����ڸ� ������ּ���
	public UserInfo (String userId, String userPassword ,String userName) {
		this.userId = userId;
		this.userPassWord = userPassword;
		this.userName = userName;	
	}
	//5. useId , userPassword , userName , userAddress
	public UserInfo (String userId, String userPassword ,String userName,String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassword;
		this.userName = userName;	
		this.userAddress = userAddress;
	}
	//6. useId , userPassword , userName , userAddress , phoneNumber
	public UserInfo (String userId, String userPassword ,String userName,String userAddress,String phoneNumber) {
	this.userId = userId;
	this.userPassWord = userPassword;
	this.userName = userName;	
	this.userAddress = userAddress;
	this.phoneNumber = phoneNumber;
}
*/
}
