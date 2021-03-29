package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	Scanner scan;
	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	int length = 50;
	int[] intTotal;
	float[] floatAvg;
	String[] strNames;
	public ScoreServiceV1() {
		intKors = new int[5];
		intEngs = new int[5];
		intMaths = new int[5];
		intTotal = new int[5];
		floatAvg = new float[5];
		strNames = new String[]{"김씨","장씨","녹씨","명씨","홍씨"};
		scan = new Scanner(System.in);
	}
	
	public void print1() {
		System.out.println(LinesService.dLines(length));
		for(int i = 0; i < intKors.length; i++) {
			
			System.out.printf("[%d]번 %3s의 시험 점수를 적으세요.\n",i+1,strNames[i]);
			System.out.println("국어시험 점수");
			System.out.print(">> ");
			intKors[i] = scan.nextInt();
			System.out.println("영어시험 점수");
			System.out.print(">> ");
			intEngs[i] = scan.nextInt();
			System.out.println("수학시험 점수");
			System.out.print(">> ");
			intMaths[i] = scan.nextInt();
			
		}
		System.out.println(LinesService.dLines(length));
	}
	public void makeSum() {
		
		
		for(int i = 0; i < intKors.length; i++) {
			intTotal[i] = intKors[i];
			intTotal[i] += intEngs[i];
			intTotal[i] += intMaths[i];
		}
	}
	public void makeAvg() {
		for(int i = 0; i < intKors.length; i++) {
			floatAvg[i] = (float) intTotal[i]/3;
		}
		
	}
	public void print2() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.dLines(length));
		for(int i = 0; i < intKors.length; i++) {
			System.out.printf("[%d]번\t%3s\t%3d\t%3d\t%3d\t%3d\t%3.2f\n",i+1,strNames[i],intKors[i],intEngs[i],intMaths[i],intTotal[i],floatAvg[i]);
		}
		System.out.println(LinesService.dLines(length));
	}
	public void print3() {
		
		for(int i = 0; i < intKors.length; i++) {
			
			System.out.printf("[%d]번 %3s의 총점 : %d 평균 : %.2f\n",i+1,strNames[i],intTotal[i],floatAvg[i]);
			
		}
		System.out.println(LinesService.dLines(length));
	}
	
	

}
