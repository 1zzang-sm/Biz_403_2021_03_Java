package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	
	int[] intTotal;
	float[] floatAvg;
	Scanner scan;
	
	public ScoreServiceV1() {
		intKors = new int[5];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		
		intTotal = new int[intKors.length];
		floatAvg = new float[intKors.length];
		
		scan = new Scanner(System.in);
	}
	
	public void makeScore() {
		System.out.println("각 학생의 국영수 성적을 입력하세요(0~100)");
		System.out.println("==============================================");
		
		for(int i = 0; i < intKors.length; i++) {
			
			System.out.printf("%d번학생의 국어점수는?\n",i+1);
			System.out.print(">> ");
			intKors[i] = scan.nextInt();
			System.out.println("===================");
			
			System.out.printf("%d번학생의 영어점수는?\n",i+1);
			System.out.print(">> ");
			intEngs[i] = scan.nextInt();
			System.out.println("===================");
			
			System.out.printf("%d번학생의 수학점수는?\n",i+1);
			System.out.println(">> ");
			intMaths[i] = scan.nextInt();
			System.out.println("===================");
		}
		
		
	}
	public void sumScore() {
		
		for(int i = 0; i < intKors.length; i++) {
			
			intTotal[i] = intKors[i];
			intTotal[i] += intEngs[i];
			intTotal[i] += intMaths[i];
		}
	}
	public void avgScore() {
		
		for(int i = 0; i < intKors.length; i++) {
			floatAvg[i] = (float) intTotal[i] / 3;
		}
	}
	public void printScore() {
		System.out.println("===================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0; i < intKors.length; i++) {
			
			System.out.printf("[%d]\t%3d\t%3d\t%3d\t%3d\t%3.2f\n",i+1,intKors[i],intEngs[i],intMaths[i],intTotal[i],floatAvg[i]);
		}
		System.out.println("===============================");
		
		
	}
	
	
	

}
