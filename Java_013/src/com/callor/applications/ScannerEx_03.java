package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		System.out.println("과목을 입력하세요");
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		
		System.out.println("=========================================");
		System.out.println("이름\t국어\t영어\t총점");
		System.out.println("-----------------------------------------");
		
		System.out.print(strName + "\t");
		System.out.print(strKor + "\t");
		System.out.print(strEng + "\t");
		/*
		 * nextInt()와 nextLine()을 번갈아 사용하는 코드에서
		 * 문제를 일으키는, 해결할수 없는 부분이 있어서
		 * 문제를 극복하기 위한 방법으로 
		 * nextInt()를 사용하지 않고
		 * nextLine()만 사용하여 키보드 입력을 받는다..
		 * 과목점수를 nextLine() 메서드를 사용하여 입력받았다..
		 * 
		 * 과목의 점수를 nextLine() 을 사용하여 입력받았더니
		 * 합계가 이상하다.
		 * 숫자덧셈이 아닌 문자열 연결결과로 출력이 되고있다.. 
		 * (오류 해결했더니, 또다른 문제에 봉착)
		 * 
		 */
		String strSum = strKor;
		strSum += strEng;
		System.out.print(strSum + "\n");
		
	}

}
