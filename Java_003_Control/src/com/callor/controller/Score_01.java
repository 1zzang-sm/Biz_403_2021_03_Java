package com.callor.controller;

public class Score_01 {
	
	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		
		// int intSum = intKor+intEng+intMath;
		int intSum = 0 ;
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		// float floatAvg = (intKor+intEng+intMath)/3f;
		float floatAvg = 0f;
		floatAvg = intSum/3f;
		
		System.out.println("=====================");
		System.out.printf("%s : %d\n",strKor,intKor);
		System.out.printf("%s : %d\n",strEng,intEng);
		System.out.printf("%s : %d\n",strMath,intMath);
		System.out.println("---------------------");
		System.out.printf("총점 : %d\t 평균 : %.1f\n",intSum,floatAvg);
		System.out.println("=====================");
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * 		%3d : 자릿수를 3개로 맞추고 값을 오른쪽으로 정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * \n : Enter를 누른 것 처럼 줄바꿈을 실행
		 * \t : Tap 키를 누른 것 처럼 사이띄기를 일정하게 맞추어라
		 * 가	나
		 * 가나다
		 */
	}
}
