package com.callor.app;

import com.callor.app.impl.ScoreServiceImplV1A;
import com.callor.app.service.ScoreService;

public class ScoreEx_04 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV1A();
		sService.selectMenu();
	}
}
