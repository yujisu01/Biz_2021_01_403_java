package com.callor.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {
	
	public static void main(String[] args) {
		
		// java프로젝트에서 List객체를 생성하기
		// List클래스를 사용하여 객체를 선언하고,
		// 		ArrayList() 생성자를 호출하여
		// 		객체를 초기화 시켜준다.
		List<String> strList1 = new ArrayList<String>();
		
		List<Integer> intList; 	// 선언만 함.
		intList = new ArrayList<Integer>(); 	// 생성까지 한거.
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();

		// List<Integer> intList1 = new ArrayList<Integer>(); => 한줄로 적은것
		
		// 정수형으로 만든 num을 float형으로 변경하고 싶다==> 불가능함.
		// int[] num = new int[3];
		// num = float[3];
		
		ArrayList<Integer> intArrayList1;
		intArrayList1 = new ArrayList<Integer>();
		// intArrayList1 = new LinkedList<Integer>();
		// intArrayList1 = new Vector<Integer>();
	}

}
