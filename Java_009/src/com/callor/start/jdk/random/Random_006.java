package com.callor.start.jdk.random;

/*
 *  Copy & Understand, Paste
 *  복사 붙이기 (ctrl+c, ctrl+v)
 */
import java.util.Random;

public class Random_006 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = rnd.nextInt(100) + 1;
			
			if(num > 34) {
				System.out.println((i+1) + "번째에서 나타남");
				break;
				// 절대 실행되지 않음.
			}
			
		}
		
		int intEnd = 100;
		int count = 0;
		for(count = 0 ; count < intEnd ; count++) {
			
			int num = rnd.nextInt(100) + 1;
			if(num > 50) {
			
				break;
			}
		}
		System.out.println(count);
		// count 변수값을 읽을수 있다.
		// 만약 for() 반복문이 중단되지 않고
		// 모두 정상적으로 수행되고 나면
		// count와 intEnd는 count == intEnd 가 된다.
		
		// if(intEnd <= count) {
			// for()문이 정상 종료되었다.
			
		
		if(intEnd > count) {
			// for()문이 어떤이유로 중간에 break되었다.
			System.out.println("for 중단");
			System.out.println( (count+1) + "번째에서 값 발견");
		}
		else {
			System.out.println("for 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
			
		}
		
	}
		
}


