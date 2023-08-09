package ch05;

public class Peach extends Fruit {

	String origin;

	public Peach(String name, int price) {
		super(name, price); // 부모생성자 호출해 주어야 한다.
		origin = "청도";
	}

} // end of class
