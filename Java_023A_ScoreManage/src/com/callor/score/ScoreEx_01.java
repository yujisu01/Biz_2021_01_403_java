package com.callor.score;

import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {
	/*
	 * ScoreService를 테스트하는코드
	 */
	public static void main(String[] args) {
		/*
		 * 인터페이스를 통하여
		 * ServiceImpl* 와 클래스를 사용하는 코드들간에
		 * 약속이 만들어진다,
		 * 
		 * 이런환경이 되면, 메소드가 달라서 발생하는
		 * 여러 구조적오류를 최소화 할수 있다. 
		 * 
		 * 만약 ImplV1을 만들던 개발자가 코드를
		 * 미완성 하더라도, implV1클래스를 사용하는
		 * 곳애서는 오류가 발생하지 않고 
		 * 다른 부분 코드를 사용할수 있게된다.
		 */
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		ssV1.inputScroe();
		ssV1.makeScore();
		ssV1.saveScoreToFile();
		ssV1.loadScoreFromFile();
		ssV1.printScore();
	}

}
