package com.callor.reload.service;

/*
 * 1. PrimeServiceV1 class의 클래스 영역에 Random rnd 객체를 선언
 * 2. 클래스 생성자에서 rnd 객체 생성(초기화)
 * 3. PrimeNum() method를 선언하고, 50 ~ 100까지 중 임의의 난 수를 생성하고
 *    난 수가 소수인가를 판별하여 출력하는 코드 작성
 */
import java.util.Random;

public class PrimeServiceV1A {

	protected Random rnd;

	public PrimeServiceV1A() {
		// TODO Auto-generated constructor stub
		rnd = new Random();
	}

	public void primeNum() {
		int num = rnd.nextInt(51) + 50;
		boolean notPrime = false;
		for (int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				notPrime = true;
				break;
			}
		}
		if(notPrime == true) {
			System.out.println(num + "소수가아님");
		}else {
			System.out.println(num + "소수");
		}
	}
}
