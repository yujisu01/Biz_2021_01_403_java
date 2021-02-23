package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;

		}
		System.out.println("정수 1~ 10까지중 입력하세요");
		System.out.print("숫자입력>> ");
		int scanNum = scan.nextInt();

		int last = 0;
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] == scanNum) {
				last = i;

			}
		}
		System.out.println(scanNum + "번값이 마지막으로 나타난 위치: " + last);
	}

}
