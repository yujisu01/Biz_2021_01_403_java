package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_09 {

	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 ( 2 ~ 9 ) >> ");
		int num = scan.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("입력오류");
		} else {
			myDan.print(num);
		}
		
		
	}
	
}
