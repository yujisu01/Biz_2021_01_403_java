package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("===========================================");
		System.out.println("성적입력 시스템 V1");
		System.out.println("-------------------------------------------");

		System.out.print("학생이름 입력하세요: ");
		String strName = scan.nextLine();
		scVO.strName = strName;

		while (true) {
			System.out.print("국어점수 입력: ");
			String strKor = scan.nextLine();
			scVO.setIntKor(strKor);

			if (scVO.getIntKor() < 0) {
				System.out.println("국어점수 유효성 검사실패");
				continue;
			}
			break;
		}
		// intKor에 -1 이 담겨있으면 다시 입력을 하도록 해야한다.

		while (true) {
			System.out.print("영어점수 입력: ");
			String strEng = scan.nextLine();
			scVO.setIntKor(strEng);

			if (scVO.getIntEng() < 0) {
				System.out.println("영어점수 유효성 검사실패");
				continue;
			}
			break;

		}
	}
}
