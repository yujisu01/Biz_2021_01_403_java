package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.service.ProductVO;

public class Product_03T {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * VO 클래스를 배열로 선언하고 사용(데이터 저장,읽기) 하려면 선언된 객체배열 요소요소를 모두 초기화(생성)하는 과정이 필요하다.
		 * 
		 * 이 과정이 생략되면, 이후 코드에서 NullPointerException이 발생한다.
		 */
		ProductVO[] pVOs = new ProductVO[5];

		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		System.out.println("============================================");
		System.out.println("\t나라 쇼핑몰 상품관리 V1");
		System.out.println("--------------------------------------------");

		// 3만 입력하면 오류가 생기지만,
		// + "";를 해주면 오류가 안뜬다.
		String strN = 3 + "";
		int intN = Integer.valueOf(strN);

		for (int i = 0; i < pVOs.length; i++) {
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

			while (true) {
				System.out.print("매입단가>> ");
				String strIPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(strIPrice);
				if (intIPrice < 0) {
					System.out.println("매입단가는 0이상 입력하라");
				} else {
					pVOs[i].iPrice = intIPrice;
					break;
				}
			}
			while (true) {
				System.out.print("매출단가>> ");
				String strOPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(strOPrice);
				if (intOPrice < 0) {
					System.out.println("매출단가는 0이상 입력하라");
				} else {
					/*
					 * 정상처리 되었으면, (단가가 0이상 입력됐으면) vo에 값을 저장하고, 
					 * 다음단계로 진행하라. 
					 * 현 시점의 while()은 중단하라.
					 */
					pVOs[i].iPrice = intOPrice;
					break;
				}
			}

			pVOs[i].toString();
		}
	}// main end
}
