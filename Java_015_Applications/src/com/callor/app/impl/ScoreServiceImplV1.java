//package com.callor.app.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.callor.app.model.ScoreVO;
//import com.callor.app.service.ScoreService;
//import com.zzang.standard.InputService;
//import com.zzang.standard.impl.InputServiceImplV1;
//
///*
// * 2. List<ScoreVO> scoreList 객체를 생성하고
// * 3. 학생 5명의 학번, 이름, 성적을 입력받아 scoreList에 추가
// */
////public class ScoreServiceImplV1 implements ScoreService {
////	protected InputService inService;
////	protected List<ScoreVO> scoreList;
////	protected ScoreVO scoreVO;
////	protected Scanner scan;
////
////	public ScoreServiceImplV1() {
////		inService = new InputServiceImplV1();
////		scoreList = new ArrayList<ScoreVO>();
////		scoreVO = new ScoreVO();
////		scan = new Scanner(System.in);
////
////	}
//
//	@Override
//	public void selectMenu() {
//		// TODO 메뉴 설정
//		Integer intIn = 0;
//		while (true) {
//			System.out.println("=".repeat(50));
//			System.out.println("학생 성적처리 프로그램");
//			System.out.println("=".repeat(50));
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적리스트");
//			System.out.println("QUIT. 업무종료");
//			System.out.println("-".repeat(50));
//			System.out.print(">> ");
//			String strIn = scan.nextLine();
//			if (strIn.trim().equals("QUIT")) {
//				System.out.println("업무종료");
//				return;
//			}
//
//			try {
//				intIn = Integer.valueOf(strIn);
//			} catch (NumberFormatException e) {
//				System.out.println("입력메뉴 확인!!");
//				System.out.println("1~2 , QUIT 만 입력가능");
//			}
//			if (intIn == 1) {
//				this.inputName();
//
//			} else if (intIn == 2) {
//				this.printScore();
//
//			} else if (intIn < 1 || intIn > 2) {
//				System.out.println("입력메뉴 확인!!");
//				System.out.println("1~2 , QUIT 만입력가능");
//				continue;
//			}
//			
//		}
//	}
//
//	@Override
//	public void inputName() {
//		// TODO 5명의 학생 학번, 이름 생성
//		
//		System.out.println("학생의 이름을 입력하세요.(QUIT : 메뉴화면)");
//		System.out.print(">> ");
//		String strIn = scan.nextLine();
//		if (strIn.trim().equals("QUIT")) {
//			return;
//		}
//		Integer intIn = 0;
//		while (true) {
//			System.out.println("학생의 학번을 입력하세요.(QUIT : 메뉴화면)");
//			System.out.print(">> ");
//			String strIn2 = scan.nextLine();
//			if (strIn2.trim().equals("QUIT")) {
//				return;
//			}
//				else {
//				try {
//					intIn = Integer.valueOf(strIn2);
//				} catch (NumberFormatException e) {
//					System.out.println("학번은 정수입니다. 정수를 입력하세요");
//					continue;
//				}
//			}
//			scoreVO = new ScoreVO();
//			scoreVO.setName(strIn);
//			scoreVO.setNum(strIn2);
//			this.inputScore();
//			return;
//
//		}
//	}
////
////	public void inputScore() {
////		Integer kor = this.inputScore("국어");
////		if (kor == null) {
////			return;
////		}
////		Integer eng = this.inputScore("영어");
////		if (eng == null) {
////			return;
////		}
////		Integer math = this.inputScore("수학");
////		if (math == null) {
////			return;
////		}
////		scoreVO.setKor(kor);
////		scoreVO.setEng(eng);
////		scoreVO.setMath(math);
////		scoreList.add(scoreVO);
////	}
//
////	@Override
////	@Override
////
////	public Integer inputScore(String subject) {
////		// TODO 각 학생의 점수입력
////		Integer intIn = 0;
////
////		while (true) {
////			System.out.println(subject + "점수를 입력하세요(QUIT : 메뉴화면)");
////			System.out.print(">> ");
////			String strIn = scan.nextLine();
////			if (strIn.trim().equals("QUIT")) {
////				return null;
////			} else {
////				try {
////					intIn = Integer.valueOf(strIn);
////				} catch (NumberFormatException e) {
////					System.out.println("정수를 입력하세요");
////					continue;
////				}
////			}
////			if (intIn < 0 || intIn > 100) {
////				System.out.println("점수입력 오류");
////				System.out.println("점수를 다시입력하세요 ( 0 ~ 100)");
////				continue;
////			}
////			return intIn;
////		}
////
////	}
//
//	@Override
//	public void printScore() {
//		// TODO 메뉴에서 2번선택시 출력화면
//
//		System.out.println("=".repeat(50));
//		System.out.println("이름\t학번\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("=".repeat(50));
//		for (int i = 0; i < scoreList.size(); i++) {
//			ScoreVO vo = scoreList.get(i);
//			System.out.print(vo.getName() + "\t");
//			System.out.print(vo.getNum() + "\t");
//			System.out.print(vo.getKor() + "\t");
//			System.out.print(vo.getEng() + "\t");
//			System.out.print(vo.getMath() + "\t");
//			System.out.print(vo.getTotal() + "\t");
//			System.out.print(vo.getAvg() + "\n");
//			
//			
////			System.out.print(scoreList.get(i).getName() + "\t");
////			System.out.print(scoreList.get(i).getNum() + "\t");
////			System.out.print(scoreList.get(i).getKor() + "\t");
////			System.out.print(scoreList.get(i).getEng() + "\t");
////			System.out.print(scoreList.get(i).getMath() + "\t");
////			System.out.print(scoreList.get(i).getTotal() + "\t");
////			System.out.printf("%3.2f\t\n", scoreList.get(i).getAvg());
//
////			System.out.print(scoreVO.getName() + "\t");
////			System.out.print(scoreVO.getNum() + "\t");
////			System.out.print(scoreVO.getKor() + "\t");
////			System.out.print(scoreVO.getEng() + "\t");
////			System.out.print(scoreVO.getMath() + "\t");
////			System.out.print(scoreVO.getTotal() + "\t");
////			System.out.print(scoreVO.getAvg() + "\n");
////			return;
//		}
//		System.out.println("=".repeat(50));
//
//	}
//
//}
