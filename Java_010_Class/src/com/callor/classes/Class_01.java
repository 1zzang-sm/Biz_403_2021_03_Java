package com.callor.classes;

import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intClass = new int[100];
		int intClass2 = 0;

		intClass2 = rnd.nextInt(51) + 50;
		System.out.println(intClass2 + "의 약수");
		for (int i = 2; i < intClass.length; i++) {
			
			if(intClass2 % i == 0) {
				System.out.print(i + " , ");
			}
			


		}

	}

}
