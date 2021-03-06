package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03A {

	public static void main(String[] args) {
		
		int linelength = 30;

		Scanner scan = new Scanner(System.in);

		System.out.println(LinesService.dLines(linelength));
		System.out.println("두수의 4칙연산");
		System.out.println(LinesService.dLines(linelength));
		System.out.println("두개의 정수를 입력합니다.");
		System.out.print("정수1 >>");
		int num1 = scan.nextInt();
		System.out.print("정수2 >>");
		int num2 = scan.nextInt();
		System.out.println(LinesService.sLines(linelength));
		System.out.printf("%d + %d = %d\n ", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n ", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n ", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %.2f\n ", num1, num2, (float) num1 / num2);
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		System.out.println(LinesService.dLines(linelength));
	}

}
