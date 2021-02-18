package com.callor.applications;

import com.callor.applications.service.ClassServiceV7;

public class Class_10 {

	public static void main(String[] args) {

		ClassServiceV7 csV7 = new ClassServiceV7();

		System.out.println("구구단 2단 ~ 9단");
		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan);
			csV7.gugu(dan);
		}
	}
}
