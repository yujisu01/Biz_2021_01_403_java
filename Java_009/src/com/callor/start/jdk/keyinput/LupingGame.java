package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

/*
 * 배경설명 : 숫자 맞추는게임!
 * 
 * 1. Random 클래스를 사용하여 1 ~ 100 까지의 임의 수를
 * 생성하여 rndNum변수에 담아놓는다
 * 
 * 2. Console에 "숫자입력 >>" 프롬프트를 보여주고
 * 3. 1 ~ 100 까지의 정수를 입력받는다.
 * 4. 입력받은 정수와 rndNum변수에 저장된값을 비교하여
 * 5. 큰가, 작은가를 알려주고
 * 6. rndNum에 저장된 값을 맞추는게임
 * 
 * 7. 2부터 5까지를 계속 반복하면서 값을 맞춘다.
 * 8. 만약 정수값에 '-1'을 입력하면 게임을 중단한다.
 *  
 */

public class LupingGame {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rndNum = rnd.nextInt(100) + 1;  // 난수 1개생성
		
		while(true) {
			
			System.out.println("1부터 100까지의 숫자를 맞추세요 >> ");
			System.out.println(( "('-1' 를 입력하면 나가기)" ));
			int keyNum = scan.nextInt();    // 사용자가 입력한수 scan으로 가져옴
			
			if(keyNum < 0) {
				System.out.println("You Lose...");
				break;
			}
			if(keyNum == rndNum) {
				System.out.println("You Win!!!");
				break;
			} else if(keyNum > rndNum) {
				System.out.println("그것보다 더 낮은수이다..");
				
			}else if(keyNum < rndNum) {
				System.out.println("그것보다 더 높은수이다..");
			}
			
		}// while end
		System.out.println("GAME OVER");
		
		
		
	}

}
