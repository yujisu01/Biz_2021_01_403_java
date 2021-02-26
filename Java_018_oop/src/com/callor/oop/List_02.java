package com.callor.oop;

import java.util.ArrayList;

/*
 * List클래스란?
 * 배열의 단점을 보완하기 위해 java의 JDK에 포함되어 있는
 * 데이터리스트를 관리하기 위한 클래스 
 * 
 * 1.데이터(값)들을 다량으로 저장하는 용도의 객체를 생성한다.
 * 2. 배열을 선언하여 값을 저장하는 것과 비슷한 용도..
 * 3. 처음 생성할때 몇개의 데이터를 저장할지 결정하지 않고
 * 		필요에 따라서 데이터를 추가, 수정, 삭제 할수 있다.
 * 4. 배열은 처음 생성한 갯수를 변경하면, 저장되어 있던
 * 		데이터를 사용할수 없게된다.
 * 5. add() 메서드를 사용하여 데이터를 추가하고
 * 6. get(위치) 메서드를 사용하여 저장된 데이터를 읽을수 있다.
 * 		- 다른 변수에 저장하거나 출력할수 있다.
 */
public class List_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 배열은 처음 생성할때 지정한 type 외에는
		 * 다른 어떠한 type도 저장할수 없다.
		 * 
		 *  이미 선언된 배열을 다른 타입으로 
		 *  다시 선언할수도 없다..
		 */
		int[] nums = new int[10];
		nums[0] = 30;
		
		//nums[1] = "30";
		//nums[2] = "대한민국";
		//nums[3] = 3.0f;
		//nums = new float[10];
		//nums = new float[10];
		
		
		// 공통 타입의 List 객체생성
		// List1 객체에 여러타입의 데이터를 추가하여 
		// 관리하겠다 라는 의미이다. 
		ArrayList list1 = new ArrayList();
		list1.add(3);	// 정수
		list1.add("대한민국");	// 문자열
		list1.add(3.2f); 	// 실수형
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		// 권장하는 ArrayList 객체 생성하기
		// strList형 객체에는 String type의 데이터들만 추가할수 있다.
		// <String> : Generic type
		// 		strList1은 ArrayList 객체이지만
		// 		여기에는 문자열만 저장하도록 하겠다! 라는 의미다. 
		// (메모리관리 면에서 비효율적이기 때문에
		// 일반적으로 타입을 지정해준다.)
		
		// Generic 타입은 int, float, long, double 등은 사용할수 없다. (소문자)
		// Generic 타입은 Integer, Float, Long, Double, String (대문자) 등을 사용해야한다.
		// Generic 타입은 VO클래스를 사용할수 있다. 
		ArrayList<String> strList1 = new ArrayList<String>(); // 문자형
		ArrayList<Integer> intList1 = new ArrayList<Integer>(); // 정수형
		
		// strList1은 Generic이 String으로 설정되어 있기때문에
		// 문자열 외에는 add 할수 없다.
		strList1.add("대한민국");
		// strList1.add(30);
		// strList1.add(30.0f);		// 오류가 뜨는 숫자형들
		
		// intList1은 Generic이 Integer로 설정되어 있기 때문에
		// 정수형 외에는 add 할수 없다.
		intList1.add(30);
		//intList1.add("30");		// 오류가 뜨는 문자열들
		intList1.add(Integer.valueOf("39"));	// 형 변환을 시켜줬다. 
		
		
	}

}
