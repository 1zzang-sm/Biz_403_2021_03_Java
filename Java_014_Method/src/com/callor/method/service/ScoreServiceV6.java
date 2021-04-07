package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 1. 과목명을 subject = {"국어","영어","수학"} 배열에 선언
 * 2. 성적 정보를 처리할 List<ScoreVO> scoreList를 생성
 * 3. inputScore() method를 선언하고
 * 4. InputServiceV2의 inputValue() method를 사용하여 
 * 		5명 학생의 각 과목의 점수를 입력
 * 5. 입력받는 점수를 ScoreVO 객체로 생성한 후 , scoreList에 add()
 */
public class ScoreServiceV6 {

	String[] subject;
	List<ScoreVO> scoreList;
	InputServiceV2 inService;
	public ScoreServiceV6() {
		subject = new String[] {"국어","영어","수학"};
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		Integer score[] = new Integer[subject.length];
		for(int i = 0; i < 5; i++) {// 5명
				
			for(int j = 0; j < subject.length; j++) { //5명의 각한명씩의 3과목 점수입력
				score[j] = inService.inputValue(subject[j], 0, 100);
				
			}
			ScoreVO scoreVO = new ScoreVO(); //생성 초기화
			scoreVO.setKor(score[0]);  //0번째 국어
			scoreVO.setEng(score[1]); //1번째 영어
			scoreVO.setMath(score[2]); //2번째 수학
			scoreList.add(scoreVO); // 리스트에저장
		}
		
		
	}
	public void printScore() {
		
		System.out.println("=".repeat(30));
		System.out.println("국어\t영어\t수학");
		System.out.println("-".repeat(30));
		ScoreVO scoreVO = new ScoreVO();
		
		for(int index = 0; index < scoreList.size(); index++) {
			System.out.print(scoreList.get(index).getKor() + "\t");
			System.out.print(scoreList.get(index).getEng() + "\t");
			System.out.print(scoreList.get(index).getMath() + "\n");
			
			
//			System.out.print(scoreVO.getKor() + "\t");
//			System.out.print(scoreVO.getEng() + "\t");
//			System.out.print(scoreVO.getMath() + "\t");
		}
		System.out.println("=".repeat(30));
	}
	
}
