package com.callor.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.CartVO;
import com.callor.shop.service.CartService;

public class CartControllerV1 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;
	private int intTotal;

	public CartControllerV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {
		CartVO cartvo = new CartVO();

		// TODO Auto-generated method stub
		System.out.println("==============================================");
		System.out.println("\t카트 시스템");
		System.out.println("----------------------------------------------");

		System.out.print("구매자 입력: ");
		String strUsername = scan.nextLine();

		System.out.print("상품명 입력: ");
		String strProname = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.print("수량 입력: ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1개이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("수량은 숫자로만 입력하세요");
			}
		}
		int intPrice = 0;
		while (true) {
			System.out.print("단가 입력: ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 100) {
					System.out.println("단가는 100원이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("단가는 숫자로만 입력하세요");
			}
		}

		intTotal = intPrice * intQty;
		System.out.print("합계: " + intTotal);
		// String strTotal = scan.nextLine();

		cartvo.setUserName(strUsername);
		cartvo.setProductName(strProname);
		cartvo.setQty(intQty);
		cartvo.setPrice(intPrice);
		cartvo.setTotal(intTotal);

		cartList.add(cartvo);

	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub

		int nSize = cartList.size();
		int intSum = 0;

		System.out.println("===================================================");
		System.out.println("구매자\t 상품명  수량\t  단가\t  합계");
		System.out.println("---------------------------------------------------");

		int i = 0;
		for (i = 0; i < nSize; i++) {
			System.out.print(cartList.get(i).getUserName() + "\t ");
			System.out.print(cartList.get(i).getProductName() + "\t ");
			System.out.print(cartList.get(i).getQty() + "\t ");
			System.out.print(cartList.get(i).getPrice() + "\t ");
			System.out.println(cartList.get(i).getTotal() + "\t");

			intSum += cartList.get(i).getTotal();
		}

		System.out.println("---------------------------------------------------");
		System.out.printf("합계\t%d가지\t\t\t%d\n", i, intSum);

	}

	public void privateCart() {
		System.out.println("============================================");
		System.out.println("출력할 구매자 이름을 입력하세요 ");
		System.out.println("--------------------------------------------");
		System.out.print("이름>> ");

		String strName = scan.nextLine();
		System.out.println(" ** " + strName + " 장바구니 리스트 입니다. **");

		System.out.println("===================================================");
		System.out.println("구매자\t 상품명  수량\t  단가\t  합계");
		System.out.println("---------------------------------------------------");

		int nSize = cartList.size();
		int intSum = 0;

		int count = 0;
		int i = 0;
		for (i = 0; i < nSize; i++) {

			if (strName.equals(cartList.get(i).getUserName())) {

				System.out.print(cartList.get(i).getUserName() + "\t ");
				System.out.print(cartList.get(i).getProductName() + "\t ");
				System.out.print(cartList.get(i).getQty() + "\t ");
				System.out.print(cartList.get(i).getPrice() + "\t ");
				System.out.println(cartList.get(i).getTotal() + "\t");

				count++;
				intSum += cartList.get(i).getTotal();
			}
		}

		// for (i = 0; i < nSize; i++) {
		System.out.println("---------------------------------------------------");
		System.out.printf("합계\t%d가지\t\t\t%d\n", count, intSum);
	}
}
