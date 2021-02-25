package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.service.ProductVO;

public class Product_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProductVO[] pVOs = new ProductVO[5];
		
		for(int i = 0 ; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		System.out.println("============================================");
		System.out.println("\t나라 쇼핑몰 상품관리 V1");
		System.out.println("--------------------------------------------");
		
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
			if(pVOs[i].iPrice < 0) {
				System.out.println("error : 0 미만값은 입력할수 없습니다");
				break;
			}
			
			System.out.print("매출단가>> ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			if(pVOs[i].oPrice < 0) {
				System.out.println("error : 0 미만값은 입력할수 없습니다");
				break;
			}
			
			pVOs[i].toString();
		}
	}

	}

