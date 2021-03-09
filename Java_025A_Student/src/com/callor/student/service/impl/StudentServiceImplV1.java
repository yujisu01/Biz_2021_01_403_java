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
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService{

	protected List<StudentVO> stdList;
	
	 public StudentServiceImplV1() {
		stdList =new ArrayList<StudentVO>();
	}
	
	@Override
	public void loadStudentFromFile() {
		String fileName="src/com/callor/student/학생정보리스트.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader==null) {
					break;
				}
				String[] stds = reader.split(":");
				
				StudentVO stdVO = new StudentVO(
						stds[0],
						stds[1],
						stds[2],
						stds[3],
						stds[4],
						stds[5],
						stds[6]);
				stdList.add(stdVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("저장완료!!");
		
	}

	@Override
	public void searchStudent() {
		Scanner scan =new Scanner(System.in);
		
		while(true) {
		System.out.println(Values.dLine(60));
		System.out.println("찾는학생 이름을 입력하세요(종료하려면 QUIT 입력)");
		System.out.println(Values.sLine(60));
		System.out.print("이름입력>>");
		String strName = scan.nextLine();
		
		
		if(strName.equals("QUIT")) {
			System.out.println("종료하기");
			break;
		}
		// 이 변수값을 참조할수 있기때문에 먼저 선언해줬다
		int index =0;
		int nSize = stdList.size();
		
		for(index = 0 ; index< nSize; index++) {
			StudentVO stdVO = stdList.get(index);
			if(strName.equals(stdVO.getStName())) {
				break;
			}
		}//for문이 종료 중단됐을때
		// index와 nSize의 값의 관계를 비교해보면 
		// index < nSize =라면 중단되었다 (break) (학생정보출력)
		// index > nSize 라면 for문이 모두 반복, 자료가 없다
		// 가장 간단한 코드임
		if(index < nSize) {
			this.printStVO(stdList.get(index));
			
		}else {
			System.out.println(strName + "학생의 자료가 없습니다");
		}
		
		}
	}//end search
	protected void printStVO(StudentVO sVO) {
		
		System.out.println(Values.dLine(50));
		System.out.printf("학번: %s\n",sVO.getStNum());
		System.out.printf("이름: %s\n",sVO.getStName());
		System.out.printf("학년: %s\n",sVO.getStGrade());
		System.out.printf("반: %s\n",sVO.getStClass());
		System.out.printf("주소: %s\n",sVO.getStAddr());
		System.out.printf("전화번호: %s\n",sVO.getStTel());
		System.out.println(Values.dLine(50));
	}

}
