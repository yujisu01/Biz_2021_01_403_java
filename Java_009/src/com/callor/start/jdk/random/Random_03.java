package com.callor.start.jdk.random;

import java.util.Random;

public class Random_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intRndNum = rnd.nextInt();
				
		System.out.println(intRndNum);
		
		// 0 ~ (10-1) 중에서 한개의 수를 만들어라
		intRndNum = rnd.nextInt(10);
		System.out.println(intRndNum);
		System.out.println("=====================");
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			System.out.print(num + "\t");
			if(num % 5 == 0) {
				System.out.println();
			}
	}
		System.out.println("=====================");
		for(int i = 0 ; i < 100 ; i++) {
			
			// 0부터 99까지중 임의의 수 1개를 만들어서
			// 변수 num에 저장해달라는 명령문이다.
			// (+1) : 1 ~ 100까지중 임의수 1개를 만들어서 변수 num에 저장해달라.
			int num = rnd.nextInt(100) + 1;
			System.out.print(num + "\t");
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
			
		}
	}
}
