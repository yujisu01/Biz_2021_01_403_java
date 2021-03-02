package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV3 implements MenuService {

	private Scanner scan;

	public MenuServiceImplV3() {
		scan = new Scanner(System.in);
	}

	/*
	 * 메뉴를 보여주고 선택된 메뉴에 따라 
	 * 카트에 추가, 삭제 하거나 리스트를 보여줘야 한다. 
	 * 		이 기능을 menuService에서 구현하는 것이 아니라
	 * 		selectMenu()를 호출한곳에서 구현을 해야한다.
	 * 
	 * 호출한 곳에서 selectMenu() 결과에 따라,
	 * 		기능을 수행하려면
	 * 사용자가 메뉴를 보고 선택했을때, 
	 * 선택된 결과값을
	 * 호출한곳에 return해줘야한다.
	 * 
	 * 이렇게 설계를 변경하려면 method를 void type이 아닌, 
	 * int나 String등의 다른 type으로 변경해야 한다. 
	 * 클래스method를 변경하려면 interface부터 변경하고, 
	 * interface를 implement한 모든클래스를 다 변경해야 한다.
	 * 
	 * 인터페이스, 클래스의 원형을 변경하지 않고 
	 * 현재 method에만 어떤 기능을 추가하고자 한다.
	 * 
	 * 그래서 별도로 menuItem 변수를 하나 선언하고,
	 * 이 변수값으로 선택된 메뉴를 알수 있도록 하겠다
	 * 
	 */
	public Integer menuItem = null;

	/*
	 * 메뉴를 확인한후
	 * 사용자가 메뉴를 선택하면 
	 * "menuItem"에 적절한 값을 담고, return을 수행하도록 코드구현을 했다.
	 * 
	 * QUIT를 선택하면
	 * menuItem = null
	 * 1 ~ 3중에서 선택하면 
	 * menuItem = 선택한숫자
	 * 
	 * 이렇게 구현했다.
	 */
	@Override
	public void selectMenu() {

		while (true) {

			System.out.println("=====================================");
			System.out.println("\t카트 메뉴 시스템 V3");
			System.out.println("-------------------------------------");
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("QUIT. 끝내기");
			System.out.println("------------------------------------------");

			System.out.print("선택>> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				this.menuItem = null;
				break;
			}
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					this.menuItem = intMenu;
					break;	// 끝내버리는거
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴는 QUIT(끝내기), 1~3까지만 입력하세요");
			}

		}
	}
}
