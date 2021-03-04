package com.callor.shop;

public class StringArray_02 {

	public static void main(String[] args) {
		
		String strCart = "홍길동:초코파이:10:1000";
		/*
		 * 원래문자열.split(구분자문자열)
		 * 
		 * 원래 문자열을 구분자문자열을 기준으로 나누고,
		 * 문자열 배열로 만들어 return한다.
		 */
		String[] cartList = strCart.split(":"); 		//{"홍길동","초코파이"}
		
		for(String s : cartList) {
			System.out.println(s);
		}
		/*
		 * strCart에 담긴 문자열을 글자단위로
		 * 잘라서, 배열에 담아달라
		 */
		cartList = strCart.split("");
		for(String s : cartList) {
			System.out.println(s);
		}
		// 지정된 형식(폼)으로 문자열을 만들어서
		// return해주는 메서드이다.
		strCart = String.format("%d:%d:%d", 10,20,30);
		System.out.println(strCart);
		
		//strCart변수에 담긴 문자열중에
		//20 이라는 문자열이 있으면
		//대한민국 이라는 문자열로 바꿔서 return하라.
		strCart = strCart.replace("20", "대한민국");
		
		System.out.println(strCart);
		
		//화이트스페이스까지 출력됨
		String strName = "홍 길동   ";
		System.out.println(strName);
		strName = strName.replace(" ", "");		// 문자열중 공백제거하여 '홍길동'이 출력됨
		
		strName = "나는 자랑스러운 태극기 앞에";	
		String strFlag = strName.substring(9);
		System.out.println(strFlag);		// '태극기 앞에' 출력됨
	
		strFlag = strName.substring(9,12);	// 9번째부터 12번째 까지만 잘라서 출력하라
		System.out.println(strFlag);		// '태극기'만 출력됨.
		
		
		
		
	}
}
