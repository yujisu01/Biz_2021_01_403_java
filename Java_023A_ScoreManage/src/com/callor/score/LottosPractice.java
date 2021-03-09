package com.callor.score;

import java.util.Random;

public class LottosPractice {
	
	public static void main(String[] args) {
		
		Random rnd= new Random();
		int[] nums = new int[45];
		
		for(int i = 0; i< nums.length;i++ ) {
			nums[i] = i+1;
		}
		for(int i = 0; i< 1000; i++) {
			int num1 = rnd.nextInt(45);
			int num2 = rnd.nextInt(45);
			
		int temp = nums[num1];
		nums[num1] = nums[num2];
		nums[num2]= temp;
		
		}
		int lottos[] = new int[6];
		for(int i = 0; i<6; i++) {
			lottos[i] = nums[i];
		}
		System.out.println("로또번호");
		for(int n: lottos) {
			System.out.print(n + ",");
		}
		System.out.println();
		
		for(int i =0; i< lottos.length; i++) {
			for(int j =i+1; j< lottos.length; j++) {
				if(lottos[i] < lottos[j]) {
				int temp = lottos[i];
				lottos[i]= lottos[j];
				lottos[j]= temp;
			}
		}
		
	}System.out.println("로또번호 출력(내림차순정렬)");
	for(int n:lottos) {
		System.out.print(n+",");
	}
	}	

}
