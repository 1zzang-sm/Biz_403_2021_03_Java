package com.callor.jack;

public class Ex_02 {

	
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum += i;
			System.out.printf("sum[%d] + i[%d] = %d\n", sum, i, sum + i);
			System.out.println("-".repeat(10));
		
			System.out.println("누적된 sum값" + sum);
			System.out.println("-".repeat(10));
		}

	}

}
