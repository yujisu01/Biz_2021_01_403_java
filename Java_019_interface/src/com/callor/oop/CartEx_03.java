package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceimplV2;

public class CartEx_03 {
	
	public static void main(String[] args) {
		// implV1에서 V2로 업그레이드 했다. (V1->V2로 변경만 해주면됨)
		CartService cServ = new CartServiceimplV2();
		cServ.inputCart();
		cServ.printCart();
	}

}
