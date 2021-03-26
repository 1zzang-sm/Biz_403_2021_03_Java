package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {
		String strName = "정수의 덧셈";

		int linelength = 40;
		int[] intNum = new int[5];
		int intTotal = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println(LinesService.dLines(linelength));
		System.out.printf("%20s\n", strName);
		System.out.println("5가지의 정수를 입력 후 Enter를 치시오");
		System.out.println(LinesService.sLines(linelength));
		for (int i = 0; i < intNum.length; i++) {

			System.out.printf("정수%d >>",i+1);
			intNum[i] = scan.nextInt();

		}
		System.out.println(LinesService.sLines(linelength));
		for (int i = 0; i < intNum.length; i++) {
			intTotal += intNum[i];
			System.out.printf("[%d]번째 입력 값 : %d\n",i+1, intNum[i]);
		}
		System.out.println(LinesService.sLines(linelength));
		System.out.printf("입력한 수의 합 : %d\n", intTotal);
		System.out.println(LinesService.dLines(linelength));

	}

}
