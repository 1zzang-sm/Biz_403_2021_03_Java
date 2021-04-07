package com.callor.method.service;

import java.util.Scanner;

/*
 * 		전통적인(구조적 프로그래밍) 방법
 * 
 * 원칙적으로 같은 클래스에서 같은 이름의 method는 중복하여 작성할 수 없다.
 * 
 * 객체지향 개발 방법에서는 
 * 매개변수에 갯수, 타입, 순서가 다르면 같은 이름의 method를 중복하여 작성할 수 있다.
 * 
 * public Integer inputValue(String title); // 1
 * public Integer inputValue(String title, int start); //2
 * public Integer inputValue(String title, int start, int end); //3
 * 
 * 객체.inputValue("새우깡",100); // 자동으로 2번 method가 연결, 호출
 * 객체.inputValue(100,"새우깡"); // 매개변수 오류
 * 
 * 
 */
public class InputServiceV2 {

	protected Scanner scan;

	public InputServiceV2() {
		scan = new Scanner(System.in);
	}

//	public Integer inputValue(String title, int start) {
//		String msgTitle = String.format("%s (%d 이상의 )", title, start);
//		while(true) {
//		Integer intNum = this.inputValue(msgTitle);
//		if(intNum != null) {
//			if(intNum < start) {
//				System.out.printf("입력값은 %d 이상이어야 한다.\n",start);
//				continue;
//			}
//		}
//		return null;
//		}
//	}

	/*
	 * 점수범위에 대한 유효성 검사를 수행하는 method 이미 만들어진 inputValue(String title) method와 연동하여
	 * 사용하겠다.
	 */
	public Integer inputValue(String title, int start, int end) {
		// 유효성 검사를 수행하겠다는 메세지를 미리 작성
		String msgTitle = String.format("%s(%d ~ %d)", title, start, end);
		
		
		while (true) {
			Integer intNum = this.inputValue(msgTitle);
			//this.inputValue(String title) method가 return해준 값이 null아니면 유효성 검사수행
			if (intNum != null) {
				// 유효성 검사를 통과하지 모 ㅅ하면
				if (intNum < start || intNum > end) {
					// 메세지를 보여주고
					System.out.println("범위 초과");
					System.out.printf("입력값은 %d ~ %d\n", start, end);
					// 다시 inputValue(String title)을 호출하여 입력 받아라
					continue;
				} else
					return null;
			}
			// inputValue(String title)이 null을 return 했거나 
			// 유효한 범위의 정수를 return했으면 그 값이 담겨 있다.
			return intNum;
		}

	}

	public Integer inputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요.(입력취소 : QUIT)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intNum = null;
			if (strInput.trim().equals("QUIT")) {
				return null;
			}
			// if 조건문이 false경우 실행되는 부분
			// 굳이 else를 사용하지 않아도 문제가 없는 코드

			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("입력값 오류!!");
				System.out.println("정수, QUIT만 입력하세요");
				continue;

			}
			// try-catch block의 코드가 정상적으로 모두 완료되었을때 실행되는 부분
			// 입력한 값이 정상적으로 정수형 데이터로 변환되어 intNum 변수에 담겨 있다.
			// 입력한 정수값이 return된다.
			return intNum;
		}

	}

}
