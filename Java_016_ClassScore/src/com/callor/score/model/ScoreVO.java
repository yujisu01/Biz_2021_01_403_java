package com.callor.score.model;

/*
 * VO : Value Object  (value:값, Object:객체)
 */
public class ScoreVO {
	/*
	 * 클래스, 인스턴스변수, method 등 에는
	 * public, private, protected 의 키워드로
	 * 선언문을 시작할수 있다. 
	 * 
	 *  이 3개의 키워드를 'scope 한정자' 라고 한다.
	 *  
	 *  public : 누구나 읽고, 쓰기, 호출이 가능함.
	 *  private : 아무나 읽고, 쓰기, 호출이 불가능하다.
	 *  
	 *  클래스를 인스턴스로 선언하고, 
	 *  인스턴스.method(),  인스턴스.변수  형식의 명령문을 사용하려면,
	 *  method()나 인스턴스변수에 'public 한정자'를 붙여야 한다.
	 */
	private String strNum;
	
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	public int intMusic;
	public int intHistory;
	
	public int intSum;
	public float floatAvg;
	
	

}
