package com.callor.applications;

public class Class_05 {

	public static void main(String[] args) {

		/*
		 * println : 
		 * ()안의 값, 변수값, 연산식 결과를 콘솔에 출력한다. 
		 * 출력한 후 자동 줄바꿈을 하여, 이후 출력되는 결과가, 다음줄에
		 * 출력되도록 하는 기능이다.
		 * 
		 * ()안에 아무것도 없으면 빈줄만 출력한다.
		 */

		System.out.println();
		System.out.println(30 + 40);
		System.out.println("대한민국");

		/*
		 * print :
		 * ()안의 값, 변수값, 연삭식 결과를 콘솔에 출력함. 
		 * 단, 출력후 줄바꿈을 하지않아, 이후 출력되는 결과가, 옆으로
		 * (이어서) 출력된다. 또한, ()안의 내용을 생략할수 없다.
		 */
		System.out.print(30 + 40);
		System.out.println("대한민국");

		/*
		 * printf formatting : 
		 * 문자열을 형식(양식)에 맞추어 출력하려고 할때, 
		 * %d : 정수숫자 (십진수) 
		 * %s : 문자열(string) 
		 * %f : 실수형 (float) 
		 * \t : Tab 특수문자(8칸 간격 띄우기) 
		 * \n : 줄바꿈 특수문자 (println과 유사한 효과)
		 */
		System.out.printf("%d \t %s \t %f \n", 30, "대한민국", 30.245F);

		// %d 위치에 숫자값을 넣어서 출력형식 만들기.
		System.out.printf("숫자 : %d\n", 3);
		System.out.printf("숫자 : %d\n", 300);
		System.out.printf("숫자 : %d\n", 3000);
		System.out.printf("숫자 : %d\n", 30000);
		System.out.println("===============================================");

		// 일단 5개짜리 빈공간을 만들고, 숫자를 오른쪽 정렬.
		System.out.printf("숫자 : %5d\n", 3);
		System.out.printf("숫자 : %5d\n", 300);
		System.out.printf("숫자 : %5d\n", 3000);
		System.out.printf("숫자 : %5d\n", 30000);
		System.out.println("===============================================");

		// 일단 5개짜리 빈공간을 만들고, 숫자를 오른쪽 정렬.
		// 왼쪽에 빈칸을 문자열 '0'으로 채우기.
		System.out.printf("숫자 : %05d\n", 3);
		System.out.printf("숫자 : %05d\n", 300);
		System.out.printf("숫자 : %05d\n", 3000);
		System.out.printf("숫자 : %05d\n", 30000);
		System.out.println("===============================================");

		// %d 일 경우, 값보다 자릿수가 부족할 경우
		// 형식이 어긋난다.
		System.out.printf("숫자 : %3d\n", 3);
		System.out.printf("숫자 : %3d\n", 300);
		System.out.printf("숫자 : %3d\n", 3000);
		System.out.printf("숫자 : %3d\n", 30000);
		System.out.println("===============================================");

		System.out.printf("%s 우리나라\n", "대한민국");
		System.out.println("==============================================");

		System.out.printf("%30s 우리나라\n", "대한민국");
		System.out.println("==============================================");

		// %s 대신 문자열을 채워서 출력형식 만들기
		// 단, 문자열이 한글일 경우, 형식이 어긋난다.
		System.out.printf("%30s 우리나라\n", "대한");
		System.out.printf("%30s 우리나라\n", "대한민");
		System.out.printf("%30s 우리나라\n", "대한민국");

		System.out.printf("%-30s 우리나라\n", "KO");
		System.out.printf("%-30s 우리나라\n", "KOR");
		System.out.printf("%-30s 우리나라\n", "Republic");

		// 일단 5개짜리 빈공간을 만들고, 숫자를 왼쪽 정렬.
		System.out.printf("숫자 : %-5d\n", 3);
		System.out.printf("숫자 : %-5d\n", 300);
		System.out.printf("숫자 : %-5d\n", 3000);
		System.out.printf("숫자 : %-5d\n", 30000);
		System.out.println("===============================================");

		// 실수표현
		// 정수부분 3자리, 소수점부분 2자리 (3번째에서 반올림하라)
		System.out.printf("%3.2f\n", 30.6666);

		int dan = 7;
		for (int i = 1; i < 10; i++) {

			System.out.printf("%d x %d = %3d\n", dan, i, dan * i);

		}
	}

}
