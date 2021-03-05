package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV2;

public class FileWriter_06 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/numsRnd.txt";
		
		RndServiceImplV2 rService = new RndServiceImplV2(fileName);
		
		rService.makeRnd();
		rService.saveFileRnd(fileName);
		rService.loadFileRnd();
	}

}
