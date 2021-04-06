package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan;

	public ScoreServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputScore(String title, int start, int end) {
		title = String.format("%s (%d ~ %d)", title, start, end);
		while (true) {
			Integer retNum = this.inputScore(title);
			if (retNum == null) {
				System.out.println("종료");
				return null;
			} else if (retNum < start || retNum > end) {
				System.out.println("입력범위를 확인해주세요");
				continue;
			}else {
				System.out.println("입력한 값은 " + retNum);
			}
			return retNum;
		}
	}

	public Integer inputScore(String title) {
		while (true) {
			System.out.println("종료는 : QUIT");
			System.out.println(title + "의 점수를 입력하세요.");
			System.out.print(">> ");
			String strQuit = scan.nextLine();
			Integer retNum = null;
			if (strQuit.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					retNum = Integer.valueOf(strQuit);
				} catch (NumberFormatException e) {
					System.out.println("정수를 입력하세요");
					continue;
				}
			}
			return retNum;
		}
	}

}
