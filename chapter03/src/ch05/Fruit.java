package ch05;

public class Fruit {

	String name;
	int price;
	int fresh;
	String origin;
	public Fruit(String name,int price, int fresh) {
		this.name =  name;
		this.price = price;
		this.fresh = fresh;
		
	}

	
	public void showInfo() {
		System.out.println("====================");
		System.out.println("name : " + name);
		System.out.println("price : " + price);
		System.out.println("fresh : " + fresh);
		System.out.println("====================");
	}
	
}
