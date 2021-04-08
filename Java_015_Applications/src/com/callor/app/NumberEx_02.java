package com.callor.app;

import com.callor.app.impl.ScoreServiceImplV1;
import com.callor.app.service.ScoreService;
import com.callor.app.service.ScoreServiceV1;

public class NumberEx_02 {
	
	public static void main(String[] args) {
		
		ScoreService inService = new ScoreServiceImplV1();
		inService.selectMenu();
		
	}

}
