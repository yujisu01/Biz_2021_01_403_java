package com.callor.shop.service;

public interface CartServiceT {
	
	public void inputCart();		// 시스템 내부에서 사용
	public void printAllCart();		// 관리자용
	public void printUserCart();	// 일반 사용자용

}
