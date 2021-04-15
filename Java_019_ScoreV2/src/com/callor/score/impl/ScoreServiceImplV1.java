package com.callor.score.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	Scanner scan;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void insertScore() {
		// TODO 점수를 입력받는 곳
			System.out.println("=".repeat(35));
		while (true) {
			System.out.println("학번을 입력하세요(1이상)");
			System.out.println("(종료:QUIT)");
			System.out.print(">> ");
			String strIn = scan.nextLine();
			if (strIn.trim().equals("QUIT")) {
				return;
			} else if (strIn.trim().equals("")) {
				System.out.println("아무것도 입력하지 않았습니다. 다시입력하세요");
				continue;
			}
			Integer intIn = null;
			

			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력가능");
			}
			String strNum = String.format("%05d", intIn);
			
			if (intIn.equals(strIn)) {
				System.out.println("동일 값을 입력할 수 없음.");
				continue;
			}
			System.out.println("국어점수를 입력하세요.(0 ~ 100)");
			System.out.print(">> ");
			strIn = scan.nextLine();
			Integer kor = null;
			try {
				kor = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력가능");
				continue;
			}
			if(kor < 0 || kor > 100) {
				System.out.println("입력 범위 초과(0 ~ 100)");
				continue;
			}
			System.out.println("영어점수를 입력하세요.(0 ~ 100)");
			System.out.print(">> ");
			strIn = scan.nextLine();
			Integer eng = null;
			try {
				eng = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				continue;
			}
			if(eng < 0 || eng > 100) {
				System.out.println("입력 범위 초과(0 ~ 100)");
				continue;
			}
			System.out.println("수학점수를 입력하세요.(0 ~ 100)");
			System.out.print(">> ");
			strIn = scan.nextLine();
			Integer math = null;
			try {
				math = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				continue;
			}
			if(math < 0 || math > 100) {
				System.out.println("입력 범위 초과(0 ~ 100)");
				continue;
			}
			ScoreVO vo = new ScoreVO();
			vo.setNum(strNum);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			scoreList.add(vo);
			
		}

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

	}

}
