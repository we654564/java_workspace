package ch05_1;

import java.util.Random;

public class PluckingMainTest {

	// 메인 함수
	public static void main(String[] args) {

		Plucking a = new TeddyBear("곰인형1");
		Plucking b = new TeddyBear("곰인형2");
		Plucking c = new TeddyBear("곰인형3");
		Plucking d = new Phone("핸드폰1");
		Plucking e = new Phone("핸드폰2");
		Plucking f = new Phone("핸드폰3");
		Plucking g = new Liquor("양주1");
		Plucking h = new Liquor("양주2");
		Plucking i = new Liquor("양주3");
		Plucking j = new Plucking("꽝");

		Random random = new Random();
		int selected = random.nextInt(10) + 1;
		Plucking[] plu = new Plucking[10];
		plu[0] = a;
		plu[1] = b;
		plu[2] = c;
		plu[3] = d;
		plu[4] = e;
		plu[5] = f;
		plu[6] = g;
		plu[7] = h;
		plu[8] = i;
		plu[9] = j;

		System.out.println();

	} // end of main

} // end of class
