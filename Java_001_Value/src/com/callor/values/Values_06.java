package com.callor.values;

public class Values_06 {
	
	public static void main(String[] args) {
		
		
		System.out.println(33 % 2);
		
		// 33을 2로 나눈 나머지가 1인가? == true
		System.out.println((33 % 2) == 1);
		
		// 33을 2로 나눈 나머지가 0인가 == false
		System.out.println( (33 %2) == 0);
		
		/*
		 * 어떤 수를 2로 나누어서 나머지가 0이면
		 * 그 어떤수는 짝수이고
		 * 그렇지 않으면 그 수는 홀수이다.
		 */
		
		System.out.println( ( 33 % 2) == 0?  
				          "짝수" : "홀수" ); // 결과표시
		System.out.println( (33 % 2) == 0); // 결과가 0이냐?
		
		/*
		 * 연산 ? true : false 
		 */
		System.out.println( (33 % 2) == 0? "짝수" : "홀수"); //비교연산자
		
		System.out.println(33 > 10 ? "33이 10보다 크다" : "33은 10보다 작다" );
		
		
		System.out.println(3 == 3 ? "맞냐?" : "틀리냐?");
		
		System.out.print("3 == 3 연산이 true이냐? : ");
		System.out.println(3 == 3 ? "맞다" : "아니다"); 
		// 3항연산([비교] [?] [true : false];
		// 2항연산 (A B 2항목 비교);
	}

}
