package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1T;

public class FileWriter_07 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/score.txt";
		
		RndServiceImplV1T rV1 = new RndServiceImplV1T();
		rV1.makeRnd();
		rV1.saveFileRnd(fileName);
		
	}

}
