package com.callor.score.service;

import java.util.Random;

public class ScoreServiceV1 {

	// private int intKor = 0;
	// private int intEng = 0;
	// private int intMath = 0;
	// private int intSum = 0;
	// private float fAvg = 0;
	private Random rnd = new Random();
	private int intSum = 0;
	private float fAvg = 0;

	public int scoreSum(int intNum1, int intNum2, int intNum3) {

		intSum = intNum1;
		intSum += intNum2;
		intSum += intNum3;

		return intSum;
	}

	public float scoreAvg(float fNum1, float fNum2, float fNum3) {

		fAvg = (float) intSum / 3;

		return fAvg;

	}

	public void scorePrint() {

		System.out.println("============================================");
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("--------------------------------------------");

	}

}
