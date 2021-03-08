package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.ioListVO;
import com.callor.iolist.service.ioListService;

public class iolistServiceImplV1 implements ioListService{

	private String fileName;
	private List<ioListVO> ioList;
	
	public iolistServiceImplV1() {
		ioList = new ArrayList<ioListVO>();
		fileName = "src/com/callor/iolist/애입매출데이터.txt";
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				if(reader==null) {
					break;
				}
				String[] product = reader.split(",");
				ioListVO iovo = new ioListVO(product[0],
						product[4],product[5],product[6],
						product[7],
						Integer.valueOf(product[8]),
						Integer.valueOf(product[9]),
						Integer.valueOf(product[10]));
				
				ioList.add(iovo);
				System.out.println(iovo);
				
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일이 없습니다");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(fileName + "파일을 읽는동안 문제발생..");
		}
		
	}

	@Override
	public void multiple() {
	
		ioList = new ArrayList<ioListVO>();
		
		this.read();
		// TODO Auto-generated method stub
		
		int priceSum=0;
		int salesSum=0;

		if(intDivi ==1) {
			
		}
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("=======================================================================");
		System.out.println("거래일자\t거래처명\t상품명\t매입금액\t판매금액");
		System.out.println("------------------------------------------------------------------------");
		
		
	}

}
