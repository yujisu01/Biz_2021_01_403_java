package com.callor.oop;

import com.callor.oop.service.impl.CartServiceimplV1;
import com.callor.oop.service.impl.CartServiceimplV2;

public class CartEx_02 {
	
	public static void main(String[] args) {
		// 1. CartImplV1 을 사용하여 코드구현 하다가
		CartServiceimplV1 csIV1 = new CartServiceimplV1();
		csIV1.inputCart();
		csIV1.printCart();
		
		// 2. CartImplV2로 업그레이드 할것이다.
		// CartV1과 CartV2는 같은 인터페이스를 impl하였기 때문에
		// '클래스만 교체해 주면' 메서드를 호출하는 나머지코드는 
		// 변경할 필요가 없다.
		CartServiceimplV2 csIV2 = new CartServiceimplV2();
		csIV2.inputCart();
		csIV2.printCart();
		
	}

}
