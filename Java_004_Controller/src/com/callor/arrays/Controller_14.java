package com.callor.arrays;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		/*
		 * intSum변수를 어디에 선언할까?
		 * 짝수들을 어디에서 합산(누적)할까
		 * 어디에서 출력을할까
		 */

		Random rnd = new Random();

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		float floatAvg = 0f;

		for (int i = 0; i < 1; i++) {
			intKor = rnd.nextInt(100) + 1;
			intEng = rnd.nextInt(100) + 1;
			intMath = rnd.nextInt(100) + 1;
			System.out.printf("국어 : %d\n", intKor);
			System.out.printf("영어 : %d\n", intEng);
			System.out.printf("수학 : %d\n", intMath);
			intSum = intKor;
			intSum += intEng;
			intSum += intMath;
			floatAvg = intSum / 3f;
			System.out.println("=============");
			System.out.printf("총점 : %d\t평균 : %.2f", intSum, floatAvg);

		}

	}

}
