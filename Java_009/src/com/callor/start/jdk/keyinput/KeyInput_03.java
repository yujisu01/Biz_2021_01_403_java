package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 입력 >>");
		int num = scan.nextInt();
		int num1 = rnd.nextInt(100) + 1;
		// int num = 0;

			num1 = rnd.nextInt(100) + 1;

		if (num > num1) {
			System.out.println(num + " > " + num1 );
		}
		if (num < num1) {
			System.out.println(num + " < " + num1 );

		}
		if (num == num1) {
			System.out.println(num + " == " + num1 );
		}
	}
	}

