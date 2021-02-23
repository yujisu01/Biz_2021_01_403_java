package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {
// 내가 작성한 코드인데 짱많이틀렸다.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// int[] intNums = new int[100];

		System.out.print("숫자입력> ");
		int scanNum = scan.nextInt();

		for (int i = 2; i < scanNum; i++) {
			for (int j = 2; j < i; j++) {
			
				boolean bYes = i % j == 0;
				if (bYes) {
					//System.out.println(scanNum + "은(는) 소수가 아니다 ");
					break;

				}else {
					//System.out.println(scanNum + "은(는) 소수다");
					break;
				}
			}
		}		
	}
}