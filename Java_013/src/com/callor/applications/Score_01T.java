package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1T;

public class Score_01T {

	public static void main(String[] args) {

		ScoreServiceV1T ssV1 = new ScoreServiceV1T();

		ssV1.intput();
		ssV1.print();
		ssV1.sum();
		ssV1.fAvg();
	}

}
