package com.callor.apps;

import com.callor.apps.service.EvenServiceV1_A;

public class App_05A {
	public static void main(String[] args) {
		
		EvenServiceV1_A evV1 = new EvenServiceV1_A();
		
		evV1.makeNums();
		evV1.printEven();
		evV1.sumEven();
	}

}
