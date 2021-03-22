package com.callor.arrays;

import java.util.Random;

/*
 * num 변수와 intKor 이름하고 합하여 
 * intKor1 ~ intKor5 처럼 만들 수 있을거 같은데 안된다.
 * intKornum 이라 작성하면 java는 intKornum라는 변수를 찾으려시도한다
 * 
 */
public class Controller_15 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intKor = 0;
		int intKor1 = 0;
		int intKor2 = 0;
		int intKor3 = 0;
		int intKor4 = 0;
		int intKor5 = 0;
		int intKor6 = 0;
		int intKor7 = 0;
		int intKor8 = 0;
		int intKor9 = 0;

		int intSum = 0;

		intKor = rnd.nextInt(100) + 1;
		intKor1 = rnd.nextInt(100) + 1;
		intKor2 = rnd.nextInt(100) + 1;
		intKor3 = rnd.nextInt(100) + 1;
		intKor4 = rnd.nextInt(100) + 1;
		intKor5 = rnd.nextInt(100) + 1;
		intKor6 = rnd.nextInt(100) + 1;
		intKor7 = rnd.nextInt(100) + 1;
		intKor8 = rnd.nextInt(100) + 1;
		intKor9 = rnd.nextInt(100) + 1;

		intSum = intKor;
		intSum += intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		intSum += intKor6;
		intSum += intKor7;
		intSum += intKor8;
		intSum += intKor9;

		float floatAvg = intSum / 10f;
		System.out.println("=================");
		System.out.printf("학생1 : %d\n", intKor);
		System.out.printf("학생2 : %d\n", intKor1);
		System.out.printf("학생3 : %d\n", intKor2);
		System.out.printf("학생4 : %d\n", intKor3);
		System.out.printf("학생5 : %d\n", intKor4);
		System.out.printf("학생6 : %d\n", intKor5);
		System.out.printf("학생7 : %d\n", intKor6);
		System.out.printf("학생8 : %d\n", intKor7);
		System.out.printf("학생9 : %d\n", intKor8);
		System.out.printf("학생10 : %d\n", intKor9);
		System.out.println("-----------------");
		System.out.printf("총점 : %d 평균 : %.2f\n", intSum, floatAvg);
		System.out.println("=================");

	}

}
