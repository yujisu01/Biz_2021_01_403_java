package com.callor.applications;

import com.callor.applications.service.ClassServiceV1T;

public class Class_01T {
	
	public static void main(String[] args) {
		
		/*
		 * == 변수선언문, 생성(초기화) ==
		 * 
		 * 1. 정수형 변수 num1을 선언하고, 정수 30을 할당하라!
		 * 2. 앞으로 num1이라는 변수를 사용하여, 정수값을 저장하고
		 * 			여러가지 기능을 수행할터이니, 변수를 준비해달라...
		 */
		int num1 = 40;
		
		/* (프로젝트에) 선언되어 있는 ClassServiceV1의 method들을 사용하여
		 * 코드를 실행하려고 하니 사용할 준비를 해달라..!!
		 * 
		 * csV1란? : 이것을 "객체(Object)"라고 한다.
		 *  = new ClassServiceV1() 란? 객체를 사용할수 있도록 "초기화" 하기
		 *  
		 *  csV1 = new ClassServiceV1()란 ? 이 명령을 만나면 객체를 초기화하고
		 *  		사용할 준비를 하는상태이다.
		 *  		이 명령이 수행된 후에는 csV1을 인스턴스라고 한다.
		 * 
		 */
		ClassServiceV1T csV1T = new ClassServiceV1T();
		
		ClassServiceV1T csV1T_1;			// 아직 사용할준비가 안된상태이다. 
											// 뒤에 반드시 new ~ 명령어가 따라와줘야함.
		
		csV1T.add(3, 4);
		csV1T.add(3, 3F);
		csV1T.add(3D, 4F );
		
	}

}
