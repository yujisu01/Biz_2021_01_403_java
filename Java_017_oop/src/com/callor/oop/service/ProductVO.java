package com.callor.oop.service;

public class ProductVO {
	
	/*
	 * 쇼핑몰에서 판매되는 상품을 관리하기 위한
	 * 데이터를 저장할 용도의 Value Object 클래스 디자인(설계)..
	 * 
	 * ProductVO 클래스는
	 * ProductVO.java 파일로 생성되어 저장된다
	 * 클래스를 만들고 파일로 저장하는 과정
	 * 이것을 클래스 디자인, 설계라고 부르고
	 * 
	 * 정확한 명칭은 '프로토타입(Proto type)' 작성 이라고 한다.
	 * 클래스 프로토 타입은 객체를 생성하기 위한 '설계도' 코드이다.
	 * 
	 * VO(Value Object) 클래스에서 가장 중요한 부분은,
	 * 인스턴스 변수를 선언하는부분이다 (public, private...)
	 * 
	 * 상품관리를 위해 필요한 데이터들 :
	 * 상품코드, 상품명, 품목명, 거래처, 매입단가, 매출단가 
	 * 
	 * Product : 상품코드,상품명
	 * 단가: 매입단가, 매출단가 * 수량을 곱셉하여 연산을 수행할것이다.
	 * dept: 거래처
	 * Item: 품목명
	 * 
	 */
	public String strPcode; // 상품코드
	public String strPname; // 상품명
	public String strItem; // 품목명
	public String strDname; // 거래처
	public int iPrice; // 매입단가
	public int oPrice; // 매출단가
	
	/*
	 * java에서 클래스를 선언하게 되면
	 * 	public String toString() 메서드가 자동으로 생성되는데,
	 * 	기본적으로 그 코드는 보이지 않는 상태이다.
	 * 
	 * toString() 메서드는
	 * 	객체를 생성했을때, 어떤 클래스를 사용했는지,
	 * 	생성된 객체가 컴퓨터 기억장치의 어떤곳(주소)에
	 * 	저장되어 있는지 알려주는 코드이다.
	 * 
	 * java코딩에서는 
	 * 	toString() 메서드의 기본역할이 크게 필요하진 않다.
	 * 
	 * 그래서 일반적으로 VO클래스를 만들때는
	 * 	임의로 toString() 메서드를 다시 만들어준다.
	 * 	그리고 인스턴스변수에 입력된 값을 알려주는
	 * 	디버깅 코드를 생성한다.
	 * 
	 * method Override (Overriding)
	 * = 메서드를 재정의하다!
	 * 	java에 자동으로 만들어져 있는 toString() 메서드를
	 * 	개발자가 임의로 다시 만들었다.
	 * 
	 * 원래 java가 자동으로 생성한 코드는 감춰진다.
	 * 
	 */
	public String toString() {
		//for(int i = 0 ; i < this.length; i++) {
			
		System.out.println("입력된 데이터확인");
		System.out.println("-----------------------------------------------");
		System.out.printf("상품코드 : %s\n", this.strPcode);
		System.out.printf("상품명 : %s\n", this.strPname);
		System.out.printf("거래처 : %s\n", this.strDname);
		System.out.printf("품목명 : %s\n", this.strItem);
		System.out.printf("매입단가 : %d\n", this.iPrice);
		System.out.printf("매출단가 : %d\n", this.oPrice);
		
		System.out.println("===============================================");
		
		//return ""; = return null; 같은말이다.
		// 아직 리턴할값이 없다고 해석할수 있다.
		return null;
	}
	
}
