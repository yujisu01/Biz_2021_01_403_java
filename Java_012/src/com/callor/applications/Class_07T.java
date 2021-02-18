package com.callor.applications;

import com.callor.applications.service.ClassServiceV5T;

public class Class_07T {
	
	public static void main(String[] args) {
		
		ClassServiceV5T csV5 = new ClassServiceV5T();
		float result = csV5.sum(55.2F, 33.7F);
		
		// 이거는 그냥 설명하려고 만든거 (int,long,float,double)
		int num1 = 3;
		long num2 = 3;
		
		float num3 = 3.0f;
		num3 = (float)3.0;
		double num4 = 3.0;
	}

}
