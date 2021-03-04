package com.callor.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.CartVOT;
import com.callor.shop.service.CartServiceT;
import com.callor.shop.values.Values;

public class CartServiceImplV1T implements CartServiceT {
	/*
	 * ImplV1에서 inputCart() 메서드를 사용하여 
	 * cartList의 상품리스트를 추가하고
	 * 
	 * ImplV1을 상속받은 ImplV2의 
	 * 	새로운 save...()메서드에서 
	 * 	cartList에 저장된 데이터를 사용하려고 시도했다..
	 * 
	 * 이러한 경우에는 private으로 선언된 변수(또는 객체)는 
	 * 서로 공유가 되지 않는다.
	 * 상속받은 클래스의 메서드에서 변수(또는객체)를 
	 * 서로 공유 하려면, 
	 * 부모클래스에서 변수(객체)를 반드시 protected로 선언해줘야 한다..
	 * 
	 * 또한 상속받은 클래스에서는 해당 변수(객체)를 
	 * 선언 해서는 안된다.
	 * 
	 */
	protected List<CartVOT> cartList;
	private final Scanner scan;

	public CartServiceImplV1T() {
		
		cartList = new ArrayList<CartVOT>();
		scan = new Scanner(System.in);
	}

	@Override
	// TODO는 책갈피 역할을한다. 오른쪽의 파란사각형을 클릭하면
	// 해당 TODO가 있는곳으로 점프하게 된다.
	public void inputCart() {
		// TODO 카트추가 하기
		System.out.println(Values.dLine);
		System.out.println("장바구니 추가");
		System.out.println(Values.sLine);

		System.out.print("구매자 이름을 입력하세요>>");
		String strUserName = scan.nextLine();
		System.out.print("추가할 상품 이름을 입력하세요>>");
		String strProductName = scan.nextLine();
		System.out.println("추가할 상품의 구매수량을 입력하세요");

		Integer intQty = 0;
		while (true) {
			System.out.print(">>");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.decode(strQty);
			} catch (Exception e) {
				System.out.println("[수량은 숫자로만 입력하세요]");
			}
			if (intQty < 1) {
				System.out.println("[수량은 1이상 입력하세요]");
			} else {
				break;
			}
		}

		Integer intPrice = 0;
		while (true) {
			System.out.print("가격입력>>");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.decode(strPrice);
			} catch (Exception e) {
				System.out.println("[가격은 숫자로만 입력하세요]");
			}
			if (intPrice < 100) {
				System.out.println("[가격은 100원이상 입력하세요]");
			} else {
				break;
			}
		}
		Integer intTotal = intPrice * intQty;
		
		CartVOT cartvo = new CartVOT();
		cartvo.setUserName(strUserName);
		cartvo.setProductName(strProductName);
		cartvo.setQty(intQty);
		cartvo.setPrice(intPrice);
		cartvo.setTotal(intTotal);
		
		//확인사살 코드
		System.out.println(Values.dLine);
		System.out.println("입력한 상품");
		System.out.println(Values.sLine);
		System.out.printf("구매자 : %s\n", cartvo.getUserName());
		System.out.printf("상품명 : %s\n", cartvo.getProductName());
		System.out.printf("수량 : %d\n", cartvo.getQty());
		System.out.printf("단가 : %d\n", cartvo.getPrice());
		System.out.printf("합계 : %d\n", cartvo.getTotal());
		System.out.println(Values.dLine);
		System.out.println("추가할까요? (YES)?");
		String strYesNo = scan.nextLine();
		
		if(strYesNo.equals("YES")) {
			cartList.add(cartvo);
			System.out.println("저장완료!");
			
		}else {
			System.out.println("저장취소!");
		}
		//cartList.add(cartvo);
	}

	/*
	 * private으로 선언된 메서드는
	 * 현재 클래스에서만 호출이 가능한 method이다.
	 * 머릿글
	 */
	private void printHeader() {
		System.out.println(Values.dLine);
		System.out.println("구매자\t상품명\t단가\t수량\t금액");
		System.out.println(Values.sLine);
	}
	//cartVO를 매개변수로 받아서 오류를 없애줬다.
	private void printBody(CartVOT cartvo) {
		// cartVO에서 각 인스턴스 변수를 읽어서 출력.
				System.out.print(cartvo.getUserName() + "\t");		// print문이나
				System.out.print(cartvo.getProductName() + "\t");	// printf문 둘다 가능
				System.out.print(cartvo.getQty() + "\t");
				System.out.print(cartvo.getPrice() + "\t");
				System.out.print(cartvo.getTotal() + "\n");
	}
	@Override
	public void printAllCart() {
		
		this.printHeader();
		
		// 카트리스트의 상품갯수를 계산하여 nSize변수에 저장
		int nSize = cartList.size();
		for(int i = 0 ; i< nSize; i++) {
			/*
			 * cartList.get(i)는
			 * cartList에 저장되어있는 i번째 요소이다.
			 * 이 요소는 결국 cartVO클래스로 만든 객체인것이다
			 */
			//System.out.print(cartList.get(i).getUserName() + "\t");
			//System.out.print(cartList.get(i).getProductName() + "\t");
			/*
			 * cartList의 i번째 요소를 getter하여,
			 * 임시(for()명령내에 있기때문에) 선언된
			 * cartVO객체에 저장하라
			 */
			CartVOT cartvo = cartList.get(i);
			this.printBody(cartvo);
			
			
		}
		System.out.println(Values.sLine);

	}

	@Override
	public void printUserCart() {
		// TODO 구매자별 장바구니 보기
		System.out.println(Values.dLine);
		System.out.println("구매자별 리스트");
		System.out.print("구매자명>>");
		String strUserName = scan.nextLine();
		
		this.printHeader();
		int nSize = cartList.size();
		for(int i = 0; i< nSize; i++) {
			CartVOT cartvo = cartList.get(i);
			if(cartvo.getUserName().equals(strUserName)) {
			this.printBody(cartvo);
			}
		}

	}

}
