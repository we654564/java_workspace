package ch04;

public class Car {
	/**
	 * 자동차와 엔진에 관계에 있어서 절대 상속을 사용하지 말자. 차와 엔진에 관계는 포함 관계로 설계 해주어야 한다.
	 */
	private String name;
	private int price;
	// 포함 관계
	private Engin engin;

	public Car(String name, int price, Engin engin) {
		this.name = name;
		this.price = price;
	}
} // end of class
