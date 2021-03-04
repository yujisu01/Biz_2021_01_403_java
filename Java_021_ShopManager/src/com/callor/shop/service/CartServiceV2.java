package com.callor.shop.service;

public interface CartServiceV2 extends CartServiceT {
	
	public void saveCartToFile();
	public void loadCartFromFile();
	

}
