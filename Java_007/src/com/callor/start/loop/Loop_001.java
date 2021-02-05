package com.callor.start.loop;

public class Loop_001 {
	public static void main(String[] args) {
		
		int intDan = 100;
		int num1 = 100;
		
		for(num1 = 0 ; num1 < 1000 ; num1 += 100) {
			
			System.out.println(intDan + num1 );
		}
		System.out.println("====================");
		for(int num = 1 ; num <= 10 ; num += 1) {
			
			System.out.println(num + ".홍길동");
		}
		System.out.println("===================");
		for(int num = 100 ; num <= 1000 ; num+= 100) {
			 
			System.out.println(num);
			
		}
		System.out.println("-----------------------");
		for(int i = 1 ; i <= 38 ; i++) {
			System.out.println(i + ".유지수");
		}
		System.out.println("=========================");
		for(int i = 0 ; i < 1 ; i++) {
			System.out.println(i);
		}
			
	}
}