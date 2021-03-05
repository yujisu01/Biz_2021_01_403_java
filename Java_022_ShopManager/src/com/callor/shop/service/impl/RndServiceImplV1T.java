package com.callor.shop.service.impl;

// 선생님이 하신거
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1T {

	// makeRnd()와 saveFileRnd() 메서드가 공용으로 사용할 객체이므로
	// 인스턴스객체 변수로 선언한다.
	private List<Integer> intList;

	public RndServiceImplV1T() {
		intList = new ArrayList<Integer>();
	}

	// Random수를 생성하여 리스트에 담을 메소드
	public void makeRnd() {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);

		}
	}
	/*
	 * 객체지향의 (메서드)다형성
	 * 
	 * 원칙은 한 클래스 파일내에서는 같은 이름의 메서드를 
	 * 두번이상 정의할 수 없다.
	 * 
	 * 하지만 객체지향 언어에서는 
	 * 메서드의 매개변수의 유무, 또는 갯수, 타입이 다르면
	 * 같은 이름의 메서드를 중복하여 정의할수 있다.
	 * (=중복정의)
	 * 
	 *  이를 '다형성(OverLoading)' 이라고 한다.
	 * 
	 */
	public void saveFileRnd() {
		String fileName = "src/com/callor/shop/files/numsRnd.txt";
		this.saveFileRnd(fileName);
	}
	/*
	 * RndServiceImplV1 클래스를 처음 디자인할때는 
	 * 파일의 이름을 코드에 직접 작성하였다.
	 * 이후, 필요에 의해 파일의 이름을 
	 * 메서드의 매개변수로 받아서 사용할수 있도록 
	 * 변경을 했다.
	 * 
	 * 그랬더니 처음 V1클래스를 호출하여 만들었던 코드들에서
	 * 오류가 발생해버렸다.
	 * 이 오류를 객체지향의 다형성 논리를 이용하여 
	 * 해결하였다.
	 * 
	 * 만약 saveFileRnd() 라고 메서드를 호출하면 
	 * 코드에 포함된 파일이름을 적용하여 
	 * saveFileRnd(파일이름) 메서드를 호출하도록 만들었다.
	 * 
	 * 이제는 saveFileRnd(), saveFileRnd(파일이름)
	 * 두가지중 어떤것이든 호출하여 사용해도 문제가 없어졌다.
	 */
	
	// List에 담긴 숫자들을 파일에 저장하는 메소드
	public void saveFileRnd(String fileName) {

		//String fileName = "src/com/callor/shop/files/numsRnd.txt";
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

}
