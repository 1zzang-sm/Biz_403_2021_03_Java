package com.callor.apps;

import java.util.Random;

/*
 * 배열에 저장된 값중에서 짝수가 저장된
 * 최초의 위치는 어디인가?
 */
public class App_04A {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		//int intNums[] = new int[20];
		
		int[] intNums = new int[20];
		
		for(int i = 0; i < intNums.length; i++) {
			
			intNums[i] = rnd.nextInt(100)+1;
		}
		for(int i = 0; i < intNums.length; i++) {
			if(intNums[i] % 3 == 0) {
				System.out.print("3의배수가 처음나타나는 곳");
				System.out.println(i + "번" );
				break;			}
		}
	}
	

}