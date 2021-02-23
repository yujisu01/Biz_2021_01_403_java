package com.callor.applications;

import java.util.Random;
import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int[] intNum = new int[10];

		System.out.println("정수 출력");
		System.out.println("======================");

		for (int i = 2; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100);
			System.out.println(intNum[i]);
		}
		int intSum = 0;

		System.out.println("소수출력");
		System.out.println("=======================");

		for (int i = 2; i < intNum.length; i++) {
			int result = psV2.prime(intNum[i]);
		
			if (result > 0) {
				System.out.println(intNum[i]);

				intSum += intNum[i];

			}
		}
		System.out.println("소수인 수들의 합계:" + intSum);

	}
}
