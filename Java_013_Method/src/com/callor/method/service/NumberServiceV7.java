package com.callor.method.service;

/*
 * 1. NumberServiceV7 클래스를 선언
 * 2. {"국어","영어","수학","과학","국사"};를 요소로 갖는 문자열 배열 선언
 * 3. InputService 클래스의 inputScore() method를 선언
 * 4. InputService 클래스의 inputValue() method를 호출
 * 5. 각 과목의 점수를 입력
 * 6. 점수 범위 0 ~ 100의 유효성 검사를 수행
 */
public class NumberServiceV7 {

	String[] strSubject;

	public NumberServiceV7() {
		strSubject = new String[] { "국어", "영어", "수학", "과학", "국사" };
	}

	public void inputScore() {

		while (true) {
			if (this.inputScore(0) < 0 || this.inputScore(0) > 100) {
				System.out.println("입력범위 초과");
				System.out.println("점수는 0 ~ 100까지만 입력해주세요");
				continue;
			}
			return;
		}
	}

	public Integer inputScore(Integer retNum) {
		InputService iService = new InputService();
		
		for (int i = 0; i < strSubject.length; i++) {
			retNum = iService.inputValue(strSubject[i]);

			if(iService.inputValue(strSubject[i]) == null) {
				System.out.println("업무종료");
			}
		}
		return retNum;
	}
}
