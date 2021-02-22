package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		 String[] strSub = new String[] { "국어", "영어", "수학" };
		Scanner scan = new Scanner(System.in);

		System.out.println("학생들의 과목 점수를 입력하세요");

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d번학생 ", i + 1);
			System.out.print(strSub[0] + "점수 >> ");
			intKor[i] = scan.nextInt();
			System.out.printf("%d번학생 ", i + 1);
			System.out.print(strSub[1] + "점수 >> ");
			intEng[i] = scan.nextInt();
			System.out.printf("%d번학생 ", i + 1);
			System.out.print(strSub[2] + "점수 >> ");
			intMath[i] = scan.nextInt();
		}

		System.out.println("================================");
		System.out.println("학번" + "\t" + strSub[0] + "\t" + strSub[1] + "\t" + strSub[2]);
		System.out.println("--------------------------------");

		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "\t");
			System.out.println(intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}

	}

}
