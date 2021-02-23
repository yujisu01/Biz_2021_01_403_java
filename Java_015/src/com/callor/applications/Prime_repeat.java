package com.callor.applications;

import java.util.Scanner;

public class Prime_repeat {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수숫자입력>> ");
		int keyNum = scan.nextInt();
		
		int i = 0;
		for(i = 2; i < keyNum ; i++) {
			if(keyNum % i == 0) {
				break;
			}
		}
		if(i < keyNum) {
			System.out.println(keyNum + "는 소수가아님");
		}else {
			System.out.println(keyNum + "는 소수임");
			
		}
	}

}
