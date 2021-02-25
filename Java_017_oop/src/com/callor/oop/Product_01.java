package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.service.ProductVO;

public class Product_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProductVO proVO = new ProductVO();
		
		System.out.println("toString() : " + proVO.toString());
		
		System.out.println("===============================================");
		System.out.println("\t상품정보 등록(입력) 시스템");
		System.out.println("-----------------------------------------------");
		System.out.print("상품코드를 입력하세요 : ");
		proVO.strPcode = scan.nextLine();
		System.out.print("상품명을 입력하세요 : ");
		proVO.strPname = scan.nextLine();
		System.out.print("거래처를 입력하세요 : ");
		proVO.strDname = scan.nextLine();
		System.out.print("품목명을 입력하세요 : ");
		proVO.strItem = scan.nextLine();
		System.out.print("매입단가를 입력하세요 : ");
		proVO.iPrice = scan.nextInt();
		System.out.print("매출단가를 입력하세요 : ");
		proVO.oPrice = scan.nextInt();
		System.out.println("===============================================");
		
		
		// 확인하는 절차를 '디버깅'이라고 한다.
		// 이렇게 보여주는 코드가 필요하다.
		// 디버깅코드를 VO로 데려감..
		
		proVO.toString();
		
	}

}
