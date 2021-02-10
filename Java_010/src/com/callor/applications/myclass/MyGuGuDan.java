package com.callor.applications.myclass;

import java.util.Scanner;

/*
 * 메인() method가 없는 클래스 선언
 * 
 * 프로젝트에서 클래스의 역할 : 
 * 프로젝트의 코드가 길어져서 복잡해지는 현상을 방지하고,
 * 코드를 읽기쉽고, 수정하기 쉽도록 분산하는 방식.
 * 
 * main() method에 200줄 정도의 코드가 있다고 할때 
 * 일정한 분량만큼 잘라서 다른 클래스.메서드()에 코드를 옮기고
 * 
 * main() 에서는 클래스를 객체로 생성한다음,
 * 객체.메서드() 방식으로 코드를 실행하여
 * 같은 효과를 내는것.
 * 
 */
public class MyGuGuDan {
	
	/*
	 * = public (누구나 사용할수 있는) gugu()method 선언
	 * 임의로 어떤일을 수행하기 위한 명령문 생성.
	 */
	public void gugu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력 (2 ~ 9) >>");
		
		}
		
	 // gugu() 메서드가 끝나는곳 (gugu() 메서드가 선언된 영역)
	
	// print() method는 변수선언 명령문을 포함하고 있다
	// 누군가가 MyGuGuDan.print() 메서드를 호출하려면
	// 반드시 정수값을 하나 포함시켜줘야한다..
	// MyGuGuDan.print(정수) 이런식으로 호출해야 한다.
	// () 안에 포함되는 값을 arguments라고 한다.
		public void print(int dan) {
		
			
			System.out.println("=====================");
			System.out.println("구구단 " + dan + " 단");
			System.out.println("----------------------");
			
			for(int i = 0 ; i < 8 ; i++) {
				int num1 = i + 2;
				System.out.println(dan + " x " + num1 + " = " + dan*num1);
			
		}
		}
}

