package com.callor.student;

public class Ex_01 {
	
	public static void main(String[] args) {
		
		//두개의 정수를 변수에 담고 덧셈하여 출력하고싶다
		int num1 = 0;
		int num2 = 0;
		
		num1 = 50;
		num2 = 100;
		
		// 덧셈결과를 출력하는코드
		int sum = num1 +num2;
		System.out.println(sum);
		
		int num3;
		// 선언할때 초기화하거나, 어떤값을 담아주면 오류가 해결된다
		num3 = 10;
		//오류발생하는 이유: 변수가 초기화가 되지 않았기 때문 
		System.out.println(num3);
		
		//가장좋은방법: 선언할때 그냥 0을저장한다. 
		//이것을 초기화(clear)한다고 함.
		int num4 = 0;
		
	}

}
