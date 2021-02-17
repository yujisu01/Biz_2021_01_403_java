package com.callor.applications.service;

public class ScoreServiceV3 {
	// 매개변수에 정수형 변수 2개를 전달받고
	// 호출할수 있는 메서드
	public void sum(int num1, int num2) {
		System.out.println("정수 숫자 2개");
		System.out.println(num1 + num2);
		
	}
	// 매개변수가 하나도 없이 호출할수 있는 메서드
	public void sum() {
		System.out.println("매개변수 없음");
	}
	// float형 매개변수 2개를 전달하면서
	// 호출할수 있는 메서드 
	// sum() 메서드에는 실수값1과 실수값2를 전달받는 
	// 2개의 매개변수가 있다
	public void sum(float f1, float f2) {
		System.out.println("실수 숫자 2개");
		System.out.println(f1 + f2);
		
	}
	// 매개변수 2개를 전달하면서
	// 호출할수 있는 메서드
	// 다만 이 두개의 매개변수는 
	// double형과 float형 순서대로 전달되야 한다.
	// 예를들어 'sum(100F, 100D)' 이런식으로 순서를 바꿔 입력하면 호출불가능.
	public void sum(double d, float fnum1) {
		
	}

}
