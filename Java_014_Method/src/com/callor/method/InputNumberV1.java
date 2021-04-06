package com.callor.method;

import java.util.Scanner;

/*
 * 1. inputValue(String title) method 선언
 * 2. title + "값을 입력하세요" prompt 를 보여주고
 * 3. 정수 또는 QUIT를 키보드를 통해 입력 받는다.
 * 4. 입력 값이 QUIT이면 null을 return하고
 * 5. 정수이면 정수 값을 return
 */
public class InputNumberV1 {
	/*
	 * Scanner class는 키보드 자원을 연동하여 키보드로 부터 값을 입력받기 위한 클래스이다 이 클래스는 컴퓨터의 자원을 사용하는 관리가
	 * 매우 엄격하게 필요한 클래스이다. 사용하는 방법에 따라, 오류가 발생하거나 심지어 컴퓨터 시스템이 멈추는 현상까지 발생할 수 있다. 이러한
	 * 클래스는 사용할때 상당한 주의가 필요하다.
	 */
	// Scanner 클래스를 main() method가 아닌 Service 등의 클래스에서
	// 사용할때는 클래스영역에 선언을 하고 클래스 생성자에서 생성(초기화) 하는 것이 좋다.

	protected Scanner scan;

	public InputNumberV1() {
		scan = new Scanner(System.in);
	}
	/*문자열, 정수, 정수, 매개변수를 갖는 method 선언
	 * 	문자열과 범위(start ~ end)값을 전달받아 prompt 문자열을 생성하고
	  	 inputValue(String title) method를 호출하여 값을 입력받도록 하고
	  	  return된 값에 따라 null이 return되면 그냥 return 해버리고 
	  	   정수값이 return되면 start, end 값 범위에 있는 값인지 유효성 검사를 하고
	  	    범위를 벗어나면 다시 입력을 하도록 반복한다.*/

	public Integer inputValue(String title, int start, int end) {
		// title 변수 값을 (타이틀(정수 ~ 정수)) 문자열로 다시 생성
		title = String.format("%s (%d ~ %d)", title,start,end);
		while (true) {
			Integer retNum = this.inputValue(title);

			if (retNum == null) {
				return null;
			} else if (retNum < start || retNum > end) {
				System.out.printf("입력값은 %d ~ %d 범위 이어야 합니다.\n", start, end);
				continue;
			}
			return retNum;
		}
	}

	/*String title 매개변수를 받고 정수값이나 QUIT가 입력되는지 확인을 하고 
	   잘못 입력된 값이 있으면 다시 입력받도록 하는 method*/
	public Integer inputValue(String title) {
		while (true) {
			System.out.println("취소 : QUIT");
			System.out.println(title + "값을 입력하세요");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intInput = 0;
			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intInput = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("정수 or QUIT 만 입력");
					continue;
				}
				return intInput;
			}

		}

	}

}
