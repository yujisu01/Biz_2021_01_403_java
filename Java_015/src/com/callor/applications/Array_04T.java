package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04T {

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

		/*
		 * 변수는 앞에서 어떤값을 저장했던 상관없이,
		 * 가장 마지막에 저장한 값만 가지고있다.
		 */
		int num = 0;
		num = 100;
		num = 10000;
		System.out.println(num);
		
		int lastPos = 0;
		for (int position = 0; position < intNums.length; position++) {
			if (intNums[position] == keyNum) {
				
				// 키보드로 입력한값이 일치할때마다, 그위치를 lastPos에 저장함.
				lastPos = position;
				
				// 여기오면 lastPos에 저장된값이
				// 가장 마지막으로 lastPos = position 이 실행된 결과만 담고있음.
				System.out.println(keyNum + "번값이 마지막으로 나타난 위치: " + position);
			}

		}
	}

}
