package com.callor.student;

import java.util.Scanner;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;
import com.callor.student.values.ValuesStudent;

public class StudentEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		StudentService stuSer = new StudentServiceImplV1();

		stuSer.loadDataFromFile();
		stuSer.selectMenu();
		//stuSer.printStudentList();
			
		
		
	}
}
