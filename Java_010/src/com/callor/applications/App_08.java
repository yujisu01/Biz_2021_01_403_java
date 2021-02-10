package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_08 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		// 키보드에서 숫자를 하나 입력받겠다 (2부터 9까지만)
		System.out.print("숫자 ( 2 ~ 9 ) >> ");
		int num = scan.nextInt();
		
		// 여기에 담긴 num는 int dan에 담기게된다.
		myDan.print(num);
		
	}

}
