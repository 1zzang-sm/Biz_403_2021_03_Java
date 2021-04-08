package com.callor.app.service;

import java.util.Scanner;

/*
 * 1. inputValue(String title),
 * 		inputValue(String title, int start)
 * 		inputValue(String title, int start, int end) 
 * 	method 선언
 * 2. title + "값을 입력하세요" prompt를 보여주고
 * 3. 정수 또는 QUIT를 키보드를 통해 입력받는다.
 * 4. 입력 값이 QUIT이면 null을 return하고 
 * 5. 정수이면 입력한 정수 값을 return 한다.
 * 6. Exception이 발생할 경우 적절한 예외처리를 수행한다.
 */
public class InputServiceV1 {
	Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title, int start, int end) {
		Integer intNum = this.inputValue(title);
		String strName = String.format("%s의 입력범위는(%d ~ %d", title, start, end);

		while (true) {
			if (intNum != null) {
				if (intNum < start || intNum > end) {
					System.out.println("입력범위 초과!!");
					System.out.printf("입력범위는 (%d ~ %d) 입력하세요\n", start, end);
					continue;
				} else {
					System.out.println("입력값은 : " + intNum);
					return intNum;
				}
			}
		}
	}

	public Integer inputValue(String title, int start) {
		Integer intNum = this.inputValue(title);

		String strName = String.format("%s는 %d 이상 입력해야 함", title, start);
		while (true) {
			if (intNum != null) {
				if (intNum < start) {
					System.out.println("입력오류");
					continue;
				}
				return intNum;
			}

		}

	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + "값을 입력하세요.(입력취소 : QUIT)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				Integer intInput;
				try {
					intInput = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("입력 오류!!");
					System.out.println("정수, QUIT만 입력하세요.");
					continue;
				}
				return intInput;
			}

		}
	}

}
