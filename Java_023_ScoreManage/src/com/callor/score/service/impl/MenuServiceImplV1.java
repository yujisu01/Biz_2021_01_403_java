package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {

@Override
	public Integer selectMenu() {

	Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.printf("%d. 학생성적 점수생성\n", Values.MENU_MAKE_RND);
			System.out.printf("%d. 학생성적 점수파일에 저장\n", Values.MENU_SAVE_FILE);
			System.out.printf("%d. 학생성적 결과확인\n", Values.MENU_LOAD_TO_FILE);
			System.out.println("QUIT. 끝내기\n");
			System.out.println(Values.dLine);
			System.out.print("선택>>>");
			String strMenu = scan.nextLine();

			if(strMenu.equals("QUIT")) {
				return null;
				}
		Integer intMenu = null;
			try {

				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
					System.out.printf("메뉴는 QUIT, %d ~ %d의 정수만 입력하세요\n", 
								Values.MENU_START, Values.MENU_LAST);
					}
				if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
						return intMenu;

					}else {
						System.out.printf("업무는 QUIT, %d ~ %d 번까지만 선택\n" ,
								Values.MENU_START, Values.MENU_LAST);
						}

}

}
}