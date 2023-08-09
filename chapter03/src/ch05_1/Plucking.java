package ch05_1;

public class Plucking {

	String name;

	// 속성
	public Plucking(String name) {
		this.name = name;
	}

	// getter
	public void getName(String name) {
		this.name = name;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// 기능
	public void picking(String name) {
		System.out.println(name + " 을 뽑았습니다. ");
	}

	
	
} // end of class
