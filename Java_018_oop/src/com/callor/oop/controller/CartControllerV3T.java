package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3T {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();

		
		for (int i = 0; i < 3; i++) {

			// 제목보이기
			System.out.println("=========================================");
			System.out.println("\t CartList Test");
			System.out.println("-----------------------------------------");

			// 입력받기
			System.out.print("구매자>>");
			String userName = scan.nextLine();
			// cartVO.setCartUserName(userName);

			System.out.print("상품명>>");
			String strPName = scan.nextLine();
			// cartVO.setCartUserName(strPName);

			System.out.print("수량>>");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);

			System.out.print("단가>>");
			// 3000 이라고 입력하면 "3000"으로 입력되어 문자열이다
			String price = scan.nextLine();
			// "3000"문자열형 숫자를 정수 3000으로 변경하여
			// intPrice 변수에 저장된다
			int intPrice = Integer.valueOf(price);

			// 카트 정보생성하기
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(userName);
			cartVO.setCartPName(strPName);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartQty(intQty);

			// 카트 정보를 리스트에 추가하기
			cartList.add(cartVO);

		} // end for
		System.out.println("=============================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("---------------------------------------------");
		
		/*
		 * 배열에서는 배열.length 값을 참조하면
		 * 		배열 갯수를 알수 있었다.
		 * List에서는 리스트.size() 메서드를 호출하면
		 * 		list갯수를 return해준다.
		 */
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartList.get(i).getCartUserName(), 
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartPrice(), 
					cartList.get(i).getCartQty());
		}

	}

}
