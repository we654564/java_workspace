package ch05;

public class Fruit {

	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void showInfo() {
		System.out.println(" 상품명 : " + name);
		System.out.println(" 가격 : " + price);
	}

} // end of class
