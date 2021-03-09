package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.ValuesLine;
import com.callor.student.values.ValuesStudent;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentVO> stuList;

	public StudentServiceImplV1() {
		stuList = new ArrayList<StudentVO>();

	}

	@Override
	public void loadDataFromFile() {
		// TODO Auto-generated method stub
		String fileName = "src/com/callor/student/학생정보리스트.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] stDatas = reader.split(":");

				StudentVO stuVO = new StudentVO(Integer.valueOf(stDatas[ValuesStudent.ST_NUM]),
						stDatas[ValuesStudent.ST_NAME], stDatas[ValuesStudent.ST_MAJOR],
						Integer.valueOf(stDatas[ValuesStudent.ST_GRADE]),
						Integer.valueOf(stDatas[ValuesStudent.ST_CLASS]), stDatas[ValuesStudent.ST_ADD],
						stDatas[ValuesStudent.ST_TEL]);

				stuList.add(stuVO);
			}
			buffer.close();
			fileReader.close();

			// System.out.println(stuList);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("저장완료!");

	}

	@Override
	public String selectMenu() {
		// TODO Auto-generated method stub

		stuList = new ArrayList<StudentVO>();

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println(ValuesLine.dLine(60));
			System.out.println("찾는학생 이름을 입력하세요.(종료하려면 'QUIT'입력)");
			System.out.println(ValuesLine.sLine(60));

			System.out.print("이름 입력>>");
			String strMenu = scan.nextLine();

			// for (int i = 0; i < stuList.size(); i++) {
			// StudentVO vo = stuList.get(i);
			if (strMenu.equals("QUIT")) {
				System.out.println("업무종료!");
				return null;
			}
				for (StudentVO vo : stuList) {
					//if (strMenu.equals(ValuesStudent.ST_NAME)) {
					if(strMenu.equals(vo.getsName())) {
						System.out.println("이름:" + vo.getsName());
						System.out.println("학과:" + vo.getsMajor());
						System.out.println("학년:" + vo.getsGrade());
						System.out.println("클래스:" + vo.getsClass());
						System.out.println("주소:" + vo.getsAdd());
						System.out.println("전화번호:" + vo.getsTel());
					
					}else {
						System.out.println("없다");
					}
				}
			}
		}

	

	@Override
	public void printStudentList() {
		// TODO Auto-generated method stub'
		stuList = new ArrayList<StudentVO>();
		for (StudentVO vo : stuList) {
			System.out.println("이름:" + vo.getsName());
			System.out.println("학과:" + vo.getsMajor());
			System.out.println("학년:" + vo.getsGrade());
			System.out.println("클래스:" + vo.getsClass());
			System.out.println("주소:" + vo.getsAdd());
			System.out.println("전화번호:" + vo.getsTel());
		}
		System.out.println();

	}

}
