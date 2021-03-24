package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intArray = new int[20];
		int intSum = 0;

		for (int i = 0; i < 20; i++) {

			intArray[i] = rnd.nextInt(51) + 50;
		}
		System.out.println("===============");
		System.out.println("짝수들의 합");
		System.out.println("--------------");
		
		for (int i = 0; i < 20; i++) {
			if(intArray[i] % 2 == 0) {
				System.out.println(intArray[i]);
			}
			
		}
		for (int i = 0; i < 20; i++) {
			if(intArray[i] % 2 == 0) {
				intSum += intArray[i];
				
			}
			

		}
		System.out.println("=================");
		System.out.printf("짝수들의 합 : %d",intSum);

	}

}
