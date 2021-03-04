package com.callor.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.CartVO;
import com.callor.shop.CartVOT;
/*
 * CartServiceImplV1T을 extends(확장), 상속받아 V2를 생성함.
 */
import com.callor.shop.service.CartServiceV2;

public class CartServiceImplV2 extends CartServiceImplV1T implements CartServiceV2 {
	/*
	 * CartServiceImplV2는 인스턴스 객체와,
	 * 생성자만 있는 상태이다.
	 */
	
	private final Scanner scan;
	// implV1 의 리스트를 protected해줌.
	// private List<CartVOT> cartList;
	private String cartFileName;
	
	public CartServiceImplV2() {
		scan =new Scanner(System.in);
		cartList = new ArrayList<CartVOT>();
		// 파일명을 txt에서 csv로 변경해주었다.
		cartFileName = "src/com/callor/shop/cartlist.csv";
	}
	
	/*
	 * cartList에 저장된 상품리스트를 
	 * "..../cartlist.txt"파일에 저장
	 * 
	 * 어떤 데이터를 파일에 저장하기..
	 * 1. 파일이름(경로 포함)을 결정하고,(com/callor/shop/cartlist.txt) 
	 * 2. 파일을 생성한다.
	 * 3. 모든 데이터를 문자열로 만들고
	 * 4. 파일에 기록한다.
	 * 5. 파일연결을 정상적으로 종료한다.
	 */

	@Override
	public void saveCartToFile() {
		
		// 1. 데이터를 저장할 파일생성을 한다.
		// FileWriter 클래스를 사용하여 객체선언한다.
		FileWriter fileWriter = null;
		// 2. FileWriter에 데이터를 전송하기 위하여
		// PrintWriter 클래스를 사용하여 객체선언한다.
		PrintWriter printer = null;
		
		/* 3. FileWriter 객체를 생성하면서 
		 *		데이터를 저장할 파일 정보를 전달한다.
		 *	=> 운영체제와 통신을 하여 파일에 저장할 준비를 한다.
		 * 		이때, 운영체제와 통신을 시작하는
		 * 		아주 짧은 시간동안, 
		 * 		생성하고자 하는 파일의 각종 정보들에
		 * 		문제가 발생하여, exception이 발생할수 있다.
		 * 
		 * 		아무리 코드를 견고하게 작성하여도
		 * 		이 exception은 완전하게 피할수 없다..!
		 * 
		 * 		Java에서는 이처럼 도저히 완전하게
		 * 		exception을 피할수 없는 경우는
		 * 		코드를 반드시 try 예외처리를 하도록 강제한다.
		 * 
		 * 		따라서, FileWriter 객체를 생성할때는
		 * 		반드시 try-catch문으로 묶어야 한다.
		 */
		try {
			fileWriter = new FileWriter(cartFileName);
			// 여기까지 코드가 정상 수행되면
			// fileWriter는 System.in 처럼 파일과 
			// Java코드간에 연결하는 통로를 형성한다.
			
			/*
			 * 4. fileWriter 객체를 전달하면서,
			 * 		PrintWriter 객체를 생성한다.
			 */
			printer = new PrintWriter(fileWriter);
			
			// 여기까지는 운영체제가 잠시 보관하고만 있는상태
			//printer.println("대한민국");
			//printer.println("우리나라");
			//printer.println("Republic of Korea");
			
			int nSize = cartList.size();
			System.out.println(nSize);
			for(int i = 0; i< nSize; i++) {
				CartVOT cartVO = cartList.get(i);
				// 콜론(:) 에서 컴마(,)로 변경함. (txt->csv)
				printer.printf("%s,%s,%d,%d,%d\n",
						cartVO.getUserName(),
						cartVO.getProductName(),
						cartVO.getQty(),
						cartVO.getPrice(),
						cartVO.getTotal());
				
			}
			
			// 이것(close)을 안하면 실제파일에는 기록에 남지 않는다.
			printer.close();
			fileWriter.close();
			System.out.println("파일저장 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void loadCartFromFile() {
		// TODO Auto-generated method stub
		
	}
	

}
