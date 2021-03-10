package com.callor.score;

import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		
		ssV1.inputScore();
		ssV1.saveScoreToFile();
		ssV1.loadScoreFromFile();
		ssV1.totalAndAvg();
		ssV1.printScore();
	}

}
