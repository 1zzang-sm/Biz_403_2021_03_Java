package com.callr.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callr.app.model.ScoreVO;
import com.callr.app.service.ScoreService;
import com.zzang.standard.InputService;
import com.zzang.standard.MenuService;
import com.zzang.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected InputService inService;
	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	Scanner scan;

	@Override
	public void selectMenu() {
		// TODO jar 이용
		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는 것이 좋다. 하지만, 객체를 생성할때 전달해야할
		 * 매개변수(파라메터)에 대하여 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 객체를 생성하는 코드를 작성하여도 된다.
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적 입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		scoreMenu.add("");

		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무 종료!");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}

	}

//	public String inputScore(String strNum) {
//		
//
//		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
//		while (true) {
//			scan = new Scanner(System.in);
//			System.out.println("학번을 입력하세요(입력중단:QUIT");
//			System.out.print(">> ");
//			strNum = scan.nextLine();
//
//			if (strNum.trim().equals("QUIT")) {
//				return null;
//			} else if (strNum.trim().equals("")) {
//				System.out.println("아무것도 입력하지 않았습니다.");
//				System.out.println("다시 입력해주세요.");
//			}
//			Integer intIn = null;
//			try {
//				intIn = Integer.valueOf(strNum);
//			} catch (NumberFormatException e) {
//				System.out.println("학번은 1이상의 정수만 입력해주세요");
//				continue;
//			}
//			System.out.printf("[%03d]학생의 이름을 입력하세요.\n", strNum);
//			String strIn = scan.nextLine();
//			if (strIn.trim().equals("QUIT")) {
//				System.out.println("업무종료");
//				return null;
//			} else if (strIn.trim().equals("")) {
//				System.out.println("아무것도 입력하지 않았습니다.");
//				System.out.println("다시 입력해주세요.");
//				continue;
//			}
//			ScoreVO scoreVO = new ScoreVO();
//			scoreVO.setNum(strNum);
//			scoreVO.setName(strIn);
//			scoreList.add(scoreVO);
//			return strNum;
//		}
//	}
//
	@Override
	public void inputScore() {
//		// TODO 학번,이름,과목별 성적 입력 ScoreVO 객체에 담고, List에 추가
//		// = ScoreVO 클래스를 사용하여 생성한 socreVO객체에 담고
//		// = scoreVO에 담고
//		this.inputScore(null);
//		String[] subject = new String[] { "국어", "영어", "수학" };
//		inService = new InputServiceImplV1();
//		inService.inputValue(subject[0], 0, 100);
//		inService.inputValue(subject[1], 0, 100);
//		inService.inputValue(subject[2], 0, 100);
//
}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다.");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
				/*
				 * 파일에 저장할때
				 * 각 데이터를 컴마, 로 구분하고 입력하고
				 * 파일이름을 *.csv로 저장하면
				 * excel에서 파일을 읽을 수 있다.
				 * 
				 * csv : comma-separated-variables
				 *  컴마로 값을 구분
				 */
				int nSize = scoreList.size();
				for(int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.print(vo.getMath() + ",");
					out.print(vo.getTotal() + ",");
					out.println(vo.getAvg());
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다.");
				System.out.println("파일 이름을 다시 입력해 주세요.");
				continue;
			}
			return;
		}
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
