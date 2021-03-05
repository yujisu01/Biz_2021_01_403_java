package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {

	public static void main(String[] args) {
		
		List<String> strLines = new ArrayList<String>();

		String fileName = "src/com/callor/shop/files/numsRnd.txt";

		/*
		 * 파일을 읽을때 사용하는 클래스..(얘도 생성부 선언부 분리함)
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			
			//fileReader를 사용한 저수준의 코드이다 (지금 주석처리 한곳)
			/*
			while (true) {
				int ascii = fileReader.read();
				// ascii가 -1을 만나면 중지해라.
				if(ascii == -1) {
					break;
				}
				System.out.printf("%c\n", ascii);
			}
			 */
			buffer = new BufferedReader(fileReader);
			
			while(true) {
			String str = buffer.readLine(); 	// nextLine();
			if(str ==null) {
				break;
			}
			//System.out.println(str);
		
			strLines.add(str);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일읽기 종료
		
		for(String str : strLines) {
			// 콜론을 기준으로 분해해라
			String[] nums = str.split(":");
			System.out.printf("첫번째 숫자 : %s\n", nums[0]);
			System.out.printf("두번째 숫자 : %s\n", nums[1]);
			System.out.printf("세번째 숫자 : %s\n", nums[2]);
			System.out.printf("네번째 숫자 : %s\n", nums[3]);
			System.out.printf("다섯번째 숫자 : %s\n", nums[4]);
			System.out.println(Values.sLine);
			
			int sum = Integer.valueOf(nums[0]);
			sum+= Integer.valueOf(nums[1]);
			sum+= Integer.valueOf(nums[2]);
			sum+= Integer.valueOf(nums[3]);
			sum+= Integer.valueOf(nums[4]);
			System.out.println("합계: " + sum);
			System.out.println(Values.dLine);
			
		}
		
		
		
	}

}
