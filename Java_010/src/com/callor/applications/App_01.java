package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num = scan.nextInt();

		System.out.println("=======================");
		System.out.println("구구단 " + num + " 단");
		System.out.println("-----------------------");

		for (int i = 0; i < 10; i++) {

			System.out.println(num + " x " + i + " = " + i * num);
		}

	}

}
