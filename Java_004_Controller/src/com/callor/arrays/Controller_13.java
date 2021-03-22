package com.callor.arrays;

import java.util.Random;

public class Controller_13 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intSum = 0;
		System.out.println("==========");

		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;

			if (num % 2 == 0) {
				System.out.println(num + "는 짝수");
				intSum += num;

			}

		}
		System.out.println("----------");
		System.out.printf("합계 : %d\n", intSum);
		System.out.println("==========");

	}

}
