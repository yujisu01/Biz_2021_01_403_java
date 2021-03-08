package com.callor.score;

public class Sort_05 {
	
	public static void main(String[] args) {
		
		String strA = "A";
		String strB = "B";
		
		// A와 B가 같은가 
		boolean bYes = strA.equals(strB);
		System.out.println(bYes); 	//false
		// 문자열 비교할때
		// compareTo 사용
		// 원본.compareTo(비교본)
		// 		알파벳 순서에 따라 
		// 		얼마나 거리가 떨어져 있는지 비교
		System.out.println(strA.compareTo(strB));	// -1
		System.out.println(strB.compareTo(strA));	// 1
		
		// 원본이 비교본보다 작으면 0보다 작은거다
		// 원본 < 비교본 == < 0
		// 원본이 비교본보다 크면 0보다 큰거다
		// 원본 > 비교본 == > 0
		System.out.println("A".compareTo("C"));		// -2 :A는 C보다 거꾸로2칸 이전
		System.out.println("A".compareTo("A"));	 	// 0
		
		System.out.println("A".compareTo("a"));	 	// -32 (아스키코드 차이)
		
		/*
		 * 문자열 크기(?) 비교
		 * 
		 * 문자열을 정렬하고자 할때는 비교를 해야하는데
		 * 일반적인 비교연산자(= > <)는 사용이 불가하다.
		 * 그렇기 때문에 String클래스에서 제공하는 메서드를 활용해서
		 * 처리를 수행한다 (compareTo)
		 * 
		 * 같은가(==) : equals() method
		 * 문자형 정렬을 위해 앞,뒤 구분: compareTo() method
		 * 
		 * 문자열의 길이가 다른경우,
		 * 문자열 값을 기준으로 정렬하는것은 어려움이 있다.
		 * 
		 */
		
		// 문자열의 길이가 다르면 예측하기 어려운 값이 출력된다.
		System.out.println("ABC".compareTo("A"));	// 2
		
		// 10,1,11,12 이 숫자들을 정렬하면 
		// 1, 10, 11, 12 
		
		// "10","1","11","12" 문자열로 이렇게 되있다면 정렬하기 힘들다.
		// "1", "10","11","12" 어떤경우는 이렇게 출력하는 곳도 있고
		// "10","11","12","1" 이렇게도 출력이 나올수 있고
		// "1", "10","11","12" 이렇게도 나올수 있다.
		
		System.out.println("0001".compareTo("0020"));	// -2
		System.out.println("0020".compareTo("0001"));	// 2 
	}

}
