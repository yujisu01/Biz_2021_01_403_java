package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV1;

public class Prime_02 {

	public static void main(String[] args) {

		PrimeServiceV1 psV1 = new PrimeServiceV1();
		Scanner scan = new Scanner(System.in);

		System.out.print("'2' 이상의 숫자를 입력하시오>> ");
		psV1.prime(scan.nextInt());
		
	

	}

}
