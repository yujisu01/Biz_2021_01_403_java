package com.callor.applications.service;

public class ScoreServiceV4 {

	// 총점과 평균을 전달받는 2개의 매개변수가 있는 스코어메서드.
	// 총점과 평균을 매개변수로 전달받아서 콘솔에 총점과 평균 출력...

	public void score(int intSum, float floatAvg) {
		System.out.println("총점:" + intSum);
		System.out.println("평균:" + floatAvg);
	}

	public void print(int intKor, int intEng, int intMath) {

		System.out.println("==============================================");
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("----------------------------------------------");

		int intSum = intKor + intEng + intMath;
		float fAvg = intSum / 3F;

		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.println(fAvg + "\t");

		System.out.println("=======================================");
	}

}
