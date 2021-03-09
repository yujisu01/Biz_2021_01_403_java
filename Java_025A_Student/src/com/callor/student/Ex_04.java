package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {
	
	public static void main(String[] args) {
		// 배열 10개를 선언 StudentVO를 이용해서
		StudentVO[] stdArray = new StudentVO[10];
		// 초기화시키지않아서 오류뜸
		int index = 2;
		
		//방법1 초기화
		stdArray[index] = new StudentVO();
		//방법2 초기화
		for(int i=0; i< stdArray.length; i++) {
			stdArray[i] = new StudentVO();
		}
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		System.out.println("이름:"+stdArray[index].getStName());
		System.out.println("학번:"+stdArray[index].getStNum());
		
		
	}

}
