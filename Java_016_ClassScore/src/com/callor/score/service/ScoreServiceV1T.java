package com.callor.score.service;

public class ScoreServiceV1T {

	public int scoreSum(int intKor, int intEng, int intMath) {
		/*
		 * 3과목의 점수를 전달받아서 합산하고, 결과를 return하는 메서드이다.
		 */
		int sum = intKor;
		sum += intEng;
		sum += intMath;
		return sum;
	}

	/*
	 * 총점 점수를 전달받고, 과목수로 나누어서 return
	 */
	public float scoreAvg(int intSum) {
		return (float) intSum / 3;
	}

	public void print(String strName, int intKor, int intEng, int intMath,
			int intSum, float floatAvg) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName, intKor, intEng, intMath,
				intSum, floatAvg);

	}

	/*
	 * 배열을 매개변수로 받는 print()메서드이다.
	 */
	public void print1(String[] strName, int[] intKor, int[] intEng, int[] intMath,
			int[] intSum, float[] floatAvg) {

		System.out.println("============================================");
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i],
					intSum[i], floatAvg[i]);

		}
	}

}
