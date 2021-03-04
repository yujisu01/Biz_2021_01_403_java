package com.callor.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuServiceT;
import com.callor.shop.values.Values;

/*
 * Impl 접미사란?
 * 		인터페이스를 implement 하여 생성한 클래스다 라는것을 표시.
 */
public class MenuServiceImplV1T implements MenuServiceT {
	/*
	 * final 키워드는 혹시모를 어디에서 변수, 객체를 변경못하도록 방지하는 조치이다. (=변수 방지의 목적) '상수 선언'이라고 한다.
	 * final로 선언된 변수나 객체는 읽기 전용이다.
	 * 
	 * 값을 저장하려고 시도하면 오류가 난다.
	 * 
	 * final int num = 0; num = 100; // 오류를 발생한다.
	 * 
	 */
	private final Scanner scan;

	public MenuServiceImplV1T() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println(Values.dLine);
			System.out.println("\t빛나라 쇼핑몰 2021");
			System.out.println(Values.sLine);
			System.out.printf("%d. 장바구니 추가\n", Values.MENU_INPUT);
			System.out.printf("%d. 장바구니 전체 보기\n", Values.MENU_ALL_LIST);
			System.out.printf("%d. 구매자별 장바구니 보기\n", Values.MENU_USER_LIST);
			System.out.printf("%d. 장바구니 파일저장\n", Values.MENU_SAVE_CART_LIST);
			
			System.out.println("QUIT. 업무종료");
			System.out.println(Values.dLine);
			System.out.print("선택>>");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				// break로 할수도 있지만 while안묶었기 때문에 return null 해주었다.
				return null;
			}
			// if문과 try문을 분리하기 위해 일단 주석처리함..
			/*
			 * try { 
			 * Integer intMenu = Integer.valueOf(strMenu); 
			 * if(intMenu >=1 && intMenu<=3) { 
			 * return intMenu; } 
			 * } catch (Exception e) 
			 * { // TODO: handle exception }
			 */

			// int가 아닌 Integer로 선언
			// try문에서는 Integer.valueOf만 적용시키겠다
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);

			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT(끝내기), %d ~ %d까지만 입력하세요", 
						Values.MENU_START, Values.MENU_LAST);
				continue;
			}

			// try문과 if문을 분리해주는게 더 최적화된 코드이다.
			if (intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;

			}else {
				System.out.printf("업무는 %d ~ %d까지 중 선택하세요",
						Values.MENU_START, Values.MENU_LAST);
			}
		}
	}

}
