package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_03 {
	
	public static void main(String[] args) {
		
		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 리스트를 만들어서 Random수를 저장하기.
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			// 1번코드
			Integer num = rnd.nextInt(1000)+1;
			intList.add(num);
			// 2번코드 (둘다 똑같음) 변수의 유무 차이
			intList.add(rnd.nextInt(1000)+1);
		}
		
		FileWriter filewriter = null;
		PrintWriter printer =null;
		
		try {
			filewriter = new FileWriter(numsFile);
			printer = new PrintWriter(filewriter);
			
			// intList에 담긴 전체리스트를
			// 향상된 for반복문으로 반복하면서 파일에 출력
			for(Integer n : intList) {
				printer.println(n);
				
			}
			
			// 표준형 for로 반복하면서 파일에 출력
			int nSize = intList.size();
			for(int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
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
