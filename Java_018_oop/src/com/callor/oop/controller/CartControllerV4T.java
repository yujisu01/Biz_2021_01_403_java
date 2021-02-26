package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4T {

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

			/*
			 * 데이터를 키보드에서 입력받는 부분과 VO에 담아서 리스트에 추가하는 부분을 분리하여 코딩할 경우, 키보드에서 입력한 값을 정수변환하여 값을
			 * 담아둘 intQty변수를 while(true)문 실행 이전에 선언해 두어야 한다. (변수에서 어려운 부분)
			 */
			int intQty = 0;

			while (true) {
				System.out.print("수량>>");
				String strQty = scan.nextLine();

				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("1이상 수를 입력해라.");
						continue;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("수량은 숫자로 입력하세요!!");
				}
				break;
			}

			int intPrice = 0;

			while (true) {
				System.out.print("단가>>");
				String price = scan.nextLine();
				try {
					intPrice = Integer.valueOf(price);
					if (intPrice < 1000) {
						System.out.println("1000원 이상의 가격을 입력하세요");
						continue;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("수량은 숫자로 입력하세요!!");

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
