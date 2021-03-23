package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		int[] KorSum = new int[5];
		int[] EngSum = new int[5];
		int[] MathSum = new int[5];

		int[] intSum = new int[5];
		float[] floatAvg = new float[5];

		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;

		}
		System.out.println("=============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < 5; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

		}
		for (int i = 0; i < 5; i++) {
			floatAvg[i] = (float) intSum[i] / 3;
			KorSum[i] = intKor[i];
			EngSum[i] = intEng[i];
			MathSum[i] = intMath[i];
			
			System.out.printf("%d	%d	%d	%d	%d	%.2f\n", i + 1, intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
			
				
		} 
		//System.out.printf("총점:%d  %d  %d",KorSum[i],EngSum[i],MathSum[i]);
		
		System.out.println("=============================================");
		

	}

}
