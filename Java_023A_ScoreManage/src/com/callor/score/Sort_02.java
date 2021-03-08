package com.callor.score;

import java.util.Random;

public class Sort_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums= new int[20];
		// 배열을 만든뒤 랜덤수를 채웠다
		for(int i = 0 ; i< nums.length; i++) {
			
			nums[i] = rnd.nextInt(100)+1;
		}
		
		// 정렬알고리즘을 통과시킴
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		int count = 0;
		for(int n:nums) {
			System.out.print(n + ",");
			// 5개씩 끊어읽기 
			if(++count % 5 ==0) {
				System.out.println();
			}
		}
	}

}
