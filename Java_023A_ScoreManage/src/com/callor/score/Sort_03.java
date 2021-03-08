package com.callor.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort_03 {

	public static void main(String[] args) {

		// 배열이 아니고 List를 사용해볼것이다
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			// 1~100
			Integer num = rnd.nextInt(100) + 1;
			// 10개의 난수를 만들어서 List에 저장했다.
			intList.add(num);
		}
		// List라는 클래스에는 이미 toString이 존재한다.
		// 그래서 toString으로 출력만 하면 난수10개를 보여준다
		System.out.println(intList.toString());

		int nSize = intList.size();
		for (int i = 0; i < nSize; i++) {
			for (int j = i + 1; j < nSize; j++) {
				
				// List를 사용할때는 배열일때랑 코드가 약간 다르다.
				if (intList.get(i) > intList.get(j)) {
					Integer temp = intList.get(i);
					intList.set(i, intList.get(j));
					intList.set(j, temp);
				}
			}
		}
		System.out.println(intList.toString());

	}
}
