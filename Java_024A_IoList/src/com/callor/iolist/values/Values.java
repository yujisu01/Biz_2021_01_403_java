package com.callor.iolist.values;

public class Values {
	// 카운트라는 변수를 매개변수로 받았다.
	// 그것을 이용하여 format문자열을 생성함
	
	// => 정수를 매개변수로 받아서 문자열을 return하는 메서드이다
	// 그래서 정수값만큼 문자를 return함 
	public static String dLine(int count) {
		// count가 50이라면, %050d 라는 문자열이 만들어진다.
		String dLineFormat = "%0" + count + "d";
		String dLine = String.format(dLineFormat, 0)
				.replace("0","=");
		
		return dLine;
		// 지금까지는 dLine을 변수로 선언했었따
	}
	public static String sLine(int count) {
		// count가 50이라면, %050d 라는 문자열이 만들어진다.
		String sLineFormat = "%0" + count + "d";
		String sLine = String.format(sLineFormat, 0)
				.replace("0","-");
		
		return sLine;
	}
}
