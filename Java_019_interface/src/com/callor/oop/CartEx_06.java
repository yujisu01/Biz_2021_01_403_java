package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.CartServiceimplV4;
import com.callor.oop.service.impl.MenuServiceImplV3;

public class CartEx_06 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV3();
		mService.selectMenu();
		/*
		 * MenuService에는 선언되지 않고
		 * 		MenuServiceImplV3에만 선언된 menuItem 변수값을
		 * 		읽어오기 위해, 
		 * 		인터페이스 -> 클래스 형변환을 시켜준것이다. 
		 * (많이 쓰이는 코드는 아니지만, 인터페이스를 사용할때 필요하다)
		 * 
		 */
		MenuServiceImplV3 mV3 = (MenuServiceImplV3)mService;
		Integer menuItem = mV3.menuItem;
		
		// 인터페이스를 클래스로 형변환 함과 동시에,
		// 변수에 접근하기
		// 위의 코드를 한줄로 적은것이므로 위 코드와 똑같다.
		Integer selectMenu = ((MenuServiceImplV3)mService).menuItem;
		
		CartService cService = new CartServiceimplV4();
		
		
		if(selectMenu == 1) {
			//카트 추가
			cService.inputCart();
		}else if(selectMenu == 2) {
			//카트 삭제
		}else if(selectMenu ==3) {
			//카트 리스트
			cService.printCart();
		}
	}

}
