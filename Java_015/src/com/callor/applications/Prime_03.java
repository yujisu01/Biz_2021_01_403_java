package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		System.out.print("숫자입력>> ");
		psV2.prime(scan.nextInt());
	}

}
