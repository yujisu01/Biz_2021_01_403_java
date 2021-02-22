package com.callor.applications;

import java.util.Scanner;

public class Score_011 {
	
	public static void main(String[] args) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		Scanner scan = new Scanner(System.in);
		
		// 학생별로 과목전체 점수 입력받기
		for(int i = 0 ; i < intKor.length; i++) {
			
			int num = i + 1; 
			System.out.println(num + "번 학생의 성적을 입력하세요");
			
			System.out.print("국어 >> ");
			intKor[i] = scan.nextInt();
			System.out.print("영어 >> ");
			intEng[i] = scan.nextInt();
			System.out.print("수학 >> ");
			intMath[i] = scan.nextInt();
			System.out.println("==================================");
			
			
		}
	}

}
