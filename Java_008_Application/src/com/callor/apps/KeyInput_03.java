package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(LinesService.dLines(40));
		System.out.println("정수값을 키보드로 입력하고 Enter를 눌러주세요.");
		System.out.println("먼저 정수 1개를 입력하세요.");
		System.out.println(LinesService.sLines(40));
		
		System.out.print("정수1 >> ");
		int num = scan.nextInt();
		
		System.out.println("한번 더 정수 1개를 입력해 주세요.");
		System.out.print("정수2 >>");
		int num2 = scan.nextInt();
		System.out.println(LinesService.dLines(40));
		
		System.out.printf("%d + %d = %d\n%d - %d = %d\n%d x %d = %d\n%d / %d = %d\n"
				,num,num2,num+num2,num,num2,num-num2,num,num2,num*num2,num,num2,num/num2);
		
		
	}

}
