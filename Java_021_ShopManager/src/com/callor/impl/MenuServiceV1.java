package com.callor.impl;

import java.util.Scanner;
import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer menu = null;

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			System.out.println();
			System.out.println("============================================");
			System.out.println("\t빛나라 쇼핑몰 2021");
			System.out.println("--------------------------------------------");
			System.out.println("1. 장바구니 상품담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("--------------------------------------------");
			
			System.out.print("선택 >>");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				this.menu = null;
				break;
			}
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					this.menu = intMenu;
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("[메뉴는 QUIT(끝내기), 1~3까지만 입력하세요]");
			}
					
		}

	}

}
