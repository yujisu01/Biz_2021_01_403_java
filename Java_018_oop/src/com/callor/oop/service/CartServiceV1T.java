package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
/*
 * Service 클래스
 * main() 메서드에서 구현한 코드들을 별도의 클래스로 분리하고
 * 작은 메서드 단위로 코드를 작성하여
 * 전체적으로 단위코드가 작아지도록 하기위한 기법
 * 
 * 메인메서드가 커지면 이후에 유지보수(업그레이드, 오류정정)가
 * 어려우므로 단위코드를 작게 만들었다.
 */
public class CartServiceV1T {
	/*
	 * inputCart() 메서드에서 계속 사용할 Scanner메소드를 
	 * 인스턴스 영역으로 이동했다.
	 * 
	 * 인스턴스 영역에 선언된 객체들은 
	 * 특별한 경우가 아니면, 
	 * private으로 일단 선언한다.
	 */
	private Scanner scan = new Scanner(System.in);
	private List<CartVO> cartlist = new ArrayList<CartVO>();
	/*
	 * 사용자로부터 키보드로 상품정보를 입력받아,
	 * 카트 리스트에 추가하는 코드
	 */
	public void inputCart() {
		/*
		 * Scanner, File, Network 이러한 클래스들은
		 * 운영체제와 연동하여, 
		 * 컴퓨터 자체의 자원(Resource)을 사용하게 된다.
		 * 컴퓨터 자체의 자원(Resource)은 유한하기 때문에
		 * 자원을 무턱대고 열고, 사용만 해서는 안된다.
		 * 자원을 사용하기 위해서는 선언을 한후에
		 * 사용이 끝나면 반드시 반납(close)해줘야 한다.
		 * 그래야만 Application이 실행되는 과정에서
		 * 자원의 누수(leak)가 발생하지 않는다.
		 * 
		 * 여기(inputCart() Method)는 사용방법에 따라서
		 * 수회 반복적으로 호출이 될 것이다.
		 * 그 반복적으로 호출되는 동안, Scanner가
		 * 열리고(연결) 닫히는 과정이 계속 반복된다.
		 * 
		 * 자원(Resource)을 열고 닫는 과정에서
		 * 실제 컴퓨터,운영체제,어플리케이션 입장에서는
		 * 상당히 많은 일을 수행해야 한다.
		 * 이러한 과정은 어플리케이션의 성능을 저하시킨다.
		 * 
		 * 그래서, Scanner를 method() 내부에서 선언하지 않고, 
		 * 클래스의 인스턴스 영역으로 보내는 것이다.
		 */
		
		// Scanner scan = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("\t빛나라 쇼핑몰 카트시스템");
		System.out.println("------------------------------------------");
		
		System.out.print("구매자 이름 입력: ");
		String strName = scan.nextLine();
		
		scan.close();
		
	}
	public void printCart() {
		
	}

}
