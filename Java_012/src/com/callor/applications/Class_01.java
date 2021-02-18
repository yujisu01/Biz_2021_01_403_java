package com.callor.applications;

import com.callor.applications.service.ClassServiceV1;

public class Class_01 {
	
	public static void main(String[] args) {
		
		ClassServiceV1 clService = new ClassServiceV1();
		
		clService.add(20, 40);
		clService.add(20, 30.5f);
		clService.add(15.9d, 27.3f);
	}

}
