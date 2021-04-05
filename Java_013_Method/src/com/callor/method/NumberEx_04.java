package com.callor.method;

import com.callor.method.service.NumberServiceV5;

public class NumberEx_04 {

	public static void main(String[] args) {

		NumberServiceV5 nsV5 = new NumberServiceV5();
		String strName = "치즈스틱";
		Integer retNum = nsV5.inputNum(strName);
		if (retNum != null) {
			System.out.println(strName + "의 값 : " + retNum);
		} else {
			System.out.println("업무종료");
		}
	}
}
