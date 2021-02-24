package com.callor.applications;

import java.util.Random;

public class Prime_04 {
	/*
	 * 배열없이 단순하게 난수를 생성하고, 
	 * 소수인지 판별하여 출력하기. 
	 * 중복(이중) 반복문..
	 */
	public static void main(String[] args) {

		// 이 두개의 for문(이중)은 몇번 실행될까?
		// i 반복횟수 * j 반복횟수만큼 반복이 된다.
		for (int i = 0; i < 10; i++) {
			for (int j = 0; i < 10; i++) {

			}
		}
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		Random rnd = new Random();
		// test용이라 0부터 9까지만 범위를 설정했다.
		for (int i = 0; i < 10; i++) {

			int rndNum = rnd.nextInt(1000) + 2; // 2~1001까지 생성됨.

			// 생성된 난수(rndNum)값이 소수인지 검사할것이다.
			int index = 0;
			// for문과 for문이 현재 겹쳐있는 상태.
			// 중요한것: 밖의 for문과 안의 for문이 절대 중복되면 안된다.
			for (index = 2; index < rndNum; index++) {
				if(rndNum % index == 0) {
					break;
				}

			}
			if(index < rndNum) {
				System.out.println(rndNum + "는 소수가아니다");
			}else {
				System.out.println(rndNum + "는 소수이다.");
				intPrimeSum += rndNum;
				intPrimeCount++;
			}
		}// for i end
		
		System.out.println("합계: "+ intPrimeSum);
		System.out.println("개수: "+ intPrimeCount);

	}
}
