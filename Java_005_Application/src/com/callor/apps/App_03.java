package com.callor.apps;

import java.util.Random;

public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intScores = new int[10];
		
		int intSum = 0;
		float floatAvg = 0f;
		
		
		for(int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(51)+50;
			intSum += intScores[i];
			floatAvg = intSum/10f;
			System.out.printf("%d번 점수:%d\n",i+1,intScores[i]);
		}
		System.out.println("======================");
		System.out.printf("총점:%d 평균:%.2f\n",intSum,floatAvg);
		
	}

}
