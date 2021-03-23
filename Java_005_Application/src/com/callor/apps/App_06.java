package com.callor.apps;

public class App_06 {
	
	public static void main(String[] args) {
		
		int first = 0;
		int second = 0;
		int money = 3723560;
		int money1 = 50000;
		int money2 = 10000;
		
		for(int i = 0; i < 5; i++) {
			first = money/money1;
		}
		for(int i = 0; i < 5; i++) {
			second = first/money2;
			System.out.println(second);
		}
	}

}
