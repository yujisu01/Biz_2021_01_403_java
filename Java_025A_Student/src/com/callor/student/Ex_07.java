package com.callor.student;

import com.callor.student.service.StudentService;

// StudentService라는 인터페이스를 상속받아서 클래스를 작성하려면
// implements 사용
/*
 * 클래스상속: extends
 * 인터페이스상속: implements  (외우셈)
 */
public class Ex_07 implements StudentService {

	@Override
	public void loadStudentFromFile() {
		
	}

	@Override
	public void searchStudent() {
		
	}
	

}
