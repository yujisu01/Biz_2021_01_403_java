package com.callor.student;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService stSer = new StudentServiceImplV1();
		
		stSer.loadStudentFromFile();
		stSer.searchStudent();
		
	}

}
