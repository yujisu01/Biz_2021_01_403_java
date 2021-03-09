package com.callor.student;

public class Ex_05 {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 200;
		// 1. Call이라는 클래스는 없다. 그래서 오류뜸
		// 빨간줄 마우스 올리면 Create Call
		// 2. Call클래스 생성후 add메서드가 없어서 오류가 발생함
		// 3. 매개변수 설정이 없어서 오류가 발생함
		// 4. return 타입이 void여서 발생하는 오류(int로 바꿈)
		// 5. 메서드의 return명령문이 없어서 발생하는 오류
		//		return num1 + num2 해줘서 오류 해결함.
		Call call = new Call();
		
		int sum = call.add(num1, num2);
		System.out.println(sum);
	}

}
