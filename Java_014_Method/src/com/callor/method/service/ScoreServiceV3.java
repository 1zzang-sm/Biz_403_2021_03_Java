package com.callor.method.service;
/*
 * 1. inputScore() method를 서언
 * 2. inputServiceV2 class 사용
 * 3. 국어,영어,수학 점수를 입력받고
 * 4. 각 intKor, intEng, intMath 변수에 저장
 * 5. 각 점수는 0 ~ 100점 범위 내에서 입력
 * 6. 입력받은 3과목의 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV3 {
	
	protected InputServiceV2 inService;
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
	public void inputScore() {
	
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}else {
			System.out.println("점수 : " + intKor);
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}else {
			System.out.println("점수 : " + intEng);
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}else {
			System.out.println("점수 : " + intMath);
		}
		Integer intSum = 0;
		float floatAvg = 0.0f;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		floatAvg = (float) intSum /3;
	
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
		
		
		
		
	}

}
