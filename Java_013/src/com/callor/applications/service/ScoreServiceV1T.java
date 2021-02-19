package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1T {
	/*
	 * 클래스 영역에 선언된 이 변수들
	 * => 인스턴스 변수이다.
	 * 클래스 영역은 '멤버 영역'이라고도 부른다.
	 * 
	 * ScoreServiceV1 ssv1 
	 * => 클래스를 객체로 선언하고 
	 * 
	 * new SSV1() 
	 * => 객체의 초기화
	 * 
	 * 인스턴스
	 * => 객체가 초기화 되면, 자동으로 사용할 준비가 되는 변수들
	 */
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float fAvg = 0;
	private Scanner scan = new Scanner(System.in);
	/*
	 * input메서드가 호출되면
	 * 키보드를 통해서 국어,영어,수학 점수를 입력받고
	 * intKor, intEng, intMath에 저장됨.
	 */
	public void intput() {
		
		scan = new Scanner(System.in);
		System.out.print("국어 입력> ");
		intKor = scan.nextInt();
		System.out.print("영어 입력> ");
		intEng = scan.nextInt();
		System.out.print("수학 입력> ");
		intMath = scan.nextInt();
	}

	public void sum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
	}

	public void fAvg() {
		fAvg = (float)intSum / 3;
	}
	/*
	 * intKor, intEng, intMath 인스턴스 변수에 저장된 값을 출력..
	 */
	public void print() {
		System.out.println("================================");
		System.out.println("국어 성적>> " + intKor);
		System.out.println("영어 성적>> " + intEng);
		System.out.println("수학 성적>> " + intMath);
		System.out.println("=================================");
		System.out.println("총점: " + intSum);
		// %3.2F : 실수값을 출력하는데 정수부분 3자리, 소수점이하 2자리 출력.
				// 소수점이하 3번째에서 반올림하라.
		System.out.printf("평균: %3.2f\n", fAvg);
	}

}
