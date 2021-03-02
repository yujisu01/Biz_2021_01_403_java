package com.callor.oop.service;
/*
 * Project에서 Interface를 만드는 이유는?
 * 1. 앞으로 CartService** 클래스를 만들때는
 * 		반드시 CartService interface를 implements 하라.
 */
public interface CartService {
	
	public void inputCart();
	public void printCart();

}
