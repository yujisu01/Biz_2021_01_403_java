package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList;
	private List<String> scoreLines;

// 생성자메서드

	public ScoreServiceImplV1() {

		fileName = "src/com/callor/score/service/rndScore.txt";
		scoreList = new ArrayList<ScoreVO>();
		scoreLines = new ArrayList<String>();
	}

	// 랜덤값을 리스트에 생성
	@Override
	public void makeScore() {

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {

			ScoreVO scorevo = new ScoreVO();
			scorevo.setKor(rnd.nextInt(100) + 1);
			scorevo.setEng(rnd.nextInt(100) + 1);
			scorevo.setMath(rnd.nextInt(100) + 1);
			scorevo.setMusic(rnd.nextInt(100) + 1);
			scorevo.setHistory(rnd.nextInt(100) + 1);
			scoreList.add(scorevo);
			
			System.out.println(scorevo);

		}

//scoreString = new ArrayList<String>();

	}

// 랜덤값을 리스트에 저장

	@Override

	public void saveScoreToFile() {
		FileWriter fileWriter;
		PrintWriter printWriter;

		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				ScoreVO scorevo = scoreList.get(i);

				printWriter.print(scoreList.get(i).getKor()+ ":");
				printWriter.print(scoreList.get(i).getEng()+ ":");
				printWriter.print(scoreList.get(i).getMath()+ ":");
				printWriter.print(scoreList.get(i).getMusic()+ ":");
				printWriter.print(scoreList.get(i).getHistory()+ ":");
			}
			printWriter.close();
			fileWriter.close();

		} catch (Exception e) {
		}
		// scoreString = new ArrayList<String>();
		System.out.println(scoreList);
		System.out.println("***저장완료****");
	}

	// 성적결과 확인
	@Override
	public void loadScoreFromFile() {
		//scoreList = new ArrayList<ScoreVO>();
		//scoreLines = new ArrayList<String>();
	
		FileReader filereader = null;
		BufferedReader buffer = null;

		try {
			filereader = new FileReader(fileName);
			buffer = new BufferedReader(filereader);

			while (true) {
				String str = buffer.readLine();

				if (str == null) {
					break;
				}
				scoreLines.add(str);
			}
			filereader.close();
			buffer.close();
		} catch (Exception e) {

		}//파일읽기종료
		
		for (String str : scoreLines) {
			ScoreVO scorevo = new ScoreVO();
			String[] scores = str.split(":");
			scorevo.setKor(Integer.valueOf(scores[0]));
			scorevo.setEng(Integer.valueOf(scores[1]));
			scorevo.setMath(Integer.valueOf(scores[2]));
			scorevo.setMusic(Integer.valueOf(scores[3]));
			scorevo.setHistory(Integer.valueOf(scores[4]));
			
			scoreList.add(scorevo);	
			System.out.println("확인:" + scorevo);
		}
		
		for(ScoreVO scorevo : scoreList) {
			int sum = scorevo.getKor();
			sum += scorevo.getEng();
			sum += scorevo.getMath();
			sum += scorevo.getMusic();
			sum += scorevo.getHistory();
			
			float avg = (float) sum / 5;
			scorevo.setTotal(sum);
			scorevo.setAvg(avg);
		}

		System.out.println(Values.dLine);
		System.out.println("번호\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		
		for (int i = 1; i < scoreList.size(); i++) {
			System.out.print(i +"번"  + "\t");
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\t");
			System.out.print(scoreList.get(i).getMusic() + "\t");
			System.out.print(scoreList.get(i).getHistory() + "\t");
			System.out.print(scoreList.get(i).getTotal() + "\t");
			System.out.print(scoreList.get(i).getAvg() + "\n");
		

		}	System.out.println(Values.dLine);
	}

}