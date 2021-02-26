package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		List<CartVO> cartList = new ArrayList<CartVO>();
		Scanner scan = new Scanner(System.in);

		CartVO cartVO = new CartVO();
		
		String userName = cartVO.getCartUserName();
		String pName = cartVO.getCartPName();
		String cartStd = cartVO.getCartStd();
		int intPrice = cartVO.getCartPrice();

		System.out.println("=========================================");
		System.out.println("\t CartList Test");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < 3; i++) {

			System.out.print((i + 1) + "번째 구매자이름 입력하시오: ");
			cartVO.setCartUserName(scan.nextLine());
			System.out.print("상품명을 입력하시오: ");
			cartVO.setCartPName(scan.nextLine());
			System.out.print("수량을 입력하시오: ");
			cartVO.setCartStd(scan.nextLine());
			System.out.print("가격을 입력하시오: ");
			String strPrice = scan.nextLine();
			int intCartPrice = Integer.valueOf(strPrice);

			System.out.println("==========================================");

			cartList.add(cartVO);

		}
		System.out.println("\t\t장바구니");
		System.out.println("------------------------------------------");

		for(int i = 0 ; i < 3; i++) {
		cartVO = cartList.get(i);
		System.out.printf("%s\t%s\t%s\t%d\n", userName, pName, cartStd, intPrice);
		}
		System.out.println("---------------------------------------------");
		
	}

}
