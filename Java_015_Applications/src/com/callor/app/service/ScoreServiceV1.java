package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.zzang.standard.InputService;
import com.zzang.standard.impl.InputServiceImplV1;

/*
 * 1. InputService interface를 활용하여 
 * 2. 한 학생의 국어, 영어, 수학점수를 입력받고
 * 3. 총점과 평균을 계산하여 출력
 * 4. 단, 점수는 0 ~ 100까지만 입력가능
 */
public class ScoreServiceV1 {
	InputService inService;
	List<Integer> scoreList;
	String[] subject;
	int sum;
	float avg;
	public ScoreServiceV1() {
		scoreList = new ArrayList<Integer>();
		inService = new InputServiceImplV1();
		subject = new String[]{ "국어", "영어", "수학" };
		sum = 0;
		avg = 0;
	}
	public void inputScore() {
		
		Integer[] intNum = new Integer[subject.length];
		
		for (int i = 0; i < subject.length; i++) {
			intNum[i] = inService.inputValue(subject[i], 0, 100);
			sum += intNum[i];
			avg = (float) intNum[i] / subject.length;
		}
		
		scoreList.add(intNum[0]);
		scoreList.add(intNum[1]);
		scoreList.add(intNum[2]);
		scoreList.add(sum);

		
		
	}
	
	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		System.out.println(scoreList.get(sum));
		System.out.print(sum + "\t");
		System.out.print(avg + "\t");
		
	}

}
