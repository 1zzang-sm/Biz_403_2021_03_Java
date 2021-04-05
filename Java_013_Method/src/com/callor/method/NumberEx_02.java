package com.callor.method;

import com.callor.method.service.NumberServiceV2;

public class NumberEx_02 {
	
	public static void main(String[] args) {
		NumberServiceV2 nsV2 = new NumberServiceV2();

		Integer getNum = nsV2.inputNum();
		if(nsV2 != null) {
			System.out.println("입력한 값 : " + getNum);
		}
		
	}

}
