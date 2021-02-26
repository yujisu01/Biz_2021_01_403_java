package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();

		for (int i = 0; i < 3; i++) {

			System.out.println("=========================================");
			System.out.println("\t CartList Test");
			System.out.println("-----------------------------------------");

			System.out.print("구매자>>");
			String userName = scan.nextLine();

			System.out.print("상품명>>");
			String strPName = scan.nextLine();

			while (true) {
				System.out.print("수량>>");
				String strQty = scan.nextLine();
				int intQty = Integer.valueOf(strQty);
				try {
					if(intQty < 1) {
						System.out.println("1이상 수를 입력해라");
						continue;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			while (true) {
				System.out.print("단가>>");
				String price = scan.nextLine();
				int intPrice = Integer.valueOf(price);

				if (intPrice < 1000) {
					System.out.println("1000원 이상의 가격을 입력하세요");
					continue;
				}
				break;
			}
			
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(userName);
			cartVO.setCartPName(strPName);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartQty(intQty);

			cartList.add(cartVO);

		}
		System.out.println("=============================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("---------------------------------------------");

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPName(),
					cartList.get(i).getCartPrice(), cartList.get(i).getCartQty());
		}

	}

}
