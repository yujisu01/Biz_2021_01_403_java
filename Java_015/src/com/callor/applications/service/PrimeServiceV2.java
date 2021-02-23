package com.callor.applications.service;

public class PrimeServiceV2 {

	public int prime (int intNum) {

		int i = 0;
		for (i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				break;
			}
		}
		if (i < intNum) {
			//System.out.println("-1");
			return -1;
			
		} else {
			System.out.println(intNum);
			
		}
		return intNum;
	}

}
