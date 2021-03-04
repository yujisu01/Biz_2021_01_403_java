package com.callor.shop;

import com.callor.impl.CartServiceImplV1;
import com.callor.impl.MenuServiceImplV1;
import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;

public class CartEx_01 {

	public static void main(String[] args) {

		MenuService mser = new MenuServiceImplV1();
		CartService cser = new CartServiceImplV1();

		while (true) {
			mser.selectMenu();
			Integer menu = ((MenuServiceImplV1) mser).menu;
			if (menu == null) {		// 널값: 아무것도 아니다.
				break;
			} else if (menu == 1) {
				System.out.println("장바구니 추가");
				cser.inputCart();
			} else if (menu == 2) {
				System.out.println("장바구니 리스토보기");
				cser.printCart();
			} else if (menu == 3) {
				System.out.println("구매자별 리스트 보기");
				cser.privateCart();

			}
		}

	}
}
