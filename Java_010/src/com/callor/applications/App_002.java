package com.callor.applications;

import java.util.Scanner;

public class App_002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력(2 ~ 9까지 출력됨) >> ");
		int num1 = scan.nextInt();  
		
		boolean bYes2 = num1 >= 2;
		boolean bYes9 = num1 <= 9;
		if(bYes2 && bYes9) {
			
			System.out.println("========================");
			System.out.println("구구단" + num1 + "단");
			System.out.println("------------------------");

			for(int i = 0 ; i < 8 ; i++) {
				int num2 = i + 2;
				System.out.println(num1 + "x" + num2 + " = " + num1 * num2);
			}
			System.out.println("==============================");
		}else {
			System.out.println("입력한 숫자 : " + num1);
			System.out.println("값은 2 ~ 9까지만 입력하라");
		}
	}
}
