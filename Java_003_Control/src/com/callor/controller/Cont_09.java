package com.callor.controller;

public class Cont_09 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			boolean bYes = i % 2 == 0;
			
			if (bYes) {
				System.out.println(i + "는 짝수");
				
			} else {
				System.out.println(i + "는 짝수가 아님");
		
			
			}
			
			for(int index = 0; index < 10; index++) {
				
				boolean bYes1 = i % 3 == 0;
				if ( bYes1) {
					System.out.println(i + "는 3의 배수");
					
				} else {
					System.out.println(i + "는 3의 배수 아님");
				}
				
				for(int i1 = 0; i1 < 10; i1++) {
					
					if (i1 % 3 == 0) {
						System.out.println(i1 + "는 3의배수");
						
						
					}else {
						System.out.println(i1 + "는 3의 배수가 아님");
					}
						
				}
			}
			
		}
	}
}
