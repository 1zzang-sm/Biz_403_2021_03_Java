package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}

	public void inputNum() {
		while (true) {
			System.out.println("두개의 정수 입력하기");
			System.out.print("1번>> ");
			String strNum1 = scan.nextLine();
			Integer intNum1 = Integer.valueOf(strNum1);

			System.out.print("2번>> ");
			String strNum2 = scan.nextLine();
			Integer intNum2 = Integer.valueOf(strNum2);
			if (intNum1 < intNum2) {
				System.out.println("1번이 2번보다 더 큰 수를 입력해야한다.");
				continue;
			}

			NumberVO vo = new NumberVO();
			vo.setNum1(intNum1);
			vo.setNum2(intNum2);

			numList.add(vo);
			break;
		}

	}

	public void printNum() {

		for (int i = 0; i < numList.size(); i++) {

			NumberVO vo = numList.get(i);
			System.out.print("입력한 값의 뺄셈은(1번 - 2번) : ");
			System.out.println(vo.getNum1() - vo.getNum2());

		}
	}

}
