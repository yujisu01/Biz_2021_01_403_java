package com.callor.applications.service;

public class PrimeServiceV2T {
	
	public int prime(int intNum) {
		
		for(int i = 2; i < intNum ; i++) {
			
			if(intNum % i == 0) {
				// prime() 메서드 실행을 중단하고, 
				// 메인 메서드에게 -1을 되돌려주라는 뜻.
				return -1;
			}
		}
		// num값이 소수여서 for() 반복문을 모두 수행하고,
		// 여기에 다다르면, num값을 그대로 리턴하라 라는 뜻이다.
		return intNum;
		

		
		
		// -------------------------------------
		// num값이 소수이면 return num
		// 아니면 return -1 하라.. 
		
		//if(소수이면) return num;
		//else return -1;
	}

}
