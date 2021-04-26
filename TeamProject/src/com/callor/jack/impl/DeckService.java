package com.callor.jack.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.jack.model.DealrVO;
import com.callor.jack.model.UserVO;
import com.callor.jack.service.TotalService;

public class DeckService implements TotalService {

	ArrayList<String> cardlist;

	List<UserVO> userList;
	List<DealrVO> dealrList;
	Random rnd;
	Scanner scan;

	public DeckService() {
		cardlist = new ArrayList<String>();

		userList = new ArrayList<UserVO>();
		dealrList = new ArrayList<DealrVO>();

		rnd = new Random();
		scan = new Scanner(System.in);

	}

	public void cardDeck() {

		String pattern[] = { "heart", "spade", "clover", "dia" };
		String cardnum[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardlist.add(pattern[i] + ":" + cardnum[j]);
			}
		}

		this.getUCard();
		this.getDCard();

	}

	public void getUCard() {

		System.out.printf("유저 %d장\n", 1);
		UserDeck();

		System.out.println("=".repeat(50));
		System.out.println("유저 합 : " + this.sumUserScore());
		System.out.println("-".repeat(50));
	}

	public void getDCard() {
		System.out.printf("딜러 %d장\n", 1);
		DealerDeck();

		System.out.println("=".repeat(50));
		System.out.println("딜러 합 : " + this.sumDealerScore());
		System.out.println("-".repeat(50));

	} // end method

	public Integer sumUserScore() {
		// 계산
		Integer sumUser = 0;
		for (UserVO vo : userList) {
			sumUser += vo.getUPoint();
		}
		return sumUser;
	}

	public Integer userHit() {
		System.out.println("카드를 한장 더 받으시겠습니까?");
		System.out.println("Yes : Enter , No : <");
		System.out.print(">> ");
		String strInput = scan.nextLine();
		if (strInput.equals("")) {
			System.out.println("=".repeat(50));
			this.UserDeck();
			System.out.println("유저의 합 : " + this.sumUserScore());
			System.out.println("=".repeat(50));
		} else if (strInput.equals("<")) {
			System.out.println("유저가 카드를 받지 않았습니다.");
			System.out.println("결과를 출력");
		}
		return this.sumUserScore();
	}

	public void vs() { // 임시보류

		if(this.sumDealerScore() < 17) {
			System.out.println("딜러점수가 17 미만이라 자동으로 한장 더 받습니다.");
			this.dealerHit()
		}
		if (this.sumUserScore() > 22) {
			System.out.println("유저는 21점초과로 인해 죽었습니다.");
			System.out.println("딜러 승리");
		} else if (this.sumDealerScore() > 21) {
			System.out.println("딜러는 21점초과로 인해 죽었습니다.");
			System.out.println("유저 승리");
		}
		if (this.sumUserScore() <= 21) {
			if (this.sumDealerScore() < this.sumUserScore()) {
				System.out.println("유저가 이김");
			}
		}
		if (this.sumDealerScore() <= 21) {
			if (this.sumDealerScore() > this.sumUserScore()) {
				System.out.println("딜러가 이김");
			}
		}
	}

	@Override
	public void UserDeck() {
		// TODO Auto-generated method stub

		String cardU; // 카드 담김

		Integer cardUscore; // 실제 값

		int num = rnd.nextInt(cardlist.size()); // 한장 뽑고

		cardU = cardlist.get(num); // 1번째 배열있는거 가져옴
		cardlist.remove(num); // 1번째 배열에 있는 값 삭제

		String cardUp[] = cardU.split(":");
		if (cardUp[1].equals("A")) {
			cardUscore = 1;

		} else if (cardUp[1].equals("J")) {
			cardUscore = 10;

		} else if (cardUp[1].equals("Q")) {
			cardUscore = 10;

		} else if (cardUp[1].equals("K")) {
			cardUscore = 10;

		} else {
			cardUscore = Integer.valueOf(cardUp[1]);

		}

		UserVO uVO = new UserVO();
		uVO.setCardUShap(cardU);
		uVO.setUPoint(cardUscore);
		userList.add(uVO);

		System.out.println("[유저 카드]" + cardU);
		System.out.println("[실제 숫자]" + cardUscore);

	}

	@Override
	public void DealerDeck() {
		// TODO Auto-generated method stub

		String cardD; // 카드 담김

		Integer cardDscore; // 실제 값

		int num = rnd.nextInt(cardlist.size()); // 한장 뽑고

		cardD = cardlist.get(num); // 1번째 배열있는거 가져옴
		cardlist.remove(num); // 1번째 배열에 있는 값 삭제

		String cardDp[] = cardD.split(":");
		if (cardDp[1].equals("A")) {
			cardDscore = 1;

		} else if (cardDp[1].equals("J")) {
			cardDscore = 10;

		} else if (cardDp[1].equals("Q")) {
			cardDscore = 10;

		} else if (cardDp[1].equals("K")) {
			cardDscore = 10;

		} else {
			cardDscore = Integer.valueOf(cardDp[1]);

		}

		DealrVO dVO = new DealrVO();
		dVO.setCardDShap(cardD);
		dVO.setDPoint(cardDscore);
		dealrList.add(dVO);

		System.out.println("[딜러 카드]" + cardD);
		System.out.println("[실제 숫자]" + cardDscore);

	}

	@Override
	public Integer sumDealerScore() {
		// TODO Auto-generated method stub
		// 계산
		Integer sumDealr = 0;
		for (DealrVO vo : dealrList) {
			sumDealr += vo.getDPoint();
		}
		return sumDealr;
	}

	@Override
	public Integer dealerHit() {
		if (this.sumDealerScore() < 17) {
			System.out.println("=".repeat(50));

			this.DealerDeck();
			System.out.println("딜러 합 : " + this.sumDealerScore());
			System.out.println("=".repeat(50));
		}
		return this.sumDealerScore();
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}
}
