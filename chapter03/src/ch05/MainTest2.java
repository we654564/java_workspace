package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {

	// 메인 함수
	public static void main(String[] args) {
		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아보세요
		// 실행도 시켜 봅시다.
		Marine marine1 = new Marine("마린");
		Zealot zealot1 = new Zealot("질럿");
		Zergling zergling1 = new Zergling("저글링");

		Unit[] unit1 = new Unit[3];
		unit1[0] = marine1;
		unit1[1] = zealot1;
		unit1[2] = zergling1;

		unit1[0].attack(zealot1);
		unit1[1].attack(zergling1);
		unit1[2].attack(marine1);

		unit1[0].showInfo();
		unit1[1].showInfo();
		unit1[2].showInfo();

	} // end of main

} // end of class
