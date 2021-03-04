package com.callor.shop;

/*
 * 아무것도(변수, 메서드 등등) 없는 클래스는
 * Java 클래스들의 조상인 Object를 자동으로 extends한다. 
 */
public class Class_01 extends Object{

	/*
	 * 원천적으로 모든 클래스는 Object클래스에 
	 * 	만들어져 있는 (정의되어 있는) 
	 * 	toString() 메서드를 가지고 있다.
	 * toString() 메서드는 Object 클래스로부터 상속받은 것이다.
	 * 
	 * java에서는 상속받은 메서드를
	 * 	필요에 따라, 마음대로 요리해서 변형할수 있다.
	 * 이러한 것을 "메서드의 재정의" 라고 한다. 
	 * 
	 * @... : Annotation (주석)
	 * 
	 * @Override : Override Annotation
	 * 		이 메서드는, 부모 클래스에서 상속받았지만
	 * 		여기에서 재정의 하겠다라는 의미이다. 
	 */
	@Override
	public String toString() {
		
		return "나는 Object를 상속받은 Class_01입니다";
	}
}
