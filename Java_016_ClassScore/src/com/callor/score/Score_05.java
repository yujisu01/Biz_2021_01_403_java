package com.callor.score;

import com.callor.score.model.ScoreVO;

public class Score_05 {
	
	public static void main(String[] args) {
		
		// 이렇게 선언만 된 변수는 사용이 불가능하다.
		// 숫자일 경우 최소한 '0'이라도 저장해야 한다.
		int num;
		num = 0;
		System.out.println(num);
		// ScoreVO클래스를 사용하여
		// 		ScoreVO 객체(인스턴스)생성
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.println(scoreVO.intKor);
		
		// VO클래스를 사용해서 객체를 생성하면,
		// VO 클래스에 선언된 public 인스턴스 변수들이
		// 자동으로 선언및 생성되어 사용할 준비가 된다.
		scoreVO.strName = "홍길동";
		scoreVO.intKor = 100;
		scoreVO.intEng = 55;
		scoreVO.intMath = 99;
		
		/*
		 * 클래스로 객체를 선언'만' 한 상태에서는,
		 * 아무런 것도 사용할수 없다. 
		 */
		//ScoreVO.scoreVO1;
		//ScoreVO1.intKor = 100;
		
		ScoreVO scoreVO1;
		scoreVO1 = new ScoreVO();
		scoreVO1.intKor = 100;
		
		// ScoreVO클래스를 사용하여 scoreVO2 객체선언.
		// 		객체를 인스턴스로 생성(초기화)
		// java에서는 new ScoreVO() 코드를
		// 		클래스의 "생성자(method)" 호출이라고 부른다.
		
		// ScoreVO클래스를 scoreVO2 객체로 선언하고,
		// 		생성자를 호출하여, 인스턴스로 만들었다 라고 번역해야 한다.
		ScoreVO scoreVO2 = new ScoreVO();
		
	}

}
