package com.callor.apps.service;

public class TimeServiceV1 {

	int[] intNum;

	public TimeServiceV1() {

		intNum = new int[8];

	}

	public void makeDan() {

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 4;
		}
	}

	int Count;

	public void printDan() {

		Count = 1;

		System.out.println("============");
		System.out.println("2단");
		System.out.println("------------");

		for (int i = 0; i < intNum.length; i++) {
			Count++;
			intNum[i] += i;
			System.out.printf("2 x %d : %d\n", Count, intNum[i]);
		}
		System.out.println("============");
	}
}
