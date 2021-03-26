package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = 1;
		int linelength = 40;
		int nums = 0;

		System.out.println(LinesService.dLines(linelength));
		System.out.println("홀,짝 & 소수 검사");
		System.out.println("정수를 입력하세요.");
		System.out.println(LinesService.sLines(linelength));
		System.out.print(">>");
		nums = scan.nextInt();
		System.out.println(LinesService.sLines(linelength));

		for (int i = 0; i < length; i++) {
			int num = 0;
			int numP = length;
			for (num = 2; num < numP; num++) {

				if (numP % num == 0) {
					break;
				}

			}
			if (nums % 2 == 0 && num < numP) {
				System.out.printf("입력한 정수 %d는 짝수입니다.\n", nums);
				System.out.printf("입력한 정수 %d는 소수가 아니다\n", nums);
			} else if (nums % 2 == 0 && num > numP) {
				System.out.printf("입력한 정수 %d는 짝수입니다.\n", nums);
				System.out.printf("입력한 정수 %d는 소수입니다.\n", nums);
			} else if (nums % 2 == 1 && num < numP) {
				System.out.printf("입력한 정수 %d는 짝수가 아니다.\n", nums);
				System.out.printf("입력한 정수 %d는 소수가 아니다\n", nums);
			} else if (nums % 2 == 1 && num > numP) {
				System.out.printf("입력한 정수 %d는 짝수가 아니다.\n", nums);
				System.out.printf("입력한 정수 %d는 소수입니다.\n", nums);
			}

		}

	}
}
