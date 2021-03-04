package com.callor.shop.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;
import com.callor.shop.values.Values;


public class MenuServiceImplV1 implements MenuService{

	
	private final Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer selectMenu() {
		
		while(true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println(Values.sLine);
			
			System.out.printf("%d. 장바구니 추가\n",
					Values.MENU_INPUT);
			System.out.printf("%d. 장바구니 전체 보기\n",
					Values.MENU_ALL_LIST);
			System.out.printf("%d. 구매자별 장바구니 보기\n",
					Values.MENU_USER_LIST);
			System.out.printf("%d. 장바구니 파일 저장\n",
					Values.MENU_SAVE_CART_LIST);
			
			System.out.println("QUIT. 업무종료");
			System.out.println(Values.sLine);
			System.out.print("선택>> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				return null;
			}
		
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT, "
						+ "%d ~ %d 까지만 가능",
						Values.MENU_START,
						Values.MENU_LAST);
				continue;
			}
			if(intMenu >= Values.MENU_START 
					&& intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.printf("업무는 "
						+ "%d ~ %d까지 중에서 선택",
						Values.MENU_START,
						Values.MENU_LAST);
			}
		}
	}
	
}




