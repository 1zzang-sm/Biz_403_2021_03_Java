package com.callor.fine.service;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	
	// private를 protected로 변경해야함 
	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

}
