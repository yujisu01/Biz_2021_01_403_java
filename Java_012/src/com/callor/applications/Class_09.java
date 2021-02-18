package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {

		ClassServiceV7 csV7 = new ClassServiceV7();
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 입력 (2 ~ 9까지만 출력됨) >>");

		int dan = scan.nextInt();
		csV7.gugu(dan);

	}

}
