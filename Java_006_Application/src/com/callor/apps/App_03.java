package com.callor.apps;

import java.util.Random;

public class App_03 {
	
	public static void main(String[] args) {
		int length = 20;
		int[] intNums = new int[length];
		
		Random rnd = new Random();
		
		for(int i = 0; i < length; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		for(int i = 0; i < length; i++) {
			if(intNums[i] % 2 == 0) {
				System.out.printf("%d번 짝수 : %d\n",i, intNums[i]);
			}
			
		}
	}

}
