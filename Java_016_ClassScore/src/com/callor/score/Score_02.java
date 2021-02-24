package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		Random rnd = new Random();
		String[] strName = { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		ssV1.scorePrint();

		for (int i = 0; i < strName.length; i++) {
			int num = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
			//int fnum = ssV1.scoreAvg(intKor[i], intEng[i], intMath[i]);

			System.out.printf("%s\t%d\t%d\t%d\t%d\n", strName[i],
					intKor[i], intEng[i], intMath[i], num);

		}

		for(int i = 0 ; i < strName.length; i++) {
		
		//System.out.println(num1);
	}
}
}