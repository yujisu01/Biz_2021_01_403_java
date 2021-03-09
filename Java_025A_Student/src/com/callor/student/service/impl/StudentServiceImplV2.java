package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

// 클래스상속받음
public class StudentServiceImplV2 extends StudentServiceImplV1 {

	/*
	 * StudentServiceImplV1 을 상속받아서 searchStudent() 이 메서드만 다시 정의하여 구현하겠다! 라는 클래스
	 * load메서드는 그냥 그대로 쓸거임.
	 */
	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(Values.dLine(60));
			System.out.println("찾는 학생이름을 입력");
			System.out.println(Values.sLine(60));
			System.out.print("이름입력>>");
			String strName = scan.nextLine();

			if (strName.equals("QUIT")) {
				System.out.println("종료!!!");
				break;
			}
			// boolean을 사용
			boolean bYesSearch = false;
			for (StudentVO sVO : stdList) {
				if(strName.equals(sVO.getStName())) {
					// 찾았다면
					bYesSearch=true;
					//일단 출력하고 break;
					// V1에서 protected로 해야 출력이된다 (private xxx)
					this.printStVO(sVO);
					// 찾았다면 중단
					break;
				}
				// 못찾았다면 
			}if(!bYesSearch) {
				System.out.println(strName + "학생의 자료가 없음");
			}
			
		}

	}

}
