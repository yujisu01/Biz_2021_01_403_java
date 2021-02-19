package com.callor.applications;

public class Score_03 {
	
	public static void main(String[] args) {
		
		// 5명 학생의 이름을 저장할 변수
		String strName1 = "홍길동";
		String strName2 = "이몽룡";
		String strName3 = "성춘향";
		String strName4 = "장녹수";
		String strName5 = "임꺽정";
		
		// 5명 학생의 국어점수를 저장할 변수
		int kor_1 = 90;
		int kor_2 = 88;
		int kor_3 = 65;
		int kor_4 = 92;
		int kor_5 = 78;
		// 5명 학생의 영어점수를 저장할 변수
		int eng_1 = 78;
		int eng_2 = 92;
		int eng_3 = 56;
		int eng_4 = 88;
		int eng_5 = 73;
		
		System.out.printf("%s\t%d\t%d\n", strName1,kor_1,eng_1);
		System.out.printf("%s\t%d\t%d\n", strName2,kor_2,eng_2);
		System.out.printf("%s\t%d\t%d\n", strName3,kor_3,eng_3);
		System.out.printf("%s\t%d\t%d\n", strName4,kor_4,eng_4);
		System.out.printf("%s\t%d\t%d\n", strName5,kor_5,eng_5);
		
	}

}
