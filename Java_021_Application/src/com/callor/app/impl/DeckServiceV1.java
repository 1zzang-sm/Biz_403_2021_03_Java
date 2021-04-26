package com.callor.app.impl;

import java.util.List;
import java.util.Random;

import com.callor.app.model.DeckVO;

public class DeckServiceV1 {
	
	protected List<DeckVO> deckList;
	String strSuit = "◆:♡:♠:♧";
	String strDenomi = "A234567890JQK";
	
	
	public DeckVO getDeck() {
		Random rnd = new Random();
		int nSize = deckList.size();
		int deckIndex = rnd.nextInt(nSize);
		
		DeckVO retDeckVO = deckList.get(deckIndex);
		deckList.remove(deckIndex);
		return retDeckVO;
	}
	public void makeDeck() {
		String[] denoms = strDenomi.split("");
		String[] suits = strSuit.split(":");
		
		// 4번반복 
		for(String suit : suits) {
			
			for(String denom : denoms) {
				
				Integer intValue = 0;
				
				try {
					intValue = Integer.valueOf(denom);
					if(intValue == 0) intValue = 10;
				} catch (NumberFormatException e) {
					// denom 문자열이 A, K, Q, J인 경우 Exception
					if(denom.equals("A")) {
						intValue = 1;
					}else {
						intValue = 10;
					}
					DeckVO deckVO = new DeckVO();
					deckVO.setSuit(suit);
					deckVO.setDenomiation(denom);
					deckVO.setValue(intValue);
					deckList.add(deckVO);
				}
			}
		}
	}

}
