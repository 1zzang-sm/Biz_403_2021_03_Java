package com.callor.method;

import com.callor.method.service.NumberServiceV3;

public class NumberEx_03 {
	
	public static void main(String[] args) {
		
		NumberServiceV3 nsV3 = new NumberServiceV3();
		
		Integer retNum = nsV3.inputNum();
		
		if(retNum != null) {
			System.out.println("입력한 값 : " + retNum);
		}else {
			System.out.println("업무 종료!!");
		}
	}

}
