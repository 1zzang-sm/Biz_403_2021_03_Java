package com.callor.apps;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		//키보드에서 데이터를 입력받기 위한 준비
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수값을 키보드로 입력하고 Enter");
		System.out.print("정수1 >> ");
		int num1 = scan.nextInt();
		System.out.print("정수 2 >>");
		int num2 = scan.nextInt();
		
		System.out.print("입력된 두 정수의 합 :");
		System.out.println(num1 + num2);
	}

}
