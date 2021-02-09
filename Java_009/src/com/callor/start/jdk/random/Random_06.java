package com.callor.start.jdk.random;

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intNum = 0;

		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;

			intNum = 34;

			if (intNum < num) {
				// System.out.println(i + "번째 : " + num);
				System.out.println((i+1) + "번째에서 나타남 : " + num);
				break;

				// } else {
				// break;
			}
		}
	}

}
