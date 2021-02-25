package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.service.ProductVO;

public class Product_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ProductVO[] pVO = new ProductVO[5];
		
		for(int i = 0 ; i < pVO.length; i++) {
			pVO[i] = new ProductVO();
		}
		System.out.println("==============================================");
		System.out.println("\t상품정보 등록(입력) 시스템");
		System.out.println("----------------------------------------------");
	
		for (int i = 0; i < pVO.length; i++) {
			System.out.print((i+1)+ "번째 상품코드를 입력하세요 : ");
			pVO[i].strPcode = scan.nextLine();
			
			System.out.print((i+1) + "번째 상품명을 입력하세요 : ");
			pVO[i].strPname = scan.nextLine();
			
			System.out.print((i+1) + "번째 거래처를 입력하세요 : ");
			pVO[i].strDname = scan.nextLine();
			
			System.out.print((i+1) + "번째 품목명을 입력하세요 : ");
			pVO[i].strItem = scan.nextLine();
			
			System.out.print((i+1) + "번째 매입단가를 입력하세요 : ");
			pVO[i].iPrice = scan.nextInt();
			
			System.out.print((i+1) + "번째 매출단가를 입력하세요 : ");
			pVO[i].oPrice = scan.nextInt();
			System.out.println("=======================================");
			scan.nextLine();
			
			
		}
		for(int i = 0 ; i < pVO.length; i++) {
		pVO[i].toString();
		
		}
	}
}
