package com.callor.start.jdk;

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;

			if (num % 2 == 0) {
				intSum += num;
			}
		}
		System.out.println("1 ~ 100 까지의 임의의 짝수들의 합 : " + intSum);
	}

}
