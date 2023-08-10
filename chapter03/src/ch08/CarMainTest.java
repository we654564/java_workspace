package ch08;

public class CarMainTest {

	// 메인 함수
	public static void main(String[] args) {

		// 업캐스팅
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("-----------------------------------");

		Car manualCar = new ManualCar();
		manualCar.run();

	} // end of main

} // end of class
