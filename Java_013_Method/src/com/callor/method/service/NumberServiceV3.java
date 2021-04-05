package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("=".repeat(35));
			System.out.println("정수를 입력하세요 (범위 : 0 ~ 100)");
			System.out.println("=".repeat(35));
			System.out.println("입력 취소 : QUIT");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			Integer intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("-".repeat(35));
				System.out.println("입력 가능 : 0 ~ 100, QUIT");
				System.out.println("다시 입력하세요.");
				continue;
			}
			if (intNum < 0 || intNum > 100) {
				System.out.println("=".repeat(35));
				System.out.println("입력가능한 범위 : 0 ~ 100");
				System.out.println("다시 입력하세요.");
				continue;
			}
			return intNum;
		}
	}

}
