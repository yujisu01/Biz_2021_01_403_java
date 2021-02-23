package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2T;

public class HomeWork_01 {

	public static void main(String[] args) {

		PrimeServiceV2T psV2 = new PrimeServiceV2T();
		Random rnd = new Random();
		
		int[] intNum = new int[10];
		
		
		for (int i = 0; i < intNum.length; i++) {
		intNum[i] = rnd.nextInt(100);
		System.out.println("정수 출력:" + intNum[i]);
		}
		
		int intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			int result = psV2.prime(intNum[i]);
			if (result > 0) {
				System.out.println("소수들: " + intNum[i]);
				intSum += intNum[i];
			}
			
			
		}System.out.println("소수인 수들의 합계:" + intSum);
	}
}
