package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	// 클래스로 객체 선언 및 초기화
	private Scanner scan = new Scanner(System.in);

	// 정수및 실수형 변수 "선언만" (초기화는 안해줌)
	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;

	private int intSum;
	private float floatAvg;

	public void input() {
		/*
		 * strName = scan.nextLine() 에는 이런식의 코드가 있을것이다.
		 * 
		 * public String nextLine() { 
		 * return 키보드 입력받은 문자열
		 * 
		 * 키보드를 통해서 문자열을 입력받기 위해서는
		 * Scanner.nextLine() 메서드를 실행하고,
		 * return 값을 문자열 변수에 저장한다.
		 */
		System.out.println("학생이름을 입력하세요");
		System.out.print("이름 >> ");
		strName = scan.nextLine();			// nextLine : 한줄의 문자열을 전부다 입력
		
		System.out.println("각 과목의 점수를 입력하세요");
		
		/*
		 * intKor = scan.nextInt(); 에는
		 * 아마 이런식의 코드가 들어있을 것이다.
		 * 
		 * public int nextInt(){
		 * 
		 * return 키보드로 입력한정수;
		 * }
		 */
		System.out.print("국어>> ");
		intKor = scan.nextInt();
		System.out.print("영어>> ");
		intEng = scan.nextInt();
		System.out.print("수학>> ");
		intMath = scan.nextInt();

	}

	public void sum() {

	}

	public void avg() {

	}

	public void print() {
		// %s : 문자열 formatting / %d : 숫자 formatting
		System.out.printf("이름 : %3s\n", strName); 
		
		System.out.printf("국어 : %3d\n", intKor);
		System.out.printf("수학 : %3d\n", intMath);
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("총점 : %3d\n", intSum);
		System.out.printf("평균 : %3.2f\n", floatAvg);

	}

}
