package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {
	/*
	 * 클래스 영역에 변수를 선언하는것은 
	 * 현재 클래스가 포함하고 있는 모든 메서드들이 변수를 공유하여
	 * 코드를 수행하게 하려는 의도이다. 
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에
	 * 선언된 클래스 영역 변수를 "인스턴스 변수" 라고 한다. 
	 * 
	 * 인스턴스 변수는 GC(Garbage Collection)에 의해
	 * 메모리 관리가 자동으로 이뤄진다. 
	 * 
	 * static method에서 필요한 변수들은 
	 * 변수를 선언할때 
	 * static 키워드를 추가하여 static 변수로 만들어야 한다.
	 * 
	 * static변수는 GC가 접근하지 못한다!!
	 * 
	 * 프로젝트가 시작될때 만들어지고, 계속 존재하는 상태이다.
	 * 프로젝트가 시작될때 클래스가 자동으로 만들어지고, 
	 * 이때 static변수들도 자동으로 생성된다.
	 * 
	 * 클래스가 생성될때 같이 만들어진다는 의미로
	 * static 키워드가 부착된 변수를 "클래스변수"라고 한다..
	 * 
	 * static변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	 * 
	 * 다만 static 생성자를 만들어서 별도로 생성을 하는 경우도 있다.
	 * 
	 * 
	 */
	private static List<Integer> intList = new ArrayList<Integer>();
	private static String numsFile = "src/com/callor/shop/files/nums.txt";
	
	// 생성자는 이렇게만드는데 별로 쓰지않는다.(위에는 선언만 해놓은상태 라면)
	
	/* static {
	*	numsFile = "src/com/callor/shop/files/nums.txt";
	*	intList = new ArrayList<Integer>();
	}
	*/
	/*
	 * main() 메서드와 같은 클래스내에 있는
	 * 다른 메서드를 호출하여 코드를 수행할경우
	 * 메인메서드의 호출을받는 메서드들은 모두
	 * 	'static'으로 선언되어야 한다.
	 * 
	 * 메인메서드와 static으로 선언된 메서드 들이 
	 * 		클래스영역(main위)에 선언된 변수를 공유하려면 
	 * 		클래스 영역에 선언된 변수들도 모두 
	 * 		static으로 선언되어야 한다.
	 */

	public static void main(String[] args) {

		/*
		 * 1. static으로 선언된 method 내에서는 
		 * 같은 클래스의 다른 메서드를 this.method() 
		 * 형식으로 호출하지 못한다.
		 */
		makeNums();
		saveFileNums();

	}// end main()

	private static void makeNums() {

		Random rnd = new Random();

		// 리스트를 만들어서 Random수를 저장하기.

		for (int i = 0; i < 100; i++) {
			// 1번코드
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
			// 2번코드 (둘다 똑같음) 변수의 유무 차이
			intList.add(rnd.nextInt(1000) + 1);
		}

	}

	private static void saveFileNums() {
		FileWriter filewriter = null;
		PrintWriter printer = null;

		try {
			filewriter = new FileWriter(numsFile);
			printer = new PrintWriter(filewriter);

			// intList에 담긴 전체리스트를
			// 향상된 for반복문으로 반복하면서 파일에 출력
			for (Integer n : intList) {
				printer.println(n);

			}

			// 표준형 for로 반복하면서 파일에 출력
			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}
			printer.close();
			filewriter.close();
			System.out.println("Mission Complete!!");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
