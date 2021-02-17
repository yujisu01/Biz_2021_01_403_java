package com.callor.applications;

import com.callor.applications.service.ScoreService;

public class Score_02 {
	
	public static void main(String[] args) {  // 여기에서는 작동을 시키기위해 메인메서드를 넣어야 한다.
		
		ScoreService scService  = new ScoreService(); 	// 클래스 첫글자는 대문자. 
		scService.score();								// 메서드 첫글자는 소문자. (카멜케이스)
		
	}

}
