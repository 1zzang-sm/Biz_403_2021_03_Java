package com.callor.apps;

import java.util.Random;

public class App_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[20];
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		for(int i =0; i < intNums.length; i++) {
			if(intNums[i] % 2 == 0) {
				System.out.printf("%d번째 값 : %d",i,intNums[i]);
				break;
			}
		}
		
	}

}
