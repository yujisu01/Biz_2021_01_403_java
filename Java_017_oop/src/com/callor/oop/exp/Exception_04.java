package com.callor.oop.exp;

import com.callor.oop.service.ProductVO;

public class Exception_04 {

	public static void main(String[] args) {

		ProductVO[] pVOs = new ProductVO[3];

		//for (int i = 0; i < pVOs.length; i++) {
		
			// 근본적으로 exception이 발생하지 않도록 하는 코드이다.
			// 나는 for문을 돌려서 pVOs[i]로 다 초기화 시켜줬다.
			pVOs[0] = new ProductVO();
			
			// 객체가 초기화되지 않은상태에서 발생하는 
			// exception을 처리하는 코드이다.

			try {
				pVOs[0].strDname = "초코파이";
			} catch (NullPointerException e) {
				System.out.println("객체가 생성되지 않았는데 사용하려함");
			}

		
	}
}
