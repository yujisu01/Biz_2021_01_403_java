package com.callor.start.bool;

public class BoolAlge_02 {

	public static void main(String[] args) {

		boolean bYes1 = 3 > 3;
		boolean bYes2 = 3 == 3;

		// false && true == false
		boolean bYes3 = bYes1 && bYes2;

		// false || true == true
		boolean bYes4 = bYes1 || bYes2;

		int num1 = 100;
		int num2 = 200;
		
		// (num1 > 50)의 결과가 true 이므로
		// java는 효율적인 코드실행을 위하여
		// || 이후의 코드를 무시한다. (어차피 true니까)
		boolean bYes5 = (num1 > 50) || (num2 += 20) > 0;

		if (num1 > 50) {  
			num2 += 20;
		}
		// num1 < 50이 false이므로
		// && 이후의 코드는 무시된다.
		
		// false * true
		bYes5 = (num1 < 50) && (num2 += 20) < 300;

		if (num1 < 50) { // num1이 50보다 작으면 num2에 20을 더하고, 아니면 무시하라.
			num2 += 20;
		}

	}

}
