package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV3 extends IolistServiceV1{

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("==========================");
		System.out.println("매입 매출 등록");
		System.out.println("--------------------------");
		System.out.print("상품명(QUIT:입력중단)>> ");
		String pname = scan.nextLine();
		if(pname == "QUIT") {
			return;
		}
		
		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();

		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();
		
		Integer iprice = this.inputPrice("매입");
		if(iprice == null) {
			return;
		}
		Integer oprice = this.inputOprice("매출");
		if(oprice == null) {
			return;
		}
		IolistVO vo = new IolistVO();
		
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setQty(qty);
		vo.setIprice(iprice);
		vo.setOprice(oprice);
		iolist.add(vo);
	}

	private Integer inputPrice(String title) {
		
		while(true) {
			
			System.out.println(title + " 단가를 입력하세요.");
			System.out.println(title + " 단가는 0 이상 입력하세요.");
			System.out.println("단가를 -1을 입력하면 입력 중단");
			System.out.print(title + "단가 >> ");
			Integer price = scan.nextInt();
			if(price < -1) {
				return null;
			}else if(price < 0) {
				System.out.println(title + "단가는 0 이상 입력하세요.");
				continue;
			}else {
				return price;
			}
		}
	}
	private Integer inputOprice(String title) {
		
		while(true) {
			
			System.out.println(title + " 단가를 입력하세요");
			System.out.println(title + " 단가는 0이상 입력하세요");
			System.out.println(title + "단가 >> ");
			Integer oprice = scan.nextInt();
			if(oprice < -1) {
				return null;
			}else if(oprice < 0) {
				System.out.println(title + "단가는 0이상 입력하세요");
				continue;
			}else {
				return oprice;
			}
			
		}
		
	}
	
	
}
