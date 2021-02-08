package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			
			// boolean 변수에 i % 2==0을 담음
			boolean bYes = i % 2 == 0;
			
			// 만약 bYes가 TRUE이면 
			if (bYes) {
				
				// 값을 변수에 계속 더하라
				sum += i;
				
			}

		}
		// 결과값을 출력하라
		System.out.println("짝수들의 합 : " + sum);
		System.out.println("=====================");
		
		sum = 0;

		// 나는 이렇게 출력했다
		for (int i = 0; i < 100; i++) {

			if (i % 2 == 1) {
				sum += i;
			}

		}
		System.out.println("홀수들의 합 : " + sum);

	}
}
