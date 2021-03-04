package com.callor.shop.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

public class CartServiceImplV2 
			extends CartServiceImplV1 
			implements CartServiceV2 {

	private final Scanner scan;
	private String cartFileName;
	
	public CartServiceImplV2() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
		cartFileName 
			= "src/com/callor/shop/cartlist.csv";
	}
	
	
	@Override
	public void saveCartToFile() {
		
		FileWriter fileWriter = null;

		PrintWriter printer = null;
		
	
		 
		try {
			fileWriter = new FileWriter(cartFileName);
			
			printer = new PrintWriter(fileWriter);
		
			
			int nSize = cartList.size();
			System.out.println(nSize);
			for(int i = 0 ; i < nSize ; i++) {
				CartVO cartVO = cartList.get(i);
				printer.printf("%s,%s,%d,%d,%d\n",
						cartVO.getUserName(),
						cartVO.getProductName(),
						cartVO.getQty(),
						cartVO.getPrice(),
						cartVO.getTotal());
			}
			printer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void loadCartFromFile() {
	}
}