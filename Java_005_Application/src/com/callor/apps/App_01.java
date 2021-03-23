package com.callor.apps;

import java.util.Random;

public class App_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intMembers = 0;
		int intPz = 0;
		intMembers = rnd.nextInt(26)+25;
		if(intMembers % 6 == 0) {
			
			//intMembers = rnd.nextInt(26)+25;
			intPz = intMembers/6 ;
			//intMembers = intPz*6;
			System.out.println("======================");
			//System.out.printf("설문조사 한 학생:%d\n주문해야 할 피자 :%.2f판\n",intMembers,floatPz);
			System.out.printf("설문조사 한 학생:%d\n주문해야 할 피자:%d\n",intMembers,intPz);
			System.out.println("======================");
		}else if(intMembers % 6 != 0) {
			
			intPz = (intMembers/6)+1;
			System.out.println("======================");
			System.out.printf("설문조사 한 학생:%d\n주문해야 할 피자:%d\n",intMembers,intPz);
			System.out.println("======================");
			
		}
		
		
		
		
		
	}

}
