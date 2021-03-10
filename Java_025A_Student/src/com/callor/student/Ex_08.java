package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언해서
 * 10 ~ 100 까지 임의의 정수를 생성하여 저장..
 * 
 * 100개의 배열에 담긴 정수 중,
 * 소수들만 찾아서 ..(소수냐 아니냐가 아니라 소수만 출력하는거)
 * Console에 출력하기 
 * (숙제다)
 * 배열과 for문이 나옴 
 * 
 */
public class Ex_08 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] num = new int[100];
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(90) + 10;
			System.out.print(num[i] + ",");

			count++;
			if (count % 5 == 0) {
				System.out.println();
			}

		}
		System.out.println("=========================");

		for (int i = 0; i < num.length; i++) {
			// int num[i] = rnd.nextInt(90) + 10;
			int index = 0;
			for (index = 2; index < num.length; index++) {
				if (num[i] % index == 0) {
					break;
				}
			}
			if (index < num[i]) {

			} else {
				System.out.print(num[i] + ",");
			}
		}

	}
}
