package com.callor.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.CartVOT;
import com.callor.shop.service.CartServiceV2;

public class CartServiceImplV3 
			extends CartServiceImplV1T 
			implements CartServiceV2{
	
	private Scanner scan;
	private List<CartVOT> cartList;
	private String cartFileName;
	
	public CartServiceImplV3() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVOT>();
		cartFileName = "src/com/callor/shop/cartlist.txt";
	}

	@Override
	public void saveCartToFile() {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		try {
			fileWriter = new FileWriter(cartFileName);
			printer = new PrintWriter(fileWriter);
			
			printer.println("대한민국");
			printer.println("우리나라");
			printer.println("Republic of Korea");
			
			printer.close();
			fileWriter.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}

	@Override
	public void loadCartFromFile() {
		// TODO Auto-generated method stub
		
	}

}
