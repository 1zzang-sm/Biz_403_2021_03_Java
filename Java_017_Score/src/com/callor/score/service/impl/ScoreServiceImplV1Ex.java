package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zzang.standard.InputService;
import com.zzang.standard.MenuService;
import com.zzang.standard.impl.InputServiceImplV1;
import com.zzang.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1{
	
	protected MenuService mService;
	protected InputService inService;

	public ScoreServiceImplV1Ex() {
		inService = new InputServiceImplV1();
		
		/*
		 * MenuserviceImplV1 클래스의 생성자는 
		 * 두개의 매개변수(아규먼트,파라메터)를 전달하면서 호출을 해야 한다.
		 * 
		 *   첫번째 매개변수는 프로젝트의 title
		 *   두번째 매개변수는 업무리스트를 담을 List형 객체
		 *   
		 *   title은 단순 문자열이기 때문에 바로 전달할 수 있는데
		 *   List형 객체는 irst객체 생성, 데이터를 add 한 후 
		 *   전달해하므로 약간의 추가 연산코드가 필요하다
		 *   
		 *   이럴때는 생성자method에 작성하지 않고
		 *	객체를 사용하는 method에서 작성하는 것이 좋다.
		 */
		mService = new MenuServiceImplV1(null, scoreMenu);
	}

	@Override
	public void selectMenu() {
		
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String>menuList = new ArrayList<String>();
		menuList.add("1. 학생정보 등록");
		menuList.add("2. 성적등록");
		menuList.add("3. 성적정보 열기");
		menuList.add("4. 성적정보 저장");
		menuList.add("5. 성적정보 출력");
		
		mService = new MenuServiceImplV1(title, menuList);
		
		while(true) {
			Integer menu = mService.selectMenu();
			// 1번코드
			if(menu == null) {
				return;
			}
			if(menu == 1) {}
			if(menu == 2 ) {} 
			if(menu == 3) {}
			
			// 2번코드
			if(menu == 1) {
				
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				
			}else if(menu == 4) {
				
			}else if(menu == 5) {
				
			}
		}
	}

	
}
