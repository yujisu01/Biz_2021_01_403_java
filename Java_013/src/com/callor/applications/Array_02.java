package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];

		// 이 첫번째 코드는 랜덤수를 저장하는 코드이다.
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		// 이 두번째 코드는 랜덤수중 전체합계를 출력하는 코드이다.
		int intSum = 0;
		for (int i = 0 ; i < 10; i++) {
			intSum += intNum[i];
		}			
		System.out.println("1 ~ 100까지의 임의의 수 전체 합계 : " + intSum);
		// 이 세번째 코드는 랜덤수중 짝수 합계를 출력하는 코드이다.
		int evenSum = 0;
		for (int i = 0; i < 10; i++) {
			if (intNum[i] % 2 == 0) {
				evenSum += intNum[i];
			}
		}
		System.out.println("1 ~ 100까지의 임의의 수중 짝수 합계 : " + evenSum);

	}

}
