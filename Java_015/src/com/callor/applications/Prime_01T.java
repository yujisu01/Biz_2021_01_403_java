package com.callor.applications;

import java.util.Scanner;

public class Prime_01T {
	// 소수 구하는 클래스 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2이상의 정수 숫자입력");
		System.out.print(" >> ");
		int keyNum = scan.nextInt();
		
		boolean bYes = 4 % 2 == 0;
		
		for(int i = 2; i < keyNum; i++) {
			bYes = keyNum % i == 0;
			if(bYes) {
				System.out.println("소수가아니다");
				break;
			}
		}
		int pos = 0;
		for(pos = 2; pos < keyNum; pos++) {
			
			if(keyNum % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println(pos);
		// for반복문이 중간에 break되면, 
		// 항상 pos는 keyNum 보다 작다. 
		
		if(pos < keyNum) {
			System.out.println(keyNum + "는 소수가아니다");
			
		// for반복문이 break없이 모두 완료되었으면,
		} else {
			System.out.println(keyNum + "는 소수이다");
		}
	}

}
