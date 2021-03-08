package com.callor.score.values;

public class Values {
	
	//final로 선언한 애들은 바로 선언해줘야 하는데 안하면 오류가 뜬다.
	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	// 생성자 블록에서 초기화 시켜줘야 한다.
	// 구글에 치면 안나오는 코드이다......^^
	static {
		// %050d 0이라는 문자열을 50개 나열하라,
		// 그리고 0을 "="로 변경하라. 
		//============================================ 
		dLine = String.format("%050d", 0).replace("0", "=");
		sLine = String.format("%050d", 0).replace("0", "-");
	}
	

}
