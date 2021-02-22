package com.callor.applications;

import java.util.Scanner;

public class Score_03 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생들의 과목점수를 입력하세요");
		for(int i = 0 ; i < strName.length ; i++) {
		
			System.out.println("이름: " + strName[i]);
			System.out.print("국어점수>> ");
			String strKor = scan.nextLine();
			intKor[i] = Integer.valueOf(strKor);
			
			System.out.print("영어점수>> ");
			String strEng = scan.nextLine();
			intEng[i] = Integer.valueOf(strEng);
			
			System.out.print("수학점수>> ");
			String strMath = scan.nextLine();
			intMath[i] = Integer.valueOf(strMath);
		}
	
		System.out.println("=================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
			System.out.println();
		}
	}
}
