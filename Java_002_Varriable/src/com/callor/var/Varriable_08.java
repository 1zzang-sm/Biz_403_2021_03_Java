package com.callor.var;

public class Varriable_08 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 1;
		
		//1 ~ 10까지 덧셈을 수행
		
		intSum += intNum++; //0 = 1+0 =1
		intSum += intNum++; //1 = 1+1 = 3
		intSum += intNum++; //3 = 2+1 = 6
		intSum += intNum++; //6 = 3+1 = 10
		intSum += intNum++; //10 = 4+1 = 15
		intSum += intNum++; //15 = 5+1 = 21
		intSum += intNum++; //21 = 6+1 = 28
		intSum += intNum++; //27 = 7+1 = 35
		intSum += intNum++; //35 = 8+1 = 44
		intSum += intNum++; //44 = 9+1 = 55
		
		System.out.println(intSum);
		
		
		
		
		
		
	}

}
