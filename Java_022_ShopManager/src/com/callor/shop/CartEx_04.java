package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.model.CartVO;

public class CartEx_04 {
	
	public static void main(String[] args) {
		
		// 매개변수가 없는 생성자메서드를 호출하여
		// 객체를 생성하고, 
		// setter 메서드를 사용하여 데이터를 저장했다
		CartVO vo1 = new CartVO();
		vo1.setUserName("유지수");
		vo1.setProductName("초코파이");
		vo1.setQty(10);
		vo1.setPrice(1000);
		
		// 매개변수가 있는 생성자를 호출하여
		// 객체를 생성하면서, 
		// 동시에 데이터를 저장.
		CartVO vo2 = new CartVO("홍길동", "신라면", 20, 500);
		CartVO vo3 = new CartVO("코카콜라", "홍길동", 20, 500);
		
		// 매개변수가 있는 생성자일 것이다. .. (랜덤은 매개변수 없음)
		Scanner scan = new Scanner(System.in);
	}

}
