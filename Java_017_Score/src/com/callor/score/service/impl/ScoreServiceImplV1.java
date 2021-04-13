package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.zzang.standard.MenuService;
import com.zzang.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<String> scoreMenu;
	protected MenuService mService;

	public ScoreServiceImplV1() {
		scoreMenu = new ArrayList<String>();
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴선택창
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적 등록");
		scoreMenu.add("성적정보 열기");
		scoreMenu.add("성적정보 저장");
		scoreMenu.add("성적정보 출력");
		System.out.println("=".repeat(50));
		mService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", scoreMenu);
		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				return;
			} 
			if (menu == 1) {
				//
			} else if (menu == 2) {
				this.inputScore();
			} else if (menu == 3) {
				this.printScore();
			} else if (menu == 4) {
				this.saveScore();
			} else if (menu == 5) {
				this.readScore();
			} else if (menu < 1 || menu > 5) {
				System.out.println("메뉴선택은 1 ~ 5, QUIT ");
				continue;
			}
		}
	}

	@Override
	public void inputStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}


	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

}
