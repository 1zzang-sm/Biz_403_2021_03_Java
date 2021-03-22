package com.callor.controller;

public class Controller_01 {
	
	public static void main(String[] args) {
		// 0 ~ 99 + 1 = 1 ~ 100
		
		for( int index = 0; index < 100; index++) {
			// 1 ~ 100
			int num = index +1;
			//3의 배수이면 
			if(num % 3 == 0) {
				System.out.print(num);
				System.out.print(",");
			//4의 배수이면	
			}if(num % 4 == 0) {
				System.out.println(num);
			}
			// 3의 배수의 합, 4의 배수의 합 
			// 합을 구하기위해 변수를 선언을 한다
			int intSum3 = 0;
			int intSum4 = 0;
			int intSum5 = 0;
			for(int index3 = 0; index < 20; index++) {
				int num3 = index + 1;
				//num3값이 3의 배수이면 
				//num3값을 intSum3변수에 누적하라
				// 누적하라 : intSum3 변수에 담긴값과 새로운값을 덧셈
				// 다시 intSum3 변수에 저장하라
				
				if(num3 % 3 == 0) {
					intSum3 += num;
				}
				/*
				 * 여기에서 else if를 사용하면
				 * 3의 배수이면서 4의 배수인경우 
				 * 3의 배수에는 합산(누적)이 되지만
				 * 4의 배수에는 누락이 된다. 
				 */
				else if(num3 % 4 == 0) {
					intSum4 += num3;
					
				}
				/*
				 * 3의 배수이면서 5의 배수 
				 * num % 3== 0 AND num % == 0
				 * 
				 */
				if(num3 % 3 == 0) {
					if(num3 % 5 == 0) {
						intSum5 += num3;
					}
					
				}
			}
			System.out.println("=======");
			System.out.printf("3의배수 : %d\n",intSum3);
			System.out.printf("4의배수 : %d\n",intSum4);
			System.out.printf("5의배수 : %d\n",intSum5);
			
			
			
		}
	}

}
