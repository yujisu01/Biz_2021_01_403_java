package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {

	private int intnum1 = 0;
	private int intnum2 = 0;
	private Scanner scan = new Scanner(System.in);

	public void input() {
		System.out.print("숫자 1번입력 >> ");
		intnum1 = scan.nextInt();
		System.out.print("숫자 2번입력 >> ");
		intnum2 = scan.nextInt();
	}

	public void algebra() {
		int result1 = intnum1 + intnum2;
		int result2 = intnum2 - intnum1;
		int result3 = intnum1 * intnum2;
		int result4 = intnum2 / intnum1;

		System.out.println(intnum1 + " + " + intnum2 + " = " + result1);
		System.out.println(intnum2 + " - " + intnum1 + " = " + result2);
		System.out.println(intnum1 + " x " + intnum2 + " = " + result3);
		System.out.println(intnum2 + " / " + intnum1 + " = " + result4);
	}

}
