package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02T {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		System.out.println("정수 1 ~10까지중 숫자입력하시오");
		System.out.print("숫자입력>> ");
		int keyNum = scan.nextInt();

	
		for (int position = 0; position < intNums.length; position++) {
			if (intNums[position] == keyNum) {
				System.out.println(keyNum + "값 저장위치: " + position);
			}

		}
	}

}
