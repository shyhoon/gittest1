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
	
	
/*	// 생성자 오버로딩 (생성자를 같은이름(여기선 userinfo)으로 여러개 만들었을때) 
	// 중요! 생성자는 객체가 생성될 때 처음 실행되는 코드 입니다.
	// 컴파일러는 생성자 이름이 같아도 생성자들의 매개변수가 다르면 구분할 수 있따
	
	// 1. 기본 생성자를 만들어 주세요. 생성자를 따로 안만들면 컴파일러가 기본으로 만든다 기본생성자를 그러나 우리가 만들면 컴파일러가 만들어주지 않는다
	public UserInfo() {
		
	}
	// 2.  useId만 받는 생성자를 만들어 주세요.
	public UserInfo (String userId) {
		this.userId = userId;
	}
	// 3. useId , userPassword 만 받는 생성자를 만들어주세요.
	public UserInfo (String userId, String userPassword) {
		this.userId = userId;
		this.userPassWord = userPassword;
	}
	// 4. useId , userPassword , userName 만 받는 생성자를 만들어주세요
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
