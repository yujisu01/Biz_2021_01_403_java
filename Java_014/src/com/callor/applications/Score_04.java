package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Score_04 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		Random rnd = new Random();

		for (int i = 0; i < strName.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;
			System.out.println("이름: " + strName[i]);
			System.out.println("국어점수>> " + intKor[i]);

			intEng[i] = rnd.nextInt(100) + 1;
			System.out.println("영어점수>> " + intEng[i]);

			intMath[i] = rnd.nextInt(100) + 1;
			System.out.println("수학점수>> " + intMath[i]);

		}

		System.out.println("==============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
			System.out.println();
		}

	}

}
