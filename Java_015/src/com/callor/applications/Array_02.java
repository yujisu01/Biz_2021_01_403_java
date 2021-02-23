package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		System.out.println("정수 1~ 10까지중 숫자입력하시오");
		System.out.print("숫자입력>> ");
		int scanNum = scan.nextInt();

		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bYes = intNums[i] == scanNum;
			if (bYes) {
				// count++;
				System.out.println(i + "번째에 위치");
			}
		}

	}

}
