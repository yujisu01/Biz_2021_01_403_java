package com.callor.shop.service;

public interface MenuServiceT {
	/*
	 * Interface는 클래스를 선언하기 위한
	 * 1. 설계도, 길잡이 역할
	 * 2. 이후에 클래스를 업그레이드 하기위하여 
	 * 		새로 만들어 프로젝트에 적용할때
	 * 		기존 코드의 수정을 최소화 하기 위한 역할도 한다.(권장 이유)
	 */
	public Integer selectMenu();

}
