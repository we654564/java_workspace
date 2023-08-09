package starcraft;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	// 속성
	public Unit(String name) {
		this.name = name;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 기능
	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println(name + " 이미 사망 하였습니다. ");
			return;
		}
		hp -= power;
	}

	// 기능
	public void attack(Unit unit) {
		unit.beAttacked(power);
		System.out.println(name + " 가 " + unit.getName() + " 을 공격합니다. ");

	}

	public void showInfo() {
		System.out.println("----------상태창----------");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("--------------------------");
	}

} // end of class
