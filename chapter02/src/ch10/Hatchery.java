package ch10;

public class Hatchery {

	//static 변수 사용
	// 멤버 변수 설계
	// 생성자 설계

	public static int zerglingCount = 1;
	
	private int hatcheryId;
	private String name;
	
	public Hatchery(int id) {
		this.hatcheryId = id;
		name = "헤처리";
	}
	
	public Zergling createZergling() {
		System.out.println("저글링을 생산합니다.");
		zerglingCount++;
		return new Zergling("저글링" + zerglingCount);
	}
	
	
	// 저글리을 생산하는 메서드 만들어주세요
}
