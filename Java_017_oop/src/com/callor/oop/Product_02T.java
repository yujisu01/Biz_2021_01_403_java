package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.service.ProductVO;

public class Product_02T {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * VO 클래스를 배열로 선언하고
		 * 사용(데이터 저장,읽기) 하려면 
		 * 선언된 객체배열 요소요소를
		 * 모두 초기화(생성)하는 과정이 필요하다.
		 * 
		 * 이 과정이 생략되면, 이후 코드에서 NullPointerException이 발생한다.
		 */
		ProductVO[] pVOs = new ProductVO[5];
		
		for(int i = 0 ; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		System.out.println("============================================");
		System.out.println("\t나라 쇼핑몰 상품관리 V1");
		System.out.println("--------------------------------------------");
		
		// 3만 입력하면 오류가 생기지만,
		// + "";를 해주면 오류가 안뜬다. 
		String strN = 3 + "";
		int intN = Integer.valueOf(strN);
		
		for(int i = 0 ; i < pVOs.length; i++) {
			String pCode = (i + 1) + "";
			pVOs[i].strPcode = pCode;
			
			System.out.println(pCode + "번 상품정보 입력");
			System.out.print("상품코드>>");
			pVOs[i].strPcode = scan.nextLine();
			
			System.out.print("상품이름>> ");
			pVOs[i].strPcode = scan.nextLine();
			
			System.out.print("거래처>> ");
			pVOs[i].strDname = scan.nextLine();
			
			System.out.print("품목>> ");
			pVOs[i].strItem = scan.nextLine();
			
			System.out.print("매입단가>> ");
			String iPrice = scan.nextLine();
			pVOs[i].iPrice =Integer.valueOf(iPrice);
			
			System.out.print("매출단가>> ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			
			pVOs[i].toString();
		}
	}

}
