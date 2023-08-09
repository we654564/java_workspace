package ch05;

public class Animal {
	
	public void move() {
		System.out.println(" 동물이 움직입니다. ");
	}
	
	public void eating() {
		System.out.println(" 동물이 먹이를 먹습니다. ");
	}
} // end of Animal class

// 상속을 사용하게되어 호랑이 와 동물 두가지로 바라볼 수 있게 되었다.
class Tiger extends Animal{
	
	@Override // 오버라이드 : 기능 재정의
	public void move() {
		System.out.println(" 호랑이가 네발로 움직입니다. ");
	}
	
	@Override // 오버라이드 : 기능 재정의
	public void eating() {
		System.out.println(" 호랑이가 사냥을 합니다. ");
	}
	
}

class Human{
	

	public void move() {
		System.out.println(" 사람이 두발로 걸어 다닙니다. ");
	}
	

	public void eating() {
		System.out.println(" 사람이 밥을 먹습니다. ");
	}
	
	public void readBook() {
		System.out.println(" 사람이 책을 읽습니다. ");
	}
	
}