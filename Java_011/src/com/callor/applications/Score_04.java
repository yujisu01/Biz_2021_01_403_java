package com.callor.applications;

import com.callor.applications.service.ScoreServiceV3;

public class Score_04 {

	public static void main(String[] args) {
		ScoreServiceV3 scV3 = new ScoreServiceV3();
		
		// ScoreServiceV3 클래스의 2번째 sum() method 호출
		scV3.sum();
		
		// ScoreServiceV3 클래스의 첫번째 sum(int num1, int num2) method 호출
		scV3.sum(20,50); 
		
		float fnum1 = 43.25F;
		float fnum2 = 32.11F;
		// 실수형 변수 fnum1과 fnum2에 담긴값을 
		// sum() method에 전달하면서 호출하라.
		scV3.sum(fnum1, fnum2);
		
		scV3.sum(100D,fnum1); 	// = scV3.sum((double)100, fnum1); 과 같은코드임 
								// 더블형과 float형 두개를 같이 전달하니까 오류가 났다.
		
	}

}
