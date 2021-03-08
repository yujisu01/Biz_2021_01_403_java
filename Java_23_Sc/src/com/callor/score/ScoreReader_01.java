package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;


public class ScoreReader_01 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		//int[] num = num[20];
		
		String fileName = "src/com/callor/menu/scoreRnd.txt";
		
		FileReader fileReader =null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String str = buffer.readLine();
				if(str ==null) {
					break;
				}
				strLines.add(str);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
		}
		for(String str : strLines) {
			
			String[] scores = str.split(":");
			ScoreVO scorevo = new ScoreVO();
			
			scorevo.setKor(Integer.valueOf(scores[0]));
			scorevo.setEng(Integer.valueOf(scores[1]));
			scorevo.setMath(Integer.valueOf(scores[2]));
			scorevo.setMusic(Integer.valueOf(scores[3]));
			scorevo.setHistory(Integer.valueOf(scores[4]));
			
			scoreList.add(scorevo);
		}
		
		for(ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum /5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		System.out.println("===============================================");
		System.out.println("번호\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println("-----------------------------------------------");
		
		
		for(int i = 0 ; i < num; i++) {
		System.out.print((i+1)+ "\t");
		System.out.print(scoreList.get(i).getKor() + "\t");
		System.out.print(scoreList.get(i).getEng()+ "\t");
		System.out.print(scoreList.get(i).getMath()+ "\t");
		System.out.print(scoreList.get(i).getMusic()+ "\t");
		System.out.print(scoreList.get(i).getHistory()+ "\t");
		System.out.print(scoreList.get(i).getTotal()+ "\t");
		System.out.println(scoreList.get(i).getAvg()+ "\t");
		}
		System.out.println("===============================================");
		
		
	}

}
