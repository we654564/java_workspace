package ch07_1;

public abstract class Computer {

	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 키다");
	}

	public void turnOff() {
		System.out.println("전원을 끄다");
	}

} // end of class
