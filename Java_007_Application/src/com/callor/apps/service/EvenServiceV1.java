package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNums;
	
	public EvenServiceV1() {
		intNums = new int[100];
	}
	

	public void makeSum() {
		Random rnd = null;
		rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
	}		

	public void printSum() {
		
		System.out.println("==============================");
		System.out.println("짝수들의 리스트");
		System.out.println("------------------------------");
		for(int i = 0; i < intNums.length; i ++) {
			if(intNums[i] % 2 == 0 ) {
				System.out.printf("[%d]짝수 : %d\n",i+1,intNums[i]);
			}
		}
		System.out.println("------------------------------");
		int intSum = 0;
		int mix = 0;
		int nCount = 0;
		for(int i = 0; i < intNums.length; i++) {
			if(intNums[i] % 2 == 0) {
				intSum += intNums[i];
				mix++;
			}
		}
		System.out.printf("갯 수 : %d\n",mix);
		System.out.printf("총 합 : %d\n",intSum);
		
	}
}
