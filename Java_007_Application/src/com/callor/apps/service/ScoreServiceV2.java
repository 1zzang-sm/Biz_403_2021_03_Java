package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1 {

	// for(int i = 0)
	// int members = 5
	//method의 괄호() 안에 선언된 변수
	// 매개변수, parameter 라고 한다.
	public ScoreServiceV2( int members ) {
		
		//public ScoreServiceV1()
		//public ScoreServiceV2 ( int members ) 
		intKors = new int[ members ];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		
		intTotal = new int[intKors.length];
		floatAvg = new float[intKors.length];

	}

	
}


