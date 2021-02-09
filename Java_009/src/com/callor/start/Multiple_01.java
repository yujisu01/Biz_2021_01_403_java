package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;

		for (int i = 0 ; i < 100 ; i++) {

			num = i + 1;
			
			if (num % 3 == 0 && num % 9 == 0) {
				System.out.println("3의 배수이면서, 9의 배수 : "+ num);
			
				sum += num;
			}

		}
		System.out.println("3의 배수이면서, 9의 배수인 수들의 합 : " + sum);
		System.out.println("================================================");
		
		int num1 = 0;
		int num2 = 0;
		sum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			num1 = i + 3;
			num2 = i + 9;
			
			if(num1 % 3 == 0 && num2 % 9 == 0) {
				System.out.println("3의 배수이면서, 9의 배수 : "+ i);
				
				sum += i;
				
				
			}
		}
		System.out.println("3의 배수이면서, 9의 배수인 수들의 합 : " + sum);
	}

}
