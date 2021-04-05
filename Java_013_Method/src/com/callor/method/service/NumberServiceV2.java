package com.callor.method.service;

import java.util.Scanner;

/*
 * 1. NumberServiceV2 클래스에
 * 2. inputNum() method를 선언한다.
 * 3. Scanner 클래스를 사용하여 0 ~ 100까지 중 정수를 입력받습니다.
 * 4. 입력을 취소하고 싶으면 QUIT를 입력합니다.
 * 5. QUIT를 입력했으면 null을 정수를 입력했으면 입력한 값을 return 합니다.
 */
public class NumberServiceV2 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("정수를 입력하세요.");
			System.out.print("(입력취소 : QUIT)>> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			}
			Integer num = 0;
//			try {
//				num = Integer.valueOf(strNum);
//			} catch (Exception e) {
//				System.out.println("정수(0 ~ 100),QUIT 외 입력하지마세요.");
//				continue;
//			}
			num = scan.nextInt();
			if (num < 0 || num > 100) {
				System.out.println("입력가능한 정수는 0 ~ 100");
				continue;
			}
			return num;
		}
	}
}
