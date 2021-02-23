package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("1 ~ 10중 정수 하나를 입력해라>>");
		for (int i = 0; i < intNums.length; i++) {
		}
		int scanNums = scan.nextInt();

		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			if (i % intNums[i] == scanNums) {
				count++;
			}
		}
		System.out.println("=================================");
		System.out.println(count + "번 들어가있다");

	}
}