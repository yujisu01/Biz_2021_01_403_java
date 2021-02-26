package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2T {
	
	public static void main(String[] args) {
		// VO클래스를 배열로 사용하는 클래스.
		CartVO[] cartVO = new CartVO[3];
		
		cartVO[0] = new CartVO();
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartQty(5);
		cartVO[0].setCartTotal(34000);
		
		System.out.println(cartVO[0].toString());
		
		cartVO[1] = new CartVO();
		cartVO[1].setCartPName("딸기파이");
		cartVO[1].setCartUserName("유지수");
		cartVO[1].setCartPrice(1000);
		cartVO[1].setCartQty(3);
		cartVO[1].setCartTotal(3000);
		
		System.out.println(cartVO[1].toString());
		
		cartVO[2] = new CartVO();
		cartVO[2].setCartPName("애플파이");
		cartVO[2].setCartUserName("이몽룡");
		cartVO[2].setCartPrice(2000);
		cartVO[2].setCartQty(5);
		cartVO[2].setCartTotal(10000);
		
		System.out.println(cartVO[2].toString());
		
		// 여기까지 현재 cartVO의 개수가 3인 상태이다.
		// 근데 상품 한가지를 카트에 더 넣고싶다.
		
		// 이름은 같지만 새로운 cartVO가 만들어진것과 똑같다.
		// cartVO [3]번을 새로 생성했다. 
		// 이 과정에서 [0],[1],[2] 번이 소멸됐다. (위쪽의 코드들이 다 무시됨)
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");  // 총 4개의상품이 있다.
		
		
		System.out.println("================================================");
		System.out.println("\t카트내용");
		System.out.println("------------------------------------------------");
		for(int i = 0 ; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString());
			
		}
	}

}
