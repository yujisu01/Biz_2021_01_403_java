package com.callor.score;

import java.util.Random;

public class Lottos_01 {
	
	public static void main(String[] args) {
		
		int[] nums= new int[45];
		for(int i = 0 ; i< 45 ; i++) {
			// nums[i]에 1부터 45까지의 값을 채워라
			nums[i] = i+1;
		}
		Random rnd = new Random();
		
		// 정렬하지않고 무작위로 생성할것이다
		// 1000번을 바꿈 (순서에 상관없이)
		for(int i = 0 ; i< 1000; i++) {
			
		int num1 = rnd.nextInt(45);
		int num2 = rnd.nextInt(45);
		
		// Sort_2에서는 순서대로 값을 비교했다.
		// 숫자를 임의로 생성하고, 막 바꾸는중
		// 45개의 난수중 숫자 2개의 위치가 바뀐것.
		int temp = nums[num1];
		nums[num1] = nums[num2];
		nums[num2] = temp;
	
		}
		// 로또번호 추출을 위해 배열로 수를6개만듬
		int lottos[] = new int[6];
		for(int i = 0 ; i < 6; i++) {
			lottos[i] = nums[i];
		}
		System.out.println("로또번호 출력");
		for(int n: lottos) {
			System.out.print(n+",");
			
			
		}
		System.out.println();
		
		for(int i = 0; i < lottos.length; i++) {
			for(int j = i+1; j< lottos.length; j++) {
				// 부등호를 반대로 하면 내림차순 정렬이된다.
				if(lottos[i] > lottos[j]) {
					int temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = temp;
				}
			}
		}
		System.out.println("로또번호 출력(오름차순 정렬)");
		for(int n : lottos) {
			System.out.print(n +",");
		}
		
	}

}
