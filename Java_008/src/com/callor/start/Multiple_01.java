package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {

		int sum = 0;
		int num = 0;

		for (int i = 0; i < 100; i++) {

			num = i + 7;

			boolean bYes = num % 3 == 0;
			if (bYes) {
				System.out.println("3의 배수: " + num);
			sum += num;
			}
		}
				System.out.println("3의 배수들의 합 : " + sum);
	}

}
