package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1T;

public class FileWriter_05T {
	
	public static void main(String[] args) {
		
		RndServiceImplV1T rService = new RndServiceImplV1T();
		rService.makeRnd();
		rService.saveFileRnd();
		
		// files패키지 F5번키 눌러주면 numsRnd 메모장이 나타난다.
		
	
	}

}
