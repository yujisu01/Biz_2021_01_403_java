package com.callor.applications;

import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {
		/*
		 * 문자열 배열 strSub를 선언하고
		 * 문자열 "국어", "영어", "수학"을 저장(할당)하면서,
		 * 배열 개수를 자동으로 생성하라 !!
		 */
		String[] strSub = new String[] {"국어", "영어", "수학"};
		/*
		 * 배열에 저장될 데이터(값들)이 이미 정해져 있는경우이다.
		 */
		int[] intNum = new int[] {2,3,4,5,3,34,91,4,5,31,6,34,15,77};
		
		int sum = 0;
		for(int i = 0 ; i < intNum.length ; i++) {
			sum += intNum[i];
			
		}
		System.out.println("전체 배열의 개수 : " + intNum.length);
		System.out.println("합계 : " + sum);
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < strSub.length ; i++) {
			System.out.print(strSub[i] + "점수 >> ");
			
			int score = scan.nextInt();
			System.out.println("입력한 점수 : " + score);
		}
		
	}

}
