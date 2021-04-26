package com.callor.jack;

import java.util.Scanner;

import com.callor.jack.impl.DeckService;
import com.callor.jack.impl.DeckServiceV2;

public class Ex_01 {

	public static void main(String[] args) {
		DeckServiceV2 dService = new DeckServiceV2();
		dService.selectMenu();
	}
}
