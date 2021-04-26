package com.callor.jack;

import java.util.Scanner;

import com.callor.jack.impl.DeckService;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DeckService dService = new DeckService();
		dService.cardDeck();
		dService.cardDeck();
		if(dService.sumDealerScore() < 17) {
			System.out.println("딜러가 17미만이라 한장 더 받습니다.");
			dService.dealerHit();
		}
		dService.userHit();
		dService.vs();
	}
}
