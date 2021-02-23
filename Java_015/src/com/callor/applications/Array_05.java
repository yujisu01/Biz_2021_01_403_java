package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		System.out.println("3의 배수이면서 5의 배수인 값들 : ");
		System.out.println("============================================");

		int intSum = 0;
		for (int i = 0; i < intNums.length; i++) {

			boolean bYes3 = intNums[i] % 3 == 0;
			boolean bYes5 = intNums[i] % 5 == 0;
			if (bYes3 && bYes5) {

				System.out.print(intNums[i] + ",");
				System.out.println();
				intSum += intNums[i];
			}

		}
		System.out.println("3의 배수이면서 5의 배수인 값들의 합계: " + intSum);

	}
}
