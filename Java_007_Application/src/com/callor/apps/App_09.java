package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		//public ScoreServiceV1()
		//public ScoreServiceV2( int members ) 
		//10은 ssV2 객체를 만들때 생성자에게 전달(보내는)값
		// argument
		ScoreServiceV2 ssV2 = new ScoreServiceV2(10);
			
		ssV2.makeScore();
		ssV2.printScore();
	}

}