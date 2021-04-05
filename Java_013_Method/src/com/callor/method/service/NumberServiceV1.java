package com.callor.method.service;

import java.util.Random;
/*
 * 1. NumberServiceV1 class
 * 2. inputNum() method를 선언한다.
 * 3. Random 클래스를 사용하여 1 ~ 100까지 중 임의의 난 수 1개를 생성한 후
 * 4. 3의 배수인가를 확인하고 
 * 5. 3의 배수이면 정수 값을 아니면 null값을 return하도록 합니다.
 */
public class NumberServiceV1 {

	public Integer inputNum(int intDan) {
		Random rnd = new Random();
		intDan = rnd.nextInt(100) + 1;
		if(intDan % 3 == 0) {
			System.out.println(intDan + "3의 배수");
		}
		return null;
	}
}
