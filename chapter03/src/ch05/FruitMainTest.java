package ch05;

public class FruitMainTest {

	// 메인 함수
	public static void main(String[] args) {

		// 다형성
		// ! 용어 - 업캐스팅

		Fruit fruit1 = new Banana("델몬트 바나나", 2_000);
		Fruit fruit2 = new Peach("청도 복숭아", 3_000);

		System.out.println("----------------------");
		fruit1.showInfo();
		System.out.println("----------------------");
		fruit2.showInfo();
		System.out.println("----------------------");
		// 바나나 객체에 origin 변수값을 출력 해보자.
		// 업캐스팅 된 상태에서는 컴파일 시점만 확인을 한다.
		// System.out.println(fruit1.origin); - 오류확인
		// ?? 컴파일 시점에 어떻게 origin 이라는 변수를 출력할까?
		
		// 업캐스팅 된 상태에서 다운캐스팅을 하려면 형 변환이 필요하다.
		// 1단계 - 다운캐스팅
		Banana banana1 = ((Banana) fruit1);
		System.out.println(banana1.origin);

		// 2단계 - 다운캐스팅
		String chechOrigin = ((Banana) (fruit1)).origin; // ((Banana)(fruit1)) 부분은 바나나를 표시한 것

	} // end of main

} // end of class
