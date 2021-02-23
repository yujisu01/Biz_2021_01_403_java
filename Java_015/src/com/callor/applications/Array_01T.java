package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01T {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 키보드 입력을 받기위해 스캐너 클래스를 scan객체로 선언.
		// 스캔 객체를 인스턴스화 하여 사용할 준비를 한다.
		Scanner scan = new Scanner(System.in);
		
		// rnd인스턴스의 nextInt() 메서드를 호출(실행)하라.
		// 매개변수값으로 100을 전달하라.
		
		// Random클래스의 nextInt() 메서드에
		// 정수 100을 전달하고, 실행하여
		// 리턴하는 결과를 num변수에 저장하라.
		// num 변수에는 0 ~ 99까지중 1개의 숫자가 저장될 것이다..
		int num = rnd.nextInt(100);
		
		// num 변수에는 1 ~100까지중 1개의 숫자가 저장될것이다.
		num = rnd.nextInt(100) + 1;
		
		// 정수 100개를 저장할 배열변수를 선언하고 생성(초기화) 하라.
		int[] intNums = new int[100];
		
		// 0부터 (intNums.length -1) 횟수만큼
		// 반복문을 실행하겠다..
		for(int i = 0 ; i < intNums.length ; i++) {
			// intNums의 i번째 위치에 정수 100을 저장하라..
			// i값은 0 ~ (intNums.length -1) 까지의 값을
			// 갖게 되므로, 전체배열 100개에 
			// 정수 100을 저장하게 된다.
			intNums[i] = 100;
			
		}
		/*
		 * 정수 0부터 intNums.length 까지의 정수를 만들어서,
		 * intNums의 위치값으로 정하고,
		 * 1부터 10까지의 임의의 숫자를 생성하여,
		 * intNums의 배열에 채워넣어라. .. 
		 */
		for(int i = 0 ; i < intNums.length; i++) {
			
			// 랜덤클래스의 nextInt메서드를 호출하면서, 정수 10을 전달하고,
			// 리턴된 결과에 1을 더하라..
			// 1부터 10까지중 임의수 숫자 한개를 생성해라
			// 임의로 생성된 숫자를 intNums의 i 번째 위치에 저장하라.
			intNums[i] = rnd.nextInt(10) + 1;
		}
		System.out.println("정수 1~10까지중 숫자입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		/* intNums에는 어떤값이 저장되어 있는지 모른다.
		 * 단 1 ~ 10까지의 숫자들이 들어있을 것이다.
		 * 
		 * intNums 배열에 저장된 숫자들중에서
		 * 키보드로 입력받은 값(keyNum에 저장되어있다) 과
		 * 같은 값들이 몇개 저장되어 있는지 알고싶다..!! (이게문제의핵심)
		 */
		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			// if(intNums[i] == keyNum) {}
			boolean bYes = intNums[i] == keyNum;
			if (bYes) {
				count++;
				System.out.println(intNums[i]);
			}
		
		}
		
	}

}
