package ch08;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조작 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아서 정지합니다.");
	}

	
}
