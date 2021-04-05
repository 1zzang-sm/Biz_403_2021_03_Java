package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("=".repeat(30));
			System.out.println(title + "값을 입력하세요");
			System.out.println("입력범위는 0 ~ 100입니다.");
			System.out.println("=".repeat(30));
			System.out.println("입력취소 : QUIT");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intNum = null;
			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("=".repeat(30));
					System.out.println("입력 오류!!");
					System.out.println("정수만 입력하세요.");
					continue;
				}
			}
			if (intNum < 0 || intNum > 100) {
				System.out.println("=".repeat(30));
				System.out.println("입력 오류!!");
				System.out.println("입력범위는 0 ~ 100입니다.");
				continue;
			}
			 return intNum;
		}
	}
}
