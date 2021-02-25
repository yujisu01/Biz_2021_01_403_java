package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("===========================================");
		System.out.println("성적입력 시스템 V1");
		System.out.println("-------------------------------------------");

			System.out.print("학생이름 입력하세요: ");
			String strName = scan.nextLine();
			scVO.strName = strName;
			
			scVO.setIntKor(ssV1.inputScore("국어") + "");
			// scVO.setIntKor(strKor);	
			scVO.setIntEng(ssV1.inputScore("영어") + "");
			//scVO.intMath = ssV1.inputScore("수학");
			

			
		}

	}

