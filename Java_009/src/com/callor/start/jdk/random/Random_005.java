package com.callor.start.jdk.random;
/*
 * for(int i = 0 ; i < 100 ; i++)
 * Random 클래스를 이용해서
 * 
 * 1 ~ 100까지의 범위에서 임의의 숫자 100을 만들고
 * 100개 숫자 중 짝수가 있으면 짝수들의 합을 계산하라 라는 과제
 *  
 */
import java.util.Random;

public class Random_005 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 == 0;
			
			if(bYes) {
				// num가 짝수이면 실행되는 부분
				// num 값을 다른 변수 (sum)에 누적해야 한다
				intSum += num;
				System.out.println(num);
			}
		}
		System.out.println("짝수의 합 : "+ intSum);
	}

}
