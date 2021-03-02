package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	private Scanner scan;

	public void selectMenu() {
		while (true) {
			scan = new Scanner(System.in);

			System.out.print("선택 >>");
			String strmenu = scan.nextLine();

			System.out.println("==========================================");
			System.out.println("\tJava Menu System v1");
			System.out.println("------------------------------------------");
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("------------------------------------------");

			if (strmenu == "1") {
				continue;
			} else if (strmenu == "2") {
				continue;
			} else if (strmenu == "3") {
				continue;

			}
			
		}

	}
}
