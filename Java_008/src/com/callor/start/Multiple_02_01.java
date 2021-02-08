package com.callor.start;

public class Multiple_02_01 {
	
	public static void main(String[] args) {
		// ~ 범위의 값을 덧셈 (합산, 누적)용 변수선언
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
		
			int num = i + 7;
			
			boolean bYes = num % 3 == 1; // 나머지가 2인 수들은 출력이 되지않는다.
			if(bYes) {
				intSum += num;
			}
			
			boolean bYes2 = num % 3 == 2; // 논리적,계산적으로 맞는 식이긴 하지만 굉장히 불편한 코드이다. 
			if(bYes2) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌수의 합 : " + intSum); 
		
		intSum = 0;		// intSum 초기화
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 7;
			
			boolean bYes = num % 3 > 0; 	// 이 코드도 맞긴하지만 (!bYes)를 활용하는것이 더 세련된(효율적인) 코드이다.
			if(bYes) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌수의 합 : " + intSum);
		
		intSum = 0;		// intSum 초기화
		for (int i = 0; i < 100; i++) {

			int num = i + 7;
			
			boolean bYes = num % 3 != 0;	// '3의 배수가 아닌가' 라고 묻고있다 ( != )
			if ( bYes ) {					// 아니니까(TRUE) (bYes)라고 출력됨. ( (!bYes)의 변형 )
				intSum += num;
		
			}
		}
		System.out.println("3의 배수가 아닌수의 합 : " + intSum);
	}
}
