package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;

public class CartList {

	public static void main(String[] args) {

		// CartVO를 여러개의 list로 담을 객체생성
		List<CartVO> cartList = new ArrayList<CartVO>();

		// Cart를 1개 생성하고 데이터저장.
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartPName("초코파이");
		cartVO.setCartPrice(1000);
		cartVO.setCartQty(10);

		// 카트리스트에 추가
		cartList.add(cartVO);

		// 또 하나의 상품을 준비하고
		cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartPName("칠성사이다");
		cartVO.setCartPrice(2500);
		cartVO.setCartQty(1);

		// 또 준비된 상품을 카트리스트에 추가함
		cartList.add(cartVO);

		// == 현재 카트에 2개의 상품이 저장되어 있다.
		// 카트리스트 출력하기
		System.out.println("==========================================");
		System.out.println("\t\t장바구니");
		System.out.println("-----------------------------------------");

		for (int i = 0; i < 2; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t\n", cartVO.getCartUserName(), cartVO.getCartPName(),
					cartVO.getCartPrice(), cartVO.getCartQty());

		}
	}

	

}
