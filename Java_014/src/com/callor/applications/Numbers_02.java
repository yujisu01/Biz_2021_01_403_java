package com.callor.applications;

public class Numbers_02 {

	public static void main(String[] args) {

		int intNum1 = 33;
		int intNum2 = 77;
		System.out.printf("num1 : %d, num2 : %d\n", intNum1, intNum2);

		// 1.(임시)로 사용할 intTemp를 만들고
		// 2. num1 변수값을 복사해둔다 (백업)
		int intTemp = intNum1;
		// 3. num1 변수에 num2 의 값을 복사해서 
		intNum1 = intNum2;
		// 4. 임시로 (intTemp == 33) temp에 백업해둔 num1의 값을 
		// 		intTemp == 33
		// 	num2 에 복사
		// 		num2 == 33
		intNum2 = intTemp;
		// 5. num1과 num2의 값이 서로 바뀐다.
		// 이를 변수값의 'swap코드' 라고 한다.
		
		// 정리하자면 이렇게 코드가 진행된다.
		intTemp = intNum1;
		intNum1 = intNum2;
		intNum2 = intTemp;
		
		System.out.printf("num1 : %d, num2 : %d", intNum1, intNum2);

	}

}
