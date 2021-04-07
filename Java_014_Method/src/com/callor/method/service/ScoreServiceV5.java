package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected InputServiceV2 inService;
	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;

	public ScoreServiceV5() {
		inService = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

	}

	public void inputScore() {
		Integer[] scores = new Integer[5];
		for (int i = 0; i < scores.length; i++) {
			
			for (int j = 0; j < subject.length; j++) {
				
				System.out.println(j + 1 + "번째 학생");
				
				scores[j] = inService.inputValue(subject[j], 0, 100);
			}
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}
	}

	public void printScore() {

		for (int i = 0; i < subject.length; i++) {
			System.out.println(kors.get(i));
			System.out.println(engs.get(i));
			System.out.println(maths.get(i));
		}
	}
}
