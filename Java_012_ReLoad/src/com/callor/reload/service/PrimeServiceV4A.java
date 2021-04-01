package com.callor.reload.service;

/*
 * 1. PrimeServiceV4 class의 클래스 영역에 Random rnd 객체 선언, List<Integer> intList 객체 선언
 * 2. 클래스 생성자에서 rnd 객체와 intList 객체 생성(초기화)
 * 3. primeNum() method를 선언하고 50 ~ 100까지 중 임의의난 수 50개를 생성하고 난 수 중 소수인
 * 정수들만 intList에 추가
 * 4.printPrimeNum() method를 선언하고 intList에 담긴 소수들 리스트 출력
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4A {

	Random rnd;
	List<Integer> intList;
	int[] rndNum;

	public PrimeServiceV4A() {

		rnd = new Random();
		intList = new ArrayList<Integer>();
		rndNum = new int[10];
	}

	public void primeNum() {
		boolean notPrime = false;
		int index = 0;
		rndNum[index] = rnd.nextInt(51) + 50;
		for (int i = 2; i < rndNum[index]; i++) {
			
			if (rndNum[index] % i == 0) {
				notPrime = true;
				break;
			}
		}
		if (notPrime == true) {
			System.out.println("소수가 아님");
		} else {
			intList.add(rndNum.length);
		}

	}

	public void printPrimeNum() {
		for (int i = 0; i < intList.size(); i++) {
			System.out.println("소수 : " + intList.get(i));
		}
	}

}
