package ch10;

public class HatcheryMaintTest {

	public static void main(String[] args) {

		System.out.println(Hatchery.zerglingCount);
		Hatchery hatchery = new Hatchery(1);
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		System.out.println(Hatchery.zerglingCount);
	}
}
