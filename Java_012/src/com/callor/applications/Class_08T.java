package com.callor.applications;

import com.callor.applications.service.ClassServiceV6T;

public class Class_08T {

	public static void main(String[] args) {
		
		ClassServiceV6T csV6 = new ClassServiceV6T();
		
		int num1 = 88;
		int num2 = 99;
		
		// 각각 메서드에 변수 num1, num2를 전달하고,
		// (=변수 num1과 num2에 담긴 값을 전달하고)

		int add = csV6.add(num1, num2);
		int subs = csV6.substraction(num1, num2);
		
		System.out.printf("%d과 %d의 \n 덧셈 : %d, 뺄셈 : %d ", num1, num2, add, subs);
	}

}
