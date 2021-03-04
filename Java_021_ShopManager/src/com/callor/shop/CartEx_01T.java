package com.callor.shop;

import com.callor.impl.CartServiceImplV1T;
import com.callor.impl.MenuServiceImplV1T;
import com.callor.shop.service.CartServiceT;
import com.callor.shop.service.MenuServiceT;
import com.callor.shop.values.Values;


public class CartEx_01T {

	public static void main(String[] args) {
		// 클래스로 선언, 클래스로 생성
		// 인터페이스로 선언, 클래스로 생성
		// 인터페이스를 implement 하여 작성된 클래스는
		// 인터페이스로 선언을 하자
		// 그래야 코드업그레이드가 조금 쉬워짐.
		MenuServiceImplV1T mS = new MenuServiceImplV1T();
		MenuServiceT mService = new MenuServiceImplV1T();
		CartServiceT cService = new CartServiceImplV1T();
		
		while (true) {
			
			Integer menuItem = mService.selectMenu();
			if (menuItem == null) {
				break;
			}else if(menuItem ==Values.MENU_INPUT) {
				System.out.println("[장바구니 추가]");
				cService.inputCart();
			}else if(menuItem ==Values.MENU_ALL_LIST) {
				//System.out.println("[장바구니 리스트 보기]");
				cService.printAllCart();
			}else if(menuItem ==Values.MENU_USER_LIST) {
				//System.out.println("[구매자별 리스트 보기]");
				cService.printUserCart();
			}
		}
		System.out.println("업무종료");
	}
}
