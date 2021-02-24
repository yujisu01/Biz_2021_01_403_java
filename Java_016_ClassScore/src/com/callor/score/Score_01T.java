package com.callor.score;

import java.util.Random;

public class Score_01T {

	public static void main(String[] args) {

		// String변수선언법은 이렇게 두가지 모두다사용이 가능하다.
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strAddr = { "서울시", "익산시", "남원시", "한양시", "함흥시" };

		// int arrLen = strName.length
		// arrLen 이라는 정수형변수에, strName.length 값을 담아서 사용하는 방법도 있다.
		// int[] intKor = new int[arrLen] => 예를들어 이렇게 사용할수도 있다.
		
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] fAvg = new float[strName.length];

		Random rnd = new Random();

		// 점수생성
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		// 총점생성
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

		}
		// 평균생성
		// for문을 구분해주어서 계산해라 일단 
		for (int i = 0; i < strName.length; i++) {
			fAvg[i] = (float) intSum[i] / 3;
		}
		System.out.println("==========================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n", 
					strName[i], strAddr[i],
					intKor[i], intEng[i], intMath[i],
					intSum[i], fAvg[i]);
		
		}
		System.out.println("===========================================================");
	}
}