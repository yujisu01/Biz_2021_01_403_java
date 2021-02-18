package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3T {
	
	// java에서는 인스턴스 변수를 private으로 제한함.
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	/*
	 * scope()에서는 1개의 숫자를 키보드에서 입력받아
	 * 변수 intNum1에 저장한다.
	 * 하지만 여기에서 선언된 intNum1은 
	 * 클래스영역에 선언된 인스턴스 변수와는 이름만 같을뿐, 
	 * 완전히 다른 변수이다. 
	 * 
	 * 따라서 scope() 메서드가 종료된 이후에는, 
	 * 변수값에 접근할수 없다.
	 * 
	 * scope() 메서드에서 선언된 intNum1 변수는 '지역변수'이다.
	 * 
	 */
	public void scope() {
		System.out.println("숫자를 입력하세요");
		int intNum1 = scan.nextInt();
	}
	public void input() {
		
		System.out.print("첫번째 숫자 입력>> ");
		intNum1 = scan.nextInt();
		// 메소드 선언명령문에 void 키워드가 있으면
		// 이 위치에 return 명령문이 있는것과 같다.
		System.out.print("두번째 숫자 입력>> ");
		intNum2 = scan.nextInt();
		
		return; 
		
	}
	public void algebra() {
		
		System.out.print(intNum1);
		System.out.print(" + ");
		
		//if(3 > 3) {
		//	return; 
		//}
		
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intNum1 + intNum2);
		/*
		 * print formatting(포맷팅=모양을 만든다) 명령문
		 * "" (따옴표) 안에 문자열을 작성하여 출력문을 만드는 명령문
		 * %d(Decimal=십진수라는뜻) 위치에 정수값을 대신 부착하여 출력문 생성.
		 */
		
		System.out.printf(" %d x %d = %d \n" , intNum1, intNum2, intNum1 * intNum2);
		System.out.printf(" %d - %d = %d \n" , intNum1, intNum2, intNum1 - intNum2);
		System.out.printf(" %d + %d = %d \n" , intNum1, intNum2, intNum1 + intNum2);
		System.out.printf(" %d / %d = %d \n" , intNum1, intNum2, intNum1 / intNum2);
	}

}
