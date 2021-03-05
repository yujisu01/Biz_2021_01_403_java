package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {
	
	public static void main(String[] args) {
		
		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		int[] nums = new int[100];
		// 배열을 만들고 배열에 난수 채워넣기.
		for(int i = 0; i< nums.length; i++) {
			nums[i] = rnd.nextInt(1000)+1;
		}
		
		FileWriter filewriter = null;
		PrintWriter printer =null;
		
		try {
			filewriter = new FileWriter(numsFile);
			printer = new PrintWriter(filewriter);
			// nums 배열에 담긴 전체리스트를
			// 향상된 for반복문으로 반복하면서, 파일에 출력함
			for(int n : nums) {
				printer.println(n);
				
			}
			printer.close();
			filewriter.close();
			System.out.println("Mission Complete!!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
