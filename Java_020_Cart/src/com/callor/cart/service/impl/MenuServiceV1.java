package com.callor.cart.service.impl;

import java.util.Scanner;

import com.callor.cart.service.MenuService;

public class MenuServiceV1 implements MenuService{
	
	private Scanner scan;
	public MenuServiceV1() {
		// 생성자 메서드에서 scanner 초기화 시켜주기
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		
		while(true) {
			System.out.println("========================================");
			System.out.println("\t카트메뉴");
			System.out.println("----------------------------------------");
			
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 종료하기");
			System.out.println("----------------------------------------");
			
			String strMenu = scan.nextLine();
			if(strMenu.equals("Q")) {
				break;
			}
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu >=1 && intMenu <=3) {
					return intMenu;
				}else {
					System.out.println("메뉴는 1 ~ 3까지만 선택가능!");
				}
				
			} catch (Exception e) {
				System.out.println("메뉴선택은 Q, 1 ~ 3 까지의 정수만 가능!!");
			}
			
			
		}
		
		return null;
	}
	
	

}
