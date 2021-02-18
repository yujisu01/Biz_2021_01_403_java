package com.callor.applications;

import com.callor.applications.service.ClassServiceV2;

public class Class_02 {

	public static void main(String[] args) {

		ClassServiceV2 csV2 = new ClassServiceV2();

		csV2.sum(); // 선언만 됐기 때문에 아직 0이 나온다.
		csV2.add(); // 랜덤 2가지 숫자가 덧셈이 됐다.
		csV2.sum(); // 12번째줄 add 값이 호출이 됐다.
	}

}
