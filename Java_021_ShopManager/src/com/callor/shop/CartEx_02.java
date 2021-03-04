package com.callor.shop;

import com.callor.impl.CartServiceImplV2;
import com.callor.impl.MenuServiceImplV1T;
import com.callor.shop.service.CartServiceT;
import com.callor.shop.service.MenuServiceT;
import com.callor.shop.values.Values;


public class CartEx_02 {

	public static void main(String[] args) {
		
		//MenuServiceImplV1T mS = new MenuServiceImplV1T();
	
		MenuServiceT mService = new MenuServiceImplV1T();
		CartServiceT cService = new CartServiceImplV2();
		
		while (true) {
			
			Integer menuItem = mService.selectMenu();
			if (menuItem == null) {
				break;
			}else if(menuItem ==Values.MENU_INPUT) {
				System.out.println("[장바구니 추가]");
				cService.inputCart();
			}else if(menuItem ==Values.MENU_ALL_LIST) {
				cService.printAllCart();
			}else if(menuItem ==Values.MENU_USER_LIST) {
				cService.printUserCart();
			}
		}
		System.out.println("업무종료");
	}
}
