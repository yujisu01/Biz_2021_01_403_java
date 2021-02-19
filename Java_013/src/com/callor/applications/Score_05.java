package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intKor = new int[20];
		
		/*
		 * 1~100까지 중 랜덤수를 20개 만들어서
		 * intKor 배열에 0번주소부터 19번 주소까지의 위치에 
		 * 한개씩 저장하라 !!
		 */
		for(int index = 0 ; index < 20 ; index++) {
			int num = rnd.nextInt(100) + 1;
			intKor[index] = num;
		}
		
		/*
		 * intKor 배열에 저장된 값들을 
		 * 0번주소에 저장된 값부터 ~ 19번 주소에 저장된 값까지
		 * 순서대로 출력하라 !!
		 */
		for(int index = 0 ; index < 20 ; index++) {
			System.out.println(intKor[index]);
		}
		int kor_1 = 0;
		int kor_100 = 0;
		for(int index = 0 ; index < 20 ; index++) {
			/*
			 * kor_index 라는 코드가 
			 * index 변수값을 가져와서
			 * kor_0 ... kor_100 과 같은 방식으로 
			 * 변환되지는 않는다..
			 * 
			 * java는 kor_index = 1000 이라는 코드를 만나면,
			 * kor_index 라는 변수가 선언되어 있는지 찾고,
			 * 없으면 오류를 발생시킨다.
			 */
			// 이 코드가 kor_0 ~ kor_100 까지 되지 않니?? (안된다.)
			// kor_index = 100;
		}
	}

}
