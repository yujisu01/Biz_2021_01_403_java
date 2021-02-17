package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("국어 \t 영어  \t 수학 \t 총점 \t 평균 ");
		System.out.println("-----------------------------------------");

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;

		intKor = scan.nextInt();
		intEng = scan.nextInt();
		intMath = scan.nextInt();

		// intKor = scan.nextInt(100) + 1; 내가 틀리게 쓴거
		// intEng = scan.nextInt(100) + 1;
		// intMath = scan.nextInt(100) + 1;

		boolean bYes1 = intKor > 100;
		boolean bYes2 = intEng > 100;
		boolean bYes3 = intMath > 100;

		if (bYes1 || bYes2 || bYes3) {

			System.out.println("0부터 100까지만 입력하세요");
		}
			int intSum = 0;
			intSum += intKor;
			intSum += intEng;
			intSum += intMath;

			float intAvg = 0;
			intAvg = intSum / 3;

			System.out.print(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + intAvg);
		}
	}

