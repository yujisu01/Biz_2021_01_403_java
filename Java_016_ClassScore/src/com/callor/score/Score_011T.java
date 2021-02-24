package com.callor.score;

import java.util.Random;

public class Score_011T {

	public static void main(String[] args) {

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strSubj = { "국어", "영어", "수학", "음악", "미술" };

		/*
		 * 현재 보여주고 있는 코드는 자바에서 그렇게 많이 쓰이지는 않는것이다. 
		 * (알고리즘에서 많이 쓰인다.)
		 * 2차원 배열 
		 * 
		 * 1차원배열: 배열을 단순히 나열식으로 만드는것.
		 * 		(지금까지 우리가 썼던것들) 
		 * 		연속된 위치에 데이터를 저장하는것. 
		 * 2차원배열: 배열을 테이블(표) 형식으로 만들어서 가로세로 위치에 데이터를
		 * 		저장하는것
		 *
		 */
		
	/*
	 * 학생수만큼 세로방향으로 리스트를 만들고
	 * 각 리스트는 과목수만큼 배열을 가진다.
	 * 
	 * int[][] intScore = int[5][4];   => 이런식과 똑같다.
	 * 배열에 저장된 데이터의 저장용량 : 5 * 4= 20 만큼 저장된다.
	 */
	
		int[][] intScore
		= new int[strName.length][strSubj.length];
		
		Random rnd = new Random();
		// name만큼 반복
		for(int na = 0 ; na < strName.length; na++) {
			// sub만큼 반복
			for(int sb = 0; sb < strSubj.length; sb++ ) {
				intScore[na][sb] = rnd.nextInt(100) + 1;
				
			}
		}
		// 총점구하기 전에 변수선언해주기.
		int intSum[] = new int[strName.length];
		// 총점구하기
		for(int na = 0 ; na < strName.length; na++) {
			
			intSum[na] = 0;
			for(int sb = 0 ; sb < strSubj.length; sb++ ) {
				intSum[na] += intScore[na][sb];
			}
			// System.out.println(intSum[na]);
			
		}
		
	}

}
