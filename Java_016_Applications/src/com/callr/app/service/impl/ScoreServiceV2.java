package com.callr.app.service.impl;

import java.util.Scanner;

import com.callr.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService {

	Scanner scan;

	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴 선택창 만들기
		System.out.println("=".repeat(50));
		System.out.println("빛고을 고교 성적처리 2021");
		System.out.println("=".repeat(50));
		System.out.println("1. 성적입력");
		System.out.println("2. 성적리스트 출력");
		System.out.println("3. 성적 저장");
		System.out.println("QUIT. 종료");
		System.out.println("-".repeat(50));
		System.out.print("업무선택>> ");
		String strIn = scan.nextLine();

		while (true) {
			if (strIn.trim().equals("QUIT")) {
				System.out.println("업무 종료");
				return;
			}else if(strIn.trim().equals("")) {
				System.out.println("아무것도 입력하지 않았습니다.");
				System.out.println("다시 입력하시오");
				continue;
			}
			Integer intIn = null;

			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("입력 (1 ~ 3), QUIT 만 가능");
				continue;
			}
			if(intIn == 1) {
				//성적입력 
			}else if(intIn == 2) {
				//성적리스트 출력
			}else if(intIn == 3) {
				//성적 저장
			}else if(intIn < 1 || intIn > 3) {
				System.out.println("입력 (1 ~ 3), QUIT만 가능");
				continue;
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
