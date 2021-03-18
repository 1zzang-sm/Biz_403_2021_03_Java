package com.callor.var;

public class Varriable_05 {
	
	public static void main(String[] args) {
		
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; // 1
		
		intNum ++; // 2
		intSum += intNum; // 2+1 = intSum = 3
		intNum++; //3
		intSum += intNum; // 3+3 = intSum = 6
		intNum++; //4
		intSum += intNum; // 6+4 = intSum = 10
		intNum++; //5
		intSum += intNum; // 10+5 = intSum = 15
		
		
		System.out.println(intSum);
		
		
		
		
		
		
		
		
	}

}
