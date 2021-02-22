package com.callor.applications;

import java.util.Scanner;

public class Score_01T {
	/*
	 * 학생 3명의 국어, 영어, 수학 점수를 (학생 3명의 과목점수를 저장할 배열을 선언) (=> intKor, intEng, intMath)
	 * 키보드로 입력받아서, 콘솔에 리스트를 출력하기.
	 * 
	 * 1. 학생3명의 세과목의 점수를 저장할 배열을 선언한다. 2. 배열이 나오면 일단 for반복문이 최소한 한번쯤은 나타난다. 3. 학생
	 * 3명의 세과목의 점수를 어떻게 입력받을것인가 4. 학생3명의 과목점수를 어떻게 출력할것인가 => 3, 4번이 핵심포인트임
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할수 있다. => 문제는 학생 3명의 과목점수를 저장해야 하기 때문에 각 과목을 배열로 선언해야
		 * 한다. => 몇개의 배열이 필요한지 명시해야 한다 = new int[개수]
		 */
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		// [] : 필요한 개수만큼 배열을 자유롭게 만들수 있다.
		int[] intSum = new int[3];
		int[] intAvg = new int[100];

		Scanner scan = new Scanner(System.in);

		/*
		 * 학생 3명의 과목 성적입력받기
		 * 
		 * 방법1. 학생3명의 국어과목 점수입력받기 방법2. 학생별로 국어,영어,수학 점수를 각각 입력.
		 */
		// 방법1. 과목별로 학생점수 입력받기 (불편하고 비효율적인 코드이다.)

		// 학생 인원수가 소수일때는 아래처럼 단순히
		// 복사, 붙여넣기로 코드를 작성해도 된다.
		System.out.println("국어점수 입력");
		System.out.print("1번 학생>> ");
		intKor[0] = scan.nextInt();
		System.out.print("2번 학생>> ");
		intKor[1] = scan.nextInt();
		System.out.print("3번 학생>> ");
		intKor[2] = scan.nextInt();

		// for 반복문을 이용하여 반복되는 (복사&붙이기)
		// 코드를 단순하게 만든다.
		System.out.println("영어점수 입력");
		for (int index = 0; index < intEng.length; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intEng[index] = scan.nextInt();
		}
		System.out.println("수학점수 입력");
		for (int index = 0; index < intMath.length; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intMath[index] = scan.nextInt();
		}
		System.out.println("===============================");
		System.out.println("국어\t영어\t수학");
		System.out.println("-------------------------------");
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i] , intEng[i] , intMath[i]);
		}
		System.out.println("===================================");
	}

}
