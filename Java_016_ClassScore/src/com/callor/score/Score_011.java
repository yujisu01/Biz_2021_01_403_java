package com.callor.score;

import java.util.Random;

public class Score_011 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strSubj = { "국어", "영어", "수학", "음악", "미술" };
		
		int[][] intScore = new int[strName.length][strSubj.length];
		int[] intSum = new int[strName.length]; 
		
		for(int na = 0; na < strName.length; na++) {
			for(int sb = 0 ; sb < strName.length; sb++) {
				intScore[na][sb] = rnd.nextInt(100) + 1;
			}
		}
		for(int na = 0 ; na <strName.length; na++) {
			for(int sb = 0 ; sb< strName.length; sb++) {
				intSum[na] += intScore[na][sb];
			}
			System.out.println(intSum[na]);
		}
		
	}
}
