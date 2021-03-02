package com.callor.oop;

import com.callor.oop.service.impl.CartServiceV1;
import com.callor.oop.service.impl.CartServiceV2;

public class CartEx_01 {
	/*
	 * Cart project에서 CartServiceV1을 사용하여
	 * cart기능을 구현했다.
	 * 
	 * Cart project를 사용하는 중에
	 * 		Cart Service의 기능을 업그레이드 해야 할 일이
	 * 		발생했다.
	 * 		CartServiceV1을 그대로 두고
	 * 		CartServiceV2를 새로 만들어서, 
	 * 		기존의 기능을 업그레이드 하려고 한다.
	 */
	public static void main(String[] args) {
		// 1.CartServiceV1 사용
		CartServiceV1 csV1 = new CartServiceV1();
		csV1.input_Cart();
		csV1.print_Cart();
		
		// 2.CartSetviceV2 사용하자
		// CartV1을 사용하다가 V2로 업그레이드를 하면
		// method()를 호출하는 부분에서 상당히 많은 코드변경을 해야한다.
		// 업그레이드를 위해 많은 코드변경이 이뤄지면
		// 그 과정에서 오류가 발생할 확률이 굉장히 높아진다.
		CartServiceV2 csV2 = new CartServiceV2();
		csV2.input_Cart();
		csV2.print_Cart();
		
	}

}
