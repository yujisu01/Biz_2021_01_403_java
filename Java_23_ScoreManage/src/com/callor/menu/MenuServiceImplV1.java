package com.callor.menu;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceImplV1 implements MenuService{

	private final Scanner scan;
	public MenuServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("==========================================");
			System.out.println("빛나리 고교 성적처리 시스템");
			System.out.println("------------------------------------------");
			
			System.out.println("1. 학생성적 점수생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				return null;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴는 QUIT, 1~3번까지만 가능");
				continue;
			}
			if(intMenu >=1 && intMenu <=3) {
				return intMenu;
			}else {
				System.out.println("업무는 1~3번까지중에서 선택");
			}
		}
		//return null;
	}

}
