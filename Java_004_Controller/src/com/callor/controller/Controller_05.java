package com.callor.controller;

public class Controller_05 {
	
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
		
		boolean bYes = num1 % 3 == 0 &&
					   num2++ % 4 == 0;
		
		bYes = num1 % 3 == 0 && 
					 ++num2 % 3 == 0;
		
		bYes = num1 > 4 && ++num2 > 5;
		System.out.println(num2);
		//num2의 값 
				
				
		
		
		
		
	}

}
