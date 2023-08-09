package ch03;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// 접근 제어 지시자 - protected
	// 상속을 받는 자식 클래스들은 접근할 수 있다.
	protected void attack() {
		System.out.println(" 기본 공격을 합니다. ");
	}

} // end of class