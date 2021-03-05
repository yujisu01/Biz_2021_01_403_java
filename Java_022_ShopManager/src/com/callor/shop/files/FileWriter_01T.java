package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

// 그냥 FileWriter로 쓰면 안됨. 자바 객체와 충돌함.
public class FileWriter_01T {
	// 이 메인메서드가 static이기 때문에, run할수 있다.
	/*
	 * Java의 진입점 method (=메인메서드)
	 * 프로젝트를 가상머신에 의해 최초로 실행할때
	 * 가상머신이 자동으로 호출하도록 만드는 method이다.
	 * 
	 * FileWriter_01.main("....") 형식으로 호출이 될것이다..
	 * 
	 */
	public static void main(String[] args) {
		
		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 파일에 데이터를 저장하기 위해서 2개의 클래스를
		// 객체로 선언
		
		// Text파일을 생성, 저장 하기위해서 
		// FileWriter클래스와 PrintWriter클래스를 사용한다.
		// 클래스를 사용한 객체 선언과, 
		// 객체 생성부분을 분리해야 한다. 
		// 	이유는, 객체를 생성,사용할때
		// 	try-catch가 의무 적용되어야 하기 때문에
		// 	코드 작성 편의상 분리하는것이 좋다. 
		
		// 객체를 선언할때 변수를 바로 생성 하지 않을경우
		// clear를 해준다.
		// 다만 숫자형일 경우에는 0으로, (int, float)
		// 		int num = 0;
		// Class일 경우에는 null값으로 초기화를 해준다.
		//		Stirng str = "";
		//		String str = null;
		
		FileWriter filewriter = null;
		PrintWriter printer =null;
		
		// FileWriter 객체생성
		/*
		 * JVM은 운영체제와 통신을 연결시도 한다.
		 * 		이 과정에서 아무리 코드를 견고하게(오류없이)
		 * 		만들어도, 
		 * 		어쩔수없이 exception이 발생하는 상황이 많다.
		 * java코딩에서는 이러한 경우 의무적으로(강제적으로)
		 * 		예외처리 (try-catch)를 하도록 한다..
		 */
		try {
			filewriter = new FileWriter(numsFile);
			
			// filewriter를 PrintWriter와 연결
			/*
			 * filewriter만으로 파일저장을 할수 있지만,
			 * 좀더 복잡한 과정을 실행해야 한다. 
			 * filewriter를 직접사용하여 파일 저장을 하는 방식을
			 * '저수준(Low Level)방식' 이라고 한다.
			 * 
			 * 하지만 저수준 방식은 새로운 방식을 익혀야할 경우도
			 * 있기 때문에, 다소 부담스럽다.
			 * 
			 * filewriter와 printwriter를 연결하면 
			 * 평소에 많이 사용하던 system.out.println 메서드와
			 * 비슷한 방식으로 코드를 작성할수 있다.
			 * 이러한 방식을 '고수준(High Level)방식' 이라고 한다.
			 * 
			 * 저수준보다 다소 느리게 작동될수 있지만,
			 * 코드 작성에 부담이 훨씬 줄어든다.
			 * 또한, 최근의 컴퓨터는 성능이 워낙 좋아졌기 때문에
			 * 큰 차이가 나지 않는다. (핵심!)
			 */
			printer = new PrintWriter(filewriter);
			
			for(int i = 0; i < 1000 ; i++) {
				int num = rnd.nextInt(1000)+1;
				printer.println(num);
			}
			/*
			 * FileWriter와 PrintWriter등을 사용하여
			 * 파일에 내용을 기록한 후에는
			 * 반드시!!! 객체들을 close해줘야 한다.
			 * 
			 * close()를 수행하기 전까지는
			 * 기록된 데이터들을 운영체제가 임시보관하고 있다.
			 * 운영체제는 close() 명령이 수행되는 신호를 받으면
			 * 비로소 데이터를 파일에 기록한다..
			 */
			printer.close();
			filewriter.close();
			System.out.println("Mission Complete!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
