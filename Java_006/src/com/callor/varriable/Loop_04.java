package com.callor.varriable;

public class Loop_04 {
	
	public static void main(String[] args) {
		
		int intDan = 3;
		int num1 = 1;
		
		System.out.println("========================");
		System.out.println("구구단");
		System.out.println("------------------------");
		
		for(num1 = 1 ; num1 < 10 ; ) {
			
			System.out.print(intDan);
			System.out.print(" x ");
			System.out.print(num1);
			System.out.print(" = ");
			System.out.println(intDan * num1);  //'반복문으로 코드를 묶는다' 라고 표현함.
			num1 += 1;
		}
		
		for(num1 =1 ; num1 < 5 ;) {
			System.out.println(num1);
			num1 +=1;
		}
		System.out.println("===================");
		/*
		 * for() 명령문이 실행되는 순서
		 * 최초에 한번 (1) 실행해서 num1을 1로 세팅
		 * (2) 실행해서 num < 10 물어보기
		 * 결과가 '예'이면
		 * (3)~(7) 순서대로 실행함
		 * (8) 실행해서 num1을 1 증가
		 * 
		 * 다시 (2)를 실행해서 num1 < 10 물어보기
		 * 
		 * 이렇게 반복
		 * num1 < 10 이 '아니오'가 될때까지 실행.
		 */
		//    (1)		  (2)	     (8)
		for(num1 = 1 ; num1 < 10; num1 +=1 ) {
			System.out.print(intDan); // (3)
			System.out.print(" x ");  // (4)
			System.out.print(num1);   // (5)
			System.out.print(" = ");  // (6)
			System.out.println(intDan * num1); // (7)
			
		}
	}

}
