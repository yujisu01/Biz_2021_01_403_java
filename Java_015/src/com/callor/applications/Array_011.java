package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_011 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);

		System.out.println("정수 1~10까지중 숫자입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			// if(intNums[i] == keyNum) {}
			boolean bYes = intNums[i] == keyNum;
			if (bYes) {
				count++;
				System.out.println(intNums[i]);
			}

		}
		System.out.println(keyNum + "의갯수 : " + count);

	}
}
