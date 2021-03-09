package com.callor.student;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;

public class Ex_09 {
	
	public static void main(String[] args) {
		//배열 초기화
		//List<StudentVO> stdList = null;
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		for(int i = 0; i < 10; i++) {
			
			// 얘를 먼저초기화해줘야 16번째줄이 오류가안남
			//StudentVO stdVO = null; 	//이놈생략하면 오류
			StudentVO stdVO = new StudentVO();
			stdVO.setStName("홍길동");
			//여기까지 실행하면 nullpointer익셉션 오류뜸
			stdVO.setStNum("0001");
			stdList.add(stdVO);
			System.out.println(stdVO.getStName());
		}
		//이코드가 오류가 안나도록 수정하기
		
	}

}
