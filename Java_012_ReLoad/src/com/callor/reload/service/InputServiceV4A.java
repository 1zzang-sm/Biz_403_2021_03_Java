package com.callor.reload.service;

/*
 * 1. InputServiceV4 class의 클래스 영역에 Scanner scan;
 * 		List<NumberVO> numList 객체 선언
 * 2. 클래스 생성자에서 scan, numList 객체 생성(초기화)
 * 3. inputNum() method 에서 키보드를 통해 2개의 정수를 입력 받아 numList에 추가
 * 4. printNum() method에서 numList에 저장된 리스트 출력
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4A {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV4A() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}

	public void inputNum() {
		
			System.out.println("키보드로 정수형 숫자를 입력하세요");
			System.out.print(">> ");
			String strNum1 = scan.nextLine();
			Integer intNum1 = Integer.valueOf(strNum1);
			
			System.out.println("키보드로 정수형 숫자를 입력하세요");
			System.out.print(">> ");
			Integer num2 = scan.nextInt();
			
			NumberVO nVO = new NumberVO();
			nVO.setNum1(intNum1);
			nVO.setNum2(num2);
			
			numList.add(nVO);
		
	}

	public void printNum(NumberVO nVO) {
		for(int i = 0; i < numList.size(); i++) {
			System.out.println(nVO.getNum1());
			System.out.println(nVO.getNum2());
		}

	}
}
