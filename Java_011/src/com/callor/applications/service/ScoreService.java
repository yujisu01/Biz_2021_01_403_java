package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 methdo() 호출 :
 * ScoreService 클래스에는 메인메서드 main() method가 없어서
 * 여깄는 코드는 직접 Run하여 실행할수 없다.
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고
 * score() method를 호출해주어야만 
 * 코드를 실행할수 있다.
 * (나는 멍청하게 main메서드 넣어버려서 실행이 안됐음)
 * 
 * 다른 언어에서는 모듈(module)등의 이름으로 사용한다.
 * 
 * 가장중요한거: 여기에는 메인메서드가 없다.(봉사하는 클래스) 
 * 
 */

public class ScoreService {
	/*
	 * 클래스와 메서드의 명명법
	 * 클래스 : 첫글자 영문대문자, 이후 영문 대소문자, 숫자
	 * 메서드 : 첫글자 영문소문자, 이후 영문 대소문자, 숫자
	 * 
	 * 클래스 명명법 Upper CamelCase 라고 한다.
	 * 메서드 명명법 Lower CamelCase 라고 한다.
	 * 
	 */

	public void score() {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("국어점수를 입력하라 >>");
		int intKor = scan.nextInt();
		System.out.print("영어점수를 입력하라 >>");
		int intEng = scan.nextInt();
		System.out.print("수학점수를 입력하라 >>");
		int intMath = scan.nextInt();

		System.out.println("============================================");
		System.out.println("국어\t 영어\t 수학 \t 총점 \t 평균");
		System.out.println("--------------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;

		float fAvg = intSum / 3;
		fAvg = intSum / 3.0f;

		System.out.print(intSum + "\t" + fAvg);

	}


}
