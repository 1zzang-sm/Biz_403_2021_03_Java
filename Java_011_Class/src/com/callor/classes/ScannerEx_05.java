package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);
		
		/*
		 * 문자열 변수에 담긴 문자열이 같은가를 확인할때 동등연산자(==)를 사용해서는 안된다.
		 * 문자열 변수는 변수에 문자열을 저장하는 방법에 따라 다른 특성을 갖게된다.
		 * 문자열의 독특한 특성 때문에 문자열에 저장된 값이 같은지 확인이 안되는 경우가 있다.
		 * 
		 * 문자열 변수에 저장된 값이 같은가 비교를 할때는 문자열.equals("비교대상") method를 사용해야 한다.
		 */
		//if(str1 == str2) {} x 
		//if(str2.equals(str1) o
		if(str.equals("END")) {
			System.out.println("안녕!!!!");
		}else {
			System.out.println("반가워!!");
		}
		
		String str1 = "대한민국";
		String str2 = "대한민국";
		
		System.out.println(str1.equals(str2));
		
		str1 = "KOREA";
		str2 = "korea";
		
		System.out.println(str1.equals(str2));
		
		// 영문 문자열이 저장된 경우 대소문자가 달라도 같은지 비교하기 위해서는 IgnoreCase()를 사용한다.
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
