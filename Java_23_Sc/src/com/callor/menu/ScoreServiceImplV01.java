package com.callor.menu;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV01 implements ScoreService{
	
	private List<Integer> intList;
	
	public ScoreServiceImplV01() {
		intList = new ArrayList<Integer>();
	}

	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		for (int i = 0; i < 20; i++) {
			Integer num = rnd.nextInt(100) + 1;
			
			intList.add(num);
		}
		
	}

	public void saveScoreToFile() {
		String fileName = "src/com/callor/menu/scoreRnd.txt";
		this.saveScoreToFile(fileName);
	}
	@Override
	
	public void saveScoreToFile(String fileName) {
		// TODO Auto-generated method stub
		FileWriter filewriter = null;
		PrintWriter printer = null;

		try {
			filewriter = new FileWriter(fileName);
			printer = new PrintWriter(filewriter);

			int nCount = 0;
			for (Integer n : intList) {
				printer.print(n + ":");
				if (++nCount % 5 == 0) {
					printer.println();
				}
			}

			printer.close();
			filewriter.close();
			System.out.println("파일저장완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void loadScoreFromFile() {
		// TODO Auto-generated method stub
		List<String> strLines = new ArrayList<String>();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
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
		
		for(int i = 0 ; i < scoreList.size(); i++) {
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
