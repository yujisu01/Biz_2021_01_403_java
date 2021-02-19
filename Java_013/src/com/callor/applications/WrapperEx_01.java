package com.callor.applications;

public class WrapperEx_01 {
	
	public static void main(String[] args) {
		
		/*
		 * wrapper class란?
		 * 
		 * 변수를 선언하는 기본키워드가 있는데
		 * 		(int, long, float, double, boolean, char ..등등..)
		 * 초기에 java를 만들때 값을 저장하는 
		 * 최소한의 기능만을 구현했다.
		 * 
		 * 이후에 필요에 의해 기능들을 추가해야 하는데,
		 * 기본 키워드의 기능을 변경하기에는 어려움이 있었다.
		 * 
		 * 그래서 java에서는 기본 키워드 기능을 확장하는
		 * 클래스들을 만들어서 JDK에 포함했다. 
		 * (사용법은 변수와 똑같다.)
		 */
		int intNum1 = 0;
		Integer intNum2 = 0;
		
		float floatNum1 = 30.2f;
		Float floatNum2 = 30.2f;
		
		long longNum1 = 300L;
		Long longNum2 = 300L;
		
		double doNum1 = 300.0;
		Double doNum2 = 300.0;
				doNum2 = doNum1;
		
		String str1 = "대한민국";
		String str2 = new String("우리나라");
		
		// 정수 30을 float형으로 변환하여 저장
		float floatNum3 = Float.valueOf(30);
		floatNum3 = (float)30;
		
		// 정수 50을 Float형으로 변환하여 저장하고
		Float floatNum4 = Float.valueOf(50);
		// 다시 Float형 50을 정수형으로 변환하여 저장함.
		int intNum4 = floatNum4.intValue();
	}

}
