package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		ssV1.intput();
		ssV1.print();
		ssV1.sum();
		ssV1.fAvg();
	}

}
