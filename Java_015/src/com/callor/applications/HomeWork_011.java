package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2T;

public class HomeWork_011 {
	/*
	 * 2 이상의 임의의 정수 100개를 만들고
	 * PrimeServiceV2의 prime() 메서드를 호출하여
	 * 임의정수 100개중, 소수인 수들의 리스트를 출력하고
	 * 소수인 수들의 합을 구하라!
	 */
	public static void main(String[] args) {
		/*
		 * java에서는 변수, 객체를 선언할때
		 * 사용직전에 선언및 초기화를 하면된다.
		 * 
		 * 코딩을 할때 변수, 객체등의 선언은
		 * 가급적, 코드의 시작부분에
		 * (클래스 선언 명령문 아래 or 메서드 선언문 아래)
		 * 작성하는것이 일반적이다.
		 */
		
		Random rnd = new Random();
		PrimeServiceV2T psV2 = new PrimeServiceV2T();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		// int rndNum[] = new int[100] 과 똑같다. 대괄호의 위치주목..
		int[] rndNum = new int[100];
		
		// 생성된 rndNum 배열에 임의의 정수 100개를 저장해놓은 상태이다.
		// 이처럼 배열을 만들어두면,
		// 이후의 코드에서 한번 생성된 임의의 정수 100개를
		// 자유롭게 활용할수 있다.
		for(int i = 0; i < 100; i++) {
			rndNum[i] = rnd.nextInt(10000) + 2;
		}
		
		/*
		 * rndNum 배열에 담겨있는 정수들을
		 * psV2.prime() 메서드에 보내서
		 * 소수인가를 검사해야 한다.
		 * 
		 * psV2.prime(rndNum); 
		 * 이 코드채로 (배열을 통째로 전달하여)
		 * 수행할수 없는이유:
		 * 
		 * psV2.prime(rndNum) 메소드의 매개변수는 현재 (int intNum) 으로
		 * 선언되어 있다.
		 * 즉, 이 메서드는 전달받을수 있는 값이 정수 1개값이다.
		 * 
		 * 그런데 배열(100개의 정수)를 한꺼번에 전달하려고
		 * 시도하기 때문에 안된다. (배열이 필요한 이유)
		 * 
		 * 또다른이유:
		 * rndNum의 타입과, intNum의 타입이 달라서 이기도 하다.
		 * 
		 * 그렇다면 psV2.prime() 메서드를 사용하기 위해서
		 * rndNums의 요소들을 한개씩 전달해야 한다.
		 * 
		 * 결론은, for반복문을 사용해야 한다.
		 */
		for(int i = 0; i < rndNum.length; i++) {
			int num = rndNum[i];
			int result = psV2.prime(num);
			if(result > 0) {
				// rndNum[i]를 num값에 저장해주었기 때문에,
				// num 으로 출력한다.
				System.out.print(num + ",");
			}
		}
		// 위 코드에서 다 사용해도 된다. (실무에서 유용)
		// 다만 현재는 연습하고 있기때문에 추가되는 코드이다.
		for(int i = 0; i < rndNum.length; i++) {
			int num = rndNum[i];
			int result = psV2.prime(num);
			if (result>0) {
				intPrimeSum += num;
		
			}
		for(i = 0; i < rndNum.length; i++) {
			num = rndNum[i];
			result = psV2.prime(num);
			if (result>0) {
				intPrimeCount++;
			}
			
		}
	}
	System.out.println();
	System.out.println("합계:" +intPrimeSum);
	System.out.println("개수: " + intPrimeCount);

}
}