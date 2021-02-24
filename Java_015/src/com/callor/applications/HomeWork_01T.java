package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2T;

public class HomeWork_01T {
	
	/*
	 * 2 이상의 임의의 정수 100개를 만들고
	 * PrimeServiceV2의 prime() 메서드를 호출하여
	 * 임의정수 100개중, 소수인 수들의 리스트를 출력하고
	 * 소수인 수들의 합을 구하라!
	 */
	public static void main(String[] args) {
		
		PrimeServiceV2T psV2 = new PrimeServiceV2T();
		Random rnd = new Random();
		
		// 이 두개의 변수는 for()반복문에서 수행한 연산이다.
		// 덧셈과 개수세기를 수행한후
		// 결과를 출력하는 곳에서, 사용해야할 변수이다.
		// 따라서, for()반복문이 시작되기전에, 변수를 선언및 초기화 해줘야한다.
		int intPrimeSum = 0;
		
		// 갯수도 세보려고 선언했다.
		int intPrimeCount = 0;
		
		for(int i = 0; i < 100 ; i++) {
			// 0부터 99까지의 난수를 생성하고
			// 생성된 난수에 +2를 수행하라
			// 그럼, 실제 생성된 수는 2 ~ 101 까지 일것이다.
			// 그래서 rndNum에 저장..
			int rndNum = rnd.nextInt(100) + 2;
			
			// psV2의 클래스의 prime() 메서드는 
			// rndNum가 소수이면, 그 수를 그대로 리턴하고, 
			// 아니면 -1을 리턴하라...
			int result = psV2.prime(rndNum);
			if(result > 0) {
				System.out.print(rndNum + ",");
				
				
				//intPrimeSum += rndNum;  ===> 실제 실무에서는 이 두개의 코드를 사용한다,
				//intPrimeCount++;         		
			}
			// 소수들의 합을 계산하는 코드이다.
			// intPrimeSum 변수에 값을 누적하여 합계계산.
			if(result > 0) {
				intPrimeSum += rndNum;
			}
			// 소수들의 개수를 세는 코드이다.
			// 위에서 선언한 intPrimeCount로 세준다.
			if(result > 0) {
				intPrimeCount++;
			}
		} // end for (이런 주석도 달아주어야 한다. 이괄호가 무엇을 뜻하는지)
		System.out.println();
		System.out.println("합계: " + intPrimeSum);
		System.out.println("개수: " + intPrimeCount);
	}

}
