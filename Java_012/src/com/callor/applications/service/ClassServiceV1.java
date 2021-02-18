package com.callor.applications.service;

public class ClassServiceV1 {

	public void add(int num1, int num2) {
		System.out.print("정수 + 정수 = ");
		System.out.println(num1 + num2);
	}

	public void add(int num1, float fnum1) {
		System.out.print("정수 + 실수 = ");
		System.out.println(num1 + fnum1);
	}

	public void add(double Dnum1, float fnum2) {
		System.out.print("double형 실수 + float형 실수 = ");
		System.out.println(Dnum1 + fnum2);
		System.out.println("=========================================");

		double result1 = Dnum1 + fnum2;
		double result2 = Dnum1 - fnum2;
		double result3 = Dnum1 * fnum2;
		double result4 = fnum2 % Dnum1;

		System.out.println(Dnum1 + " + " + fnum2 + " = " + result1);
		System.out.println(Dnum1 + " - " + fnum2 + " = " + result2);
		System.out.println(Dnum1 + " x " + fnum2 + " = " + result3);
		System.out.println(fnum2 + " % " + Dnum1 + " = " + result4);

	}

}
