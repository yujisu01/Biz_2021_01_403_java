package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2T;

public class Prime_03T {
	
	public static void main(String[] args) {
		
		PrimeServiceV2T psV2 = new PrimeServiceV2T();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2 이상의 정수를 입력하시오>>");
		int num = scan.nextInt();
		
		int result = psV2.prime(num);
		if(result < 0) {
			System.out.println(num + "은(는) 소수가아님");
		}else {
			System.out.println(num + "은(는) 소수");
		}
	}

}
