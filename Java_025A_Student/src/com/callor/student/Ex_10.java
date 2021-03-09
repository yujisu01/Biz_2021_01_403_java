package com.callor.student;

public class Ex_10 {
	/*
	 * ===========================
	 * 구구단7단
	 * --------------------------
	 * 7 x 1 = 7
	 * 7 x 2 = 7
	 * 7 x 3 = 7
	 * 7 x 4 = 7
	 * 7 x 5 = 7
	 * 7 x 6 = 7
	 * 7 x 7 = 7
	 * 7 x 8 = 7
	 * 7 x 9 = 7
	 */
	public static void main(String[] args) {
		
		for(int i = 1; i< 10; i++) {
			int intSum = 0;
			intSum = i * 7;
			System.out.println("7x" + i +"=" + intSum);
			
		}
	}
}
