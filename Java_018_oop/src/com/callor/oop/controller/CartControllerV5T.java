package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV1T;

/*
 * Controller클래스
 * 웹 어플리케이션을 수행할때
 * 처음 시작하는 시작점 클래스가 된다.
 * 
 * Service등의 모듈클래스를 객체로 선언하고,
 * 모듈클래스에 메서드들을 호출하는 일만 수행한다.
 * (나머지일은 Service가 수행한다.)
 * 
 */
public class CartControllerV5T {
	
	public static void main(String[] args) {
		
		CartServiceV1T csV1 = new CartServiceV1T();
		
		csV1.inputCart();
		csV1.printCart();
		
		
	}

}
