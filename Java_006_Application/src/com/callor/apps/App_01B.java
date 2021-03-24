package com.callor.apps;

import java.util.Random;

public class App_01B {

	public static void main(String[] args) {
		
		int Length = 20;
		int[] intHall = new int[Length];
		int intSum = 0;
		Random rnd = new Random();
		
		for(int i = 0; i < Length; i++) {
			intHall[i] = rnd.nextInt(41)+60;
		}
		System.out.println("===================");
		System.out.println("60~100까지의 홀수");
		System.out.println("-------------------");
		for(int i =0; i < Length; i++) {
			if(intHall[i] % 2 == 1) {
				System.out.println(intHall[i]);
			}
		}
		intSum = 0;
		for(int i =0; i < Length; i++) {
			if(intHall[i] % 2 == 1) {
				intSum += intHall[i];
			}
		}
		
		System.out.println("====================");
		System.out.printf("홀수들의 합 : %d\n",intSum);
	}
	

}
