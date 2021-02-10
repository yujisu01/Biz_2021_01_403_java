package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_10 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자(2 ~ 9까지) >> ");
			int num = scan.nextInt();
			
			if(num < 2 || num > 9) {
				System.out.println("입력 오류");
				System.out.print("< 2 ~ 9 까지만 구구단출력 가능!!> ");
				System.out.println("재입력 바랍니다");
			}else {
				myDan.print(num);
			}
		}
	}

}
