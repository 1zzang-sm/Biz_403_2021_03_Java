package com.callr.app;

import com.callr.app.service.ScoreService;
import com.callr.app.service.impl.ScoreServiceImplV2;
import com.callr.app.service.impl.ScoreServiceV2Ex;

public class ScoreEx_02 {
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceV2Ex();
		sService.selectMenu();
	}
}
