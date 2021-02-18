package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7T;

public class Class_09T {
	
	public static void main(String[] args) {
		
		ClassServiceV7T csV7 = new ClassServiceV7T();
		Scanner scan = new Scanner(System.in);
		System.out.print(" 2 ~ 9 까지중 정수 1개 입력 >> ");
		int dan = scan.nextInt();		// 스캔문 출력준비완료
		
		csV7.guguDan(dan);
		
	}

}
