package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {
	
	private static String numsFile;
	
	//private static List<Integer> intList;
	
	public RndServiceImplV1() {
	
		// intList = new ArrayList<Integer>();
		numsFile = "src/com/callor/shop/files/nums.txt";
	}

	public static void makeRnd() {
		
		Random rnd = new Random();
		List<Integer> intList=new ArrayList<Integer>();
		
		FileWriter filewriter = null;
		PrintWriter printer = null;

		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000)+1;
			
			//intList.add(num);

			int line = 0;
			try {
				filewriter = new FileWriter(numsFile);
				printer = new PrintWriter(filewriter);

				for (Integer n : intList) {
					printer.printf("%d:", n);
					line++;

					if (line % 5 == 0) {
						printer.println();
					}

				}

				printer.close();
				filewriter.close();

			} catch (Exception e) {

			}
		}
	}

	public static void saveFileRnd() {

	}
}
