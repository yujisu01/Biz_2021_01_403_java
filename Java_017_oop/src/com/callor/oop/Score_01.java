package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 이름입력: ");
		scVO.strName = scan.nextLine();
		while (true) {
			try {
				System.out.print("국어점수 입력: ");
				scVO.intKor = scan.nextInt();

				System.out.print("영어점수 입력: ");
				scVO.intEng = scan.nextInt();

				System.out.print("수학점수 입력: ");
				scVO.intMath = scan.nextInt();
				
				boolean bYes1 = scVO.intKor > 100;
				boolean bYes2 = scVO.intKor < 51;
			
				if (bYes1 || bYes2) {
					System.out.println("50 ~ 100점 까지만 입력하세요");
					continue;
				
				} else {
					System.out.println("입력한 점수: " + scVO.intKor);
					break;
				}
			} catch (Exception e) {
				System.out.println("반드시 숫자로 입력하세요");
				break;
			}

		}
	}
	}
