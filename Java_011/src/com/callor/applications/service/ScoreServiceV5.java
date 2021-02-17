package com.callor.applications.service;

public class ScoreServiceV5 {
	
	public void print(int intKor, int intEng, int intMath) {
		//int intSum = intKor + intEng + intMath;
		//System.out.println("총점:" + intSum);
		
		//float fAvg = intSum / 3F;
		//System.out.println("평균:" + fAvg);
		
		System.out.println("==================================================");
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("--------------------------------------------------");
		//System.out.print(intKor + "\t" + intEng +"\t"+ intMath);
		// System.out.print(intKor + intEng + intMath + intSum + fAvg);
		int intSum = intKor + intEng + intMath;
		float fAvg = intSum / 3F;
		
		//System.out.print("\t" + intSum + "\t");
		//System.out.print(fAvg);
		
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.println(fAvg + "\t");
		
		System.out.println("=================================================");
	}
	
		
	
}


