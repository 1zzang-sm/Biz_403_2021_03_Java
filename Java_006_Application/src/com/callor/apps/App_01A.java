package com.callor.apps;

import java.util.Random;

public class App_01A {
	/*
	 * {  } 내에 있는 코드는 최소화 하자
	 * 작은 일들로 분해하기
	 * 
	 * 나누어서 정복하라 : Divide and Conquer
	 */
	public static void main(String[] args) {
		/*
		 * 배열의 크기를 변수에 설정해 ㄷ두고
		 * 코드내에서 공통으로 사용하기
		 */
		int numsLength = 20;
		
		int[] nums = new int[numsLength];
		int intSum = 0;
		Random rnd = new Random();
		//배열 값정하기
		for(int i = 0; i < numsLength; i++) {
			//먼저 선언되어 있는 배열의 값을 저장하기
			nums[i] = rnd.nextInt(100)+1;
			
		}
		//짝수들의 리스트 출력하기
		for(int i = 0; i < numsLength; i++) {
			//배열에 저장된 값을 읽기
			//읽은 값이 짝수인가 검사 후 출력
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
		//intSum에 이전 코드에서 어떤 값이
		//저장되어 있을지 모르기 때문에 clear하고 시작
		intSum = 0;
		//합계 계산하기
		for(int i = 0; i < numsLength; i++) {
			if(nums[i] % 2 == 0) {
				intSum += nums[i];
			}
		}
		//출력하기
		System.out.println("=================");
		System.out.printf("짝수들의 합 : %d\n",intSum);
	}
	

}
