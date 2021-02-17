package com.callor.applications;

import java.util.Scanner;

public class Score_001 {
	
	public static void main(String[] args) {
		// 선생님이 만드신거
		
		Scanner scan = new Scanner(System.in);
		
		
		// Prompt(프롬프트):
		// 스캐너의 nextInt()를 사용하여, 키보드 입력을 받는 코드가 실행되면
		// 화면에 아무것도 없이 멈춘것처럼 보이는 현상이 있는데
		// 미리 어떤 일을 할것인지 알려주는 메시지
		// 즉 scan.nextInt()전에 출력을 해주어야한다.
		System.out.print("국어점수를 입력하라 >>");
		
		//Blocking(블록킹). (=Code Blocking 되었다) :
		// scan.nextInt() 메서드를 호출하면
		// 코드 동작이 멈추고, 사용자가 키보드로
		// 무엇인가 입력한 후 Enter를 누를때까지
		// 이후 코드가 실행되지 않는다.
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
		
		// fAvg 변수는 실수형이지만
		// intSum은 정수형, 3도 정수형이기 때문에
		// fAvg 변수에 저장되는 값은 소수점 이하가 무조건 0으로 세팅된다.
		float fAvg = intSum / 3;
		
		// 결과값을 실수형(float, double)으로 하고자 할때는
		// intSum변수 값이나, 숫자 3을 실수형으로 만들어줘야 한다.
		//
		// 방법
		// 1. intSum을 실수형으로 변경하고 계산하기
		// 정수형 intSum에 담긴 값을 
		// float형으로 강제 형 변환하여 나눗셈 준비
		fAvg = (float)intSum / 3;  // or (double)intSum / 3 이것도 가능함.
		// 2. 숫자 3을 실수형으로 만들어서 나눠주기
		// intSum을 실수 3.0f로 나눗셈을 지시하면, 
		// intSum 변수에 담긴 값은 자동으로 실수형으로 변환된다. (= 자동형변환)
		fAvg = intSum / 3.0f;
		// 3. 숫자 3을 실수형으로 만들어서 나눠주기
		// fAvg = intSum / 3.0d // double형으로 만들어주기도 가능함.
		fAvg = intSum / (float)3; // 거의 쓰지않는 코드이다. (가능은 함)
		
		System.out.print(intSum + "\t" + fAvg);
		
	}

}
