package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myGu = new MyGuGuDan();
		// 값을 주입한다 (숫자를 안넣으면 오류가뜸) 
		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출 
		 * MyGuGuDan 클래스의 print() method 호출
		 * 
		 * print(int) .... arguments ()
		 * => 
		 * 
		 */
		
		myGu.print(8);
		
		// 랜덤클래스의 nextInt() method 를 호출한다 라고 읽어야 한다.
		Random rnd = new Random();
		rnd.nextInt(10); 	// 호출하면서 정수 10을 주입하라
		rnd.nextInt(); 		// 그냥 호출만 하라
		
		// 스캐너클래스의 nextInt() method를 호출한다
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		
		// 랜덤클래스의 nextInt를 호출
		Random rd = new Random();
		rd.nextInt(100);
		
		
	}

}
