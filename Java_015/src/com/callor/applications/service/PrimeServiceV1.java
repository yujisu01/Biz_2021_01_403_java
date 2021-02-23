package com.callor.applications.service;

public class PrimeServiceV1 {

	public void prime(int intNum) {

		int i = 0;
		for (i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				break;
			}
		}
		if (i < intNum) {
			System.out.println(intNum + "은(는) 소수가아님");
		} else {
			System.out.println(intNum + "은(는) 소수임");
		}
	}

}
