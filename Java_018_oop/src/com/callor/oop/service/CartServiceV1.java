package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.callor.oop.CartList;
import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	private List<CartVO> cartlist = new ArrayList<CartVO>();
	private CartVO cartvo;
	
	
	
	public void inputCart() {

		Scanner scan = new Scanner(System.in);
		cartvo = new CartVO();

		System.out.print("구매자: ");
		String userName = scan.nextLine();

		System.out.print("상품명: ");
		String strPname = scan.nextLine();

		int intQty = 0;

		while (true) {
			System.out.print("수량: ");
			String strQty = scan.nextLine();

			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 2) {
					System.out.println("2 이상의 수를 입력해라");
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("수량은 숫자로만 입력하라!");
			}
		}
		int intPrice = 0;

		while (true) {
			System.out.print("단가: ");
			String price = scan.nextLine();
			try {
				intPrice = Integer.valueOf(price);
				if (intPrice < 1000) {
					System.out.println("1000원 이상 가격을 입력하라!");
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("수량은 숫자로만 입력하라!");
			}
		}

		
		cartvo.setCartUserName(userName);
		cartvo.setCartPName(strPname);
		cartvo.setCartQty(intQty);
		cartvo.setCartPrice(intPrice);
		
		cartlist.add(cartvo);
	}

	public void printCartList() {
		int nSize = cartlist.size();
		for (int i = 0; i < nSize; i++) {
		System.out.println("==========================================");
		System.out.println("\t\tCart List");
		System.out.println("-----------------------------------------");
		
				System.out.printf("%s\t%s\t%d\t%d\t\n", cartlist.get(i).getCartUserName(), cartlist.get(i).getCartPName(),
						cartlist.get(i).getCartQty(),cartlist.get(i).getCartPrice());
		
		}
	}

}
