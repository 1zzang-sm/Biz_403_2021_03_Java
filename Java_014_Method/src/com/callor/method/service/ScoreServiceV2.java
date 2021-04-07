/*
 * InputServiceV2 class 의 inputValue() method에 
 * "국어",0,100 값을 전달한 후 return 값이 null이면 종료, 정수값이면 점수 : ?? 형식으로 출력
 */
package com.callor.method.service;
/*
 * InputServiceV2 클래스르 ㄹ활용하는 method가 2개 이상일 경우에는 
 * 	모든 변수, 객체를 클래스영역(맴버변수영역)에 선언하자
 *	 그리고 생성자에서 초기화하여 사용하도록 한다.
 */

public class ScoreServiceV2 {
	
	protected InputServiceV2 inService;
	
	public ScoreServiceV2() {
		inService = new InputServiceV2();
	}
	public void inputScore() {
		// InputServiceV2 클래스를 활용한 method가 한곳 뿐일때는 이처럼 method 지역변수 영역
		Integer intKor = inService.inputValue("국어", 0, 100);
		
		if(intKor != null){
			System.out.println("점수 : " + intKor);
		}else {
			System.out.println("종료");
		}
		
	}
	

}
