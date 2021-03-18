package com.callor.var;

public class Varriable_15 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		
		intSum += intNum;
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		System.out.printf("Sum : %d, Num : %d\n",intSum, intNum);
		
		
		
	}

}
