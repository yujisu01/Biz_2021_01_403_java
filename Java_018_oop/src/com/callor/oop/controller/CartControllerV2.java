package com.callor.oop.controller;

import java.util.Scanner;
import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		CartVO[] cartVO = new CartVO[3];

		for (int i = 0; i < cartVO.length; i++) {
			cartVO[i] = new CartVO();
		}
		System.out.println("==========================================");
		System.out.println("\t빛나라 쇼핑몰 장바구니");
		System.out.println("------------------------------------------");

		for (int i = 0; i < cartVO.length; i++) {
			String cartCode = (i + 1) + "";
			System.out.print(cartCode + "번째 고객아이디 입력>>");
			String strName = scan.nextLine();

			System.out.print("상품명 입력>>");
			String strPname = scan.nextLine();

			System.out.print("상품옵션 입력>>");
			String strQty = scan.nextLine();

			System.out.print("날짜 입력>>");
			String strDate = scan.nextLine();

			System.out.print("구매가격 입력>>");
			String intTotal = scan.nextLine();
			System.out.println("========================================");
			// cartVO[i].getCartUserName()

			cartVO[i].toString();
		}

	}

}
