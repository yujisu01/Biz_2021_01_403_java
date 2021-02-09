package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	
	public static void main(String[] args) {
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력 >>");
		int Num1 = scan.nextInt();
		
		boolean bYes = Num1 % 2 == 0;
		if(bYes) {
			System.out.print(Num1 + "은(는) 짝수이다");
		}
		else {
			System.out.print(Num1 + "은(는) 홀수이다");
		}
	}

}
