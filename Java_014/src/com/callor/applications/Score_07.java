package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_07 {

	public static void main(String[] args) {
		// 자동으로 데이터까지 만들어서 보여주는 코드
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.makeNamesAndArrayInit();
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.print();

		// 오류 뜨는 예시
		// int num;
		// System.out.println(num);
	}

}
