package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intStudent = new int[5];
		int pizzaBox = 0;
		int pizzaPcs = 0;
		int intSum = 0;
		System.out.println("===================================");
		System.out.println("인원수  피자주문  전체 조각수");
		System.out.println("-----------------------------------");
		for (int i = 0; i < 5; i++) {
			intStudent[i] = rnd.nextInt(10) + 50;
			pizzaBox = (intStudent[i]/6);
			
			if(intStudent[i] % 6 != 0) {
				pizzaBox++;
			}
			pizzaPcs = pizzaBox +6;
			System.out.printf("%d %d %d\n",intStudent[i],pizzaBox,pizzaPcs);
			
			
		}
		intSum += pizzaBox;
		System.out.println("================================");
		System.out.printf("전체 주문 수량box : %d",intSum);

	}

}
