package ch06;

import java.util.Iterator;

public class CastingExample3 {

	// 메인 함수
	public static void main(String[] args) {

		// 업캐스팅
		Animal animal = new Bird();

		// 다운캐스팅
		Bird bird = (Bird) animal;

		// 배열
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();

		System.out.println("-----------------------------");
		for (Animal a : animals) {
			a.makeSound();
			if (a instanceof Bird) {
				Bird targetBird = (Bird) a;
				targetBird.fly();
			} // end of if
			System.out.println("-----------------------------");
		} // end of for

	} // end of main

} // end of class
