package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;

public class CartList_03 {
	
	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		/*
		 * 변수를 선언하면
		 * int num = 100; 예를들어 이렇게 선언하면
		 * 기억장치 어딘가에 정수 100을 저장하고 
		 * 그곳에 num라는 별명을 부착한다.
		 * 언제나 num = 40 등의 코드를 수행해서
		 * 변수값을 변경하고,
		 * System.out.println(num)   등의 코드를 수행해서
		 * 변수에 저장된 값을 읽을수 있다.
		 * 
		 * VO클래스를 사용하여 객체를 선언및 생성하면 
		 * VO클래스에는 다양한 type의 인스턴스 변수들이
		 * 		포함되어 있기 때문에 
		 * 		변수처럼 한곳에 모아둘수가 없다.
		 * 
		 * 1. VO클래스에 선언된 인스턴스변수들을 저장할 
		 * 		기억장소를 예약하고
		 * 2. 그 기억장소의 주소를 객체변수에 저장한다.
		 * 3. 결국 cartVO에 실제로 담긴 값은 
		 * 		인스턴스 변수에 저장한 값들이 아니라, 
		 * 		인스턴스 변수들의 주소가 된다. 
		 * 
		 */
		CartVO cartVO = new CartVO();
		
		cartVO.setCartUserName("홍길동");
		
		// cartVO에 담긴 데이터를 
		// 리스트에 추가 하라는 명령 (cartList.add(cartVO);
		// 실제로는 데이터가 아니라, 데이터가 저장된
		// "주소"가 추가되는것이다.
		cartList.add(cartVO);
		
		cartVO = new CartVO();
		cartVO.setCartUserName("이몽룡");
		cartList.add(cartVO);
		cartVO = new CartVO();
		cartVO.setCartUserName("성춘향");
		cartList.add(cartVO);
		cartVO = new CartVO();
		cartVO.setCartUserName("장녹수");
		cartList.add(cartVO);
		cartVO = new CartVO();
		cartVO.setCartUserName("임꺽정");
		cartList.add(cartVO);
		
		// 마지막에 입력한 '임꺽정'만 5번 출력되는 것을 볼수있다.
		for(int i = 0 ; i < 5; i++) {
			String name = cartList.get(i).getCartUserName();
			System.out.println("구매자: " + name);
		}
		
	}

}
