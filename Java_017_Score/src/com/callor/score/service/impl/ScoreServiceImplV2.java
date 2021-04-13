package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.zzang.standard.InputService;
import com.zzang.standard.impl.InputServiceImplV1;

	/*
	 * 1. ScoreServiceImplV1을 상속받고
	 * 2. inputScore() method를 작성
	 * 3. 학번, 학생이름, 3과목 성적을 입력받아 List<ScoreVO> scoreList 객체에 추가
	 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected String[] subjectList;
	protected Integer[] subjectScore;
	protected Scanner scan;
//	protected final int kors = 0;
//	protected final int engs = 1;
//	protected final int maths = 2;

	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		subjectList = new String[] { "국어", "영어", "수학" };
		subjectScore = new Integer[subjectList.length];
		scan = new Scanner(System.in);
	}

	public void inputStudent() {
		while (true) {
			Integer num = inService.inputValue("학번", 1);
			System.out.printf("[%03d] 학생의 이름을 입력하세요.\n", num);
			System.out.print(">> ");
			String strIn = scan.nextLine();
			String strNum = String.format("2021%03d", num);
			if (strIn == null) {
				return;
			} else if (strIn.trim().equals("")) {
				System.out.println("아무것도 입력이 안됨");
				System.out.println("다시 입력하시오.");
				continue;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setName(strIn);
			scoreList.add(scoreVO);
			return;
		}
	}
	public void inputScore() {
		for (int i = 0; i < subjectList.length; i++) {
			subjectScore[i] = inService.inputValue(subjectList[i], 0, 100);
			if (subjectScore[i] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(subjectScore[0]);
		scoreVO.setEng(subjectScore[1]);
		scoreVO.setMath(subjectScore[2]);
		System.out.println("=".repeat(40));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(40));
		scoreList.add(scoreVO);
	}
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		Integer nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
	}
}