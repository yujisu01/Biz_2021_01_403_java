package com.callor.shop;

import com.callor.impl.CartControllerV1;
import com.callor.impl.MenuControllerV1;
import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;

public class CartEx_01 {

	public static void main(String[] args) {

		MenuService mser = new MenuControllerV1();
		CartService cser = new CartControllerV1();

		while (true) {
			mser.selectMenu();
			Integer menu = ((MenuControllerV1) mser).menu;
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
