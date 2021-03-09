package com.callor.iolist;

import com.callor.iolist.service.impl.IolistServiceImplV1;
//import com.callor.iolist.service.impl.iolistServiceImplV1;

public class ioListEx_01 {
	
	public static void main(String[] args) {
		
		IolistServiceImplV1 ioV1 = new IolistServiceImplV1();
		ioV1.read();
		ioV1.print();
		ioV1.multiple();
	}

}
