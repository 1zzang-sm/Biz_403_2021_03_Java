package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	//String[] strNames;
	int[] intKors;
	int[] intEngs;
	int[] intMaths;

	int[] intTotal;
	float[] floatAvg;

	public ScoreServiceV1() {
		
		//String[] strNames = {"홍길동","이몽룡","성춘향","장녹수","임꺽정","연놀부","나훈아","하춘화","유재석","허경영"};
		
		intKors = new int[10];

		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		intKors = new int[intKors.length];

		intTotal = new int[intKors.length];
		floatAvg = new float[intKors.length];

	}

	public void makeScore() {
		Random rnd = null;
		rnd = new Random();

		for (int i = 0; i < intKors.length; i++) {
			intKors[i] = rnd.nextInt(100) + 1;
			intEngs[i] = rnd.nextInt(100) + 1;
			intMaths[i] = rnd.nextInt(100) + 1;
		}
	}
	/*
	 * 총점,평균을 만드는 부분 집에서 만들기
	 */

	public void printScore() {
		System.out.println("==============================================");
		System.out.println("가나다라마바사 고교 성적리스트");
		System.out.println("----------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		//String[] strNames = {"홍길동","이몽룡","성춘향","장녹수","임꺽정","연놀부","나훈아","하춘화","유재석","허경영"};
		intTotal = new int[10];
		floatAvg = new float[10];
		int nCount = 0;
		
		for (int i = 0; i < intKors.length; i++) {
			intTotal[i] = intKors[i];
			intTotal[i] += intEngs[i];
			intTotal[i] += intMaths[i];
			nCount++;

			floatAvg[i] = (float) intTotal[i] / 3;
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n",nCount,intKors[i],intEngs[i],intMaths[i],intTotal[i],floatAvg[i]);
			}
		System.out.println("==============================================");

	}

}
