package com.callor.student;

import java.util.Random;

public class Ex_02 {
	// args는 틀려도상관없는데 String[]까진 맞아야함
	public static void main(String[] args) {
		/*
		 * 랜덤클래스를 사용해서 1 ~ 100까지 범위의 
		 * 임의의 정수를 생성하여
		 * 이 정수가 짝수인지, 홀수인지 판별하자
		 */
		
		//사용하려면 일단 객체를 선언하고, 생성한다
		Random rnd = new Random();
		// 임의의 정수를 생성하여, 1부터 100까지의 임의의 정수를 넣어준다
		int num = rnd.nextInt(100)+1;
		// num값을 2로 나눠서 0으로 나눠떨어지면 짝수이다.
		if(num%2==0) {
			System.out.println(num+"는 짝수다");
		}else {
			System.out.println(num+"는 홀수다");
		}
		
	}

}
