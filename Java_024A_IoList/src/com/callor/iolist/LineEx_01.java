package com.callor.iolist;

import com.callor.iolist.values.Values;

public class LineEx_01 {
	
	public static void main(String[] args) {
		// 그 매개변수에 따라서 문자열을 리턴해주는 메서드이다.
		System.out.println(Values.dLine(50));
		System.out.println(Values.dLine(20));
		System.out.println(Values.dLine(100));
		System.out.println(Values.sLine(100));
		System.out.println(Values.sLine(1));
	}

}
