package com.callor.varriable;

public class Var_01 {

	public static void main(String[] args) {
		
		// 변수를 선언하고 초기화 (0 저장, clear)
		int num1 = 0;
		
		// 변수 num1에 정수 30을 저장하라
		// 변수 num1에 정수 30을 할당하라 
		// 변수 num1에 정수 30을 대입하라 (=다 같은이야기)
		num1 = 30;
		
		// 변수를 만들고 값을 저장하는 이유는
		// 이 이후의 코드에서 변수에 담긴 값을
		// 활용하여 연산을 수행하려고 하는 것이다.
		System.out.println("num1 =" + num1);
		
		num1 = 30 + 40;
		
		/*
		 * = (이퀄) 중심으로 오른쪽을 먼저 해석
		 * 변수 num1에 저장되어 있는 값 (70)과 숫자 10을  덧셈하라
		 * 그리고 그 결과(80)를 
		 * num1 변수에 저장하라
		 * 
		 * 원래 num1에 저장된 70은 clear되고
		 * 정수 80이 저장될 것이다
		 * 
		 * 
		 */
		// 		70	+	10
		// 80
		num1 = num1 + 10;
		
		//		80 	+ 	10
		// 90
		num1 = num1 + 10;
		
		// 		90	+	10
		// 100
		num1 = num1 + 10;
		
		num1 = num1 + 20;
		num1 = num1 + 1;
		num1 = num1 + 22;
		
		num1 = num1 - 20;
		num1 = num1 / 2;
		num1 = num1 * 2; // 어떤 수든 2를 곱하면 무조건 짝수가 된다.
		num1 = num1 % 2; // 그래서 결과값은 0이 된다.
		num1 = num1 + (-1);
		num1 = num1 * (-1);
		num1 = num1 * (-1);
		num1 = num1 * (-1);
		num1 = num1 * (-1);
		num1 = num1 * (-1);
		
		
	}
}