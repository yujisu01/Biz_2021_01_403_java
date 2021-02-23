package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_06 {
	// for문 응용클래스 
	// if문을 어디서 검사하느냐, for문밖에서 변수선언하느냐 안하느냐 가 핵심이다.
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		for(int i = 0 ; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1부터 10중에 입력>>");
		
		int keyNum = scan.nextInt();
		
		int pos = 0;
		for(pos = 0 ; pos < intNums.length; pos++) {
			if(intNums[pos] == keyNum) {
				break;
			}
		}
		if(pos < intNums.length) {
			System.out.println(pos + "위치에서 최초발견");
		}else {
			System.out.println("배열에 찾은값이 없음.");
		}
		
	}

}
