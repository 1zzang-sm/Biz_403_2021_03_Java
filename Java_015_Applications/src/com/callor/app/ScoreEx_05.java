package com.callor.app;

import com.callor.app.impl.ScoreServiceImplV2;
import com.callor.app.impl.ScoreServiceImplV2A;
import com.callor.app.service.ScoreService;

public class ScoreEx_05 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV2A();
		
		sService.selectMenu();
	}

}
