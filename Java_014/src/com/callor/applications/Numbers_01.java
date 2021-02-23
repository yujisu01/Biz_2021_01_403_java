package com.callor.applications;

public class Numbers_01 {

	public static void main(String[] args) {

		/*
		 * 배열을 10개 선언및 생성 intNums.length 라는 값이 만들어지고 
		 * 그 값은 배열의 갯수를 가리킨다.
		 * 
		 * 배열의 요소에 어떤값을 저장할때는 'intNums[위치] = 값' 형식을 사용하는데, 
		 * 이때, 위치의 값을 "(배열)첨자"라고 한다.
		 * 
		 * intNums[3] = 100 
		 * ==> intNums 배열의 3번 첨자 위치에 100을 저장하라는 의미. 
		 * System.out.println(intNums[4] ) 
		 * ==> intNums 배열의 4번 첨자 위치에 저장된 값을 Console에 출력하라는 의미
		 * 
		 * sum = intNums[5] 
		 * ==> intNums 배열의 5번 첨자 위치에 저장된 값을 변수 sum에 복사하라는 의미.
		 * 
		 * sum = intNums[7] + 200; 
		 * ==> intNums 배열의 7번 첨자 위치에 저장된 값과 정수 200을 덧셈하여, 변수
		 * sum에 저장하라.
		 * 
		 * 배열의 첨자 최대값은 항상 '배열.length - 1'이다.
		 *  ==> 만약, new.int[100] 이라고 배열을 생성했으면 가장 마지막
		 * 첨자는 99가 된다 라는 의미
		 * 
		 * 만약, 
		 * int intNums = new int[10] 이라고 생성한 배열에 intNums[10] = 100 이라는 명령을 실행하면
		 * ArrayIndexOutOfBounds Exception이 발생한다.
		 * 
		 * 또는,
		 *  intNums[-1] = 100이라는 명령은 절대 사용불가함. 첨자는 0부터 배열.length -1 까지의 자연수만 사용가능함.
		 * 
		 * 
		 */
		int[] intNums = new int[10];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			System.out.print(intNums[i] + ",");
		}
	}

}