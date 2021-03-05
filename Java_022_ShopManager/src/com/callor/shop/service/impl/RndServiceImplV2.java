package com.callor.shop.service.impl;

// 선생님이 하신거
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {

	// makeRnd()와 saveFileRnd() 메서드가 공용으로 사용할 객체이므로
	// 인스턴스객체 변수로 선언한다.
	private List<Integer> intList;
	private String fileName;
	
	// 매개변수 없는 생성자
	/*
	 * 매개변수가 없는 생성자와 
	 * 파일이름을 매개변수로 전달받아야 하는 생성자를 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면
	 * 		(= new RndServiceImplV2() 라고 하면)
	 * 파일이름을 
	 * 매개변수를 전달하면서 다시
	 * 매개변수가 있는 생성자를 호출한다. 
	 */
	public RndServiceImplV2() {
		this("src/com/callor/shop/files/numsRnd.txt");
	}
	
	// 매개변수 있는 생성자(String fileName)
	/*
	 * 매개변수가 있는 생성자는 객체를 생성할때 
	 * 반드시 파일이름을 전달받아야만 한다.
	 * 		(=new RndServiceImplV2(파일이름); 이렇게 받아야함.
	 */
	public RndServiceImplV2(String fileName) {
		intList = new ArrayList<Integer>();
		this.fileName = fileName;
	}

	// Random수를 생성하여 리스트에 담을 메소드
	public void makeRnd() {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);

		}
	}
	public void saveFileRnd() {
		
		this.saveFileRnd("src/com/callor/shop/files/nums_rnd.txt");
	}
	// List에 담긴 숫자들을 파일에 저장하는 메소드
	// 저장할 파일 이름을 코드에 포함하지 않고
	// saveFileRnd() 메서드를 호출하는 곳에서 
	// 파일이름을 전달해주도록 코드를 변경한다.
	public void saveFileRnd(String fileName) {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nCount = 0;
			for (Integer n : intList) {
				printer.print(n + ":");

				if (++nCount % 5 == 0) {
					printer.println();
				}
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일저장완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 파일 읽는 메서드.
	 */
	public void loadFileRnd() {
		
	}
}

	