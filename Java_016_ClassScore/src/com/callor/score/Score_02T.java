package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1T;

public class Score_02T {

	public static void main(String[] args) {

		String[] strName = { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		int intSum[] = new int[strName.length];
		float floatAvg[] = new float[strName.length];

		Random rnd = new Random();

		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		// 스코어서비스를 이용해서 ssV1을 호출하고, new 어쩌구 명령어를 사용해서
		// 인스턴스화 시켰다.!
		ScoreServiceV1T ssV1 = new ScoreServiceV1T();

		// 총점계산
		// ssV1.scoreSum 메서드를 호출해서 총점을 계산해야한다.
		for (int i = 0; i < strName.length; i++) {

			// ssV1.scoreSum 메서드를 호출해서 총점계산.
			// 총점을 계산하려면 3과목의 점수를 전달하고
			// 총점 결과를 다시 return받아서 ..해야한다.
			int sum = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);

			// i번째 학생의 3과목 점수를 scoreSum에 전달하고, 결과를
			// 다시 i번째 학생의 총점에 저장한다.
			intSum[i] = sum;
		}
		for (int i = 0; i < strName.length; i++) {
			float avg = ssV1.scoreAvg(intSum[i]);
			floatAvg[i] = avg;
		}
		// for(int i = 0 ; i < strName.length; i++) {
		ssV1.print1(strName, intKor, intEng, intMath, intSum, floatAvg);

	}
	// 이름, 국어, 영어, 수학, 총점, 평균, 배열을
	// 통째로 매개변수로 전달하고
	// ssV1.print() 메서드에서 리스트를 출력하도록 할것이다.
		

}
