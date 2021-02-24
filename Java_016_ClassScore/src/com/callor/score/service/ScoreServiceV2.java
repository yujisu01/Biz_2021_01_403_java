package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {
	
	public int scoreSum(int kor, int eng, int math, int music, int art, int histo) {
		int sum = kor;
		sum += eng;
		sum += math;
		sum += music;
		
		return kor + eng + math + music;
	}
	
	public int scoreSum(ScoreVO scoreVO) {
		
		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.intHistory;
		return sum;
		
	}

}
