package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.print1();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.print2();
		ssV1.print3();
	}//교재1~4읽고 독후감

}
