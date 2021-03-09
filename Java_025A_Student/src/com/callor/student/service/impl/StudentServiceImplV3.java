package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

//클래스를 상속받음
public class StudentServiceImplV3 extends StudentServiceImplV1{
// alt shift s로 override해서 얘만 상속받음
	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(Values.dLine(60));
			System.out.println("이름을 입력");
			System.out.println(Values.sLine(60));
			System.out.print("이름>>");
			String strName= scan.nextLine();
			
			//선언만 하고 null값으로 클리어하라.
			StudentVO sVO = null;
			for(StudentVO vo: stdList) {
				if(strName.equals(vo.getStName())) {
					// for이전에 선언된 sVO에
					// 찾은 vo를 담음 (복사)
					// 만약 못찾았으면 .null담겨있음
					sVO = vo;
				}
			}
			if(sVO==null) {
				System.out.println("못찾겠어요");
				//boolean이나 뭐 기타등등 사용하지않고 vo를 사용해서 코드구현..
			}else {
				this.printStVO(sVO);
			}
		}
	}
	
	

}
