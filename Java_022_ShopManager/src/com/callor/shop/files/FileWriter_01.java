package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import com.callor.shop.values.Values;

public class FileWriter_01 {
	
	public static void main(String[] args) {	
	
	Random rnd= new Random();
	String fileName= "src/com/callor/shop/files/nums1.txt";
	
	
	//public void saveFile() {
		
		FileWriter filewriter = null;
		PrintWriter printer = null;
		
		try {
			filewriter = new FileWriter(fileName);
			printer = new PrintWriter(filewriter);
			
			for(int i = 0; i < 100; i++) {
				int rndInt = rnd.nextInt(1000)+1;
				printer.println(rndInt);
				//printer.println(Values.dLine);
				
			}
			printer.close();
			filewriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	
	}


}

