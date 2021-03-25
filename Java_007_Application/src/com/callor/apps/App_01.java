package com.callor.apps;

/*
 * 문제
 * 1. 정수형 배열 20개를 선언합니다.
 * 
 * 2. Random 클래스를 사용하여 
 *  	50 ~ 100까지 난 수를 생성하여 배열에 저장합니다.
 *  
 * 3. 배열에 저장된 정수 중 Prime(소수)인 수들의 리스트를 출력합니다.
 * 
 *  ※ Prime(소수)는 2 ~ (자신 - 1)까지의 수로 나누었을 때 
 *  	나머지가 0이 한번도 나오지 않아야 합니다.
 */
import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		
		int[] intNums = new int[20];
		int intNum = 0;
		Random rnd = new Random();

		for (int i = 0; i <intNums.length ; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
			
			for(intNum = 2; intNum < intNums.length;intNum++ ) {
				if((intNums[i]-1) % intNum == 0 || intNums[i] % intNum == 0) {
					break;
				}
				
			}
			System.out.println(intNums[i]);
			}
		
		}

	}


