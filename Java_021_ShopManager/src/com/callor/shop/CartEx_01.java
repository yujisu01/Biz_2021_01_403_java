package com.callor.shop;

import com.callor.impl.CartServiceV1;
import com.callor.impl.MenuServiceV1;
import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;

public class CartEx_01 {

	public static void main(String[] args) {

		MenuService mser = new MenuServiceV1();
		CartService cser = new CartServiceV1();

		while (true) {
			mser.selectMenu();
			Integer menu = ((MenuServiceV1) mser).menu;
			if (menu == null) {
				break;
			} else if (menu == 1) {
				cser.inputCart();
			} else if (menu == 2) {
				cser.printCart();
			} else if (menu == 3) {
				cser.privateCart();

			}
		}

	}
}
