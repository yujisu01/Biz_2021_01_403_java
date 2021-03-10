package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	private String fileName;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/data/score.txt";

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("\t성적 입력란");
		System.out.println("-------------------------------------");
		for (int i = 0; i < 2; i++) {
			ScoreVO scoreVO = new ScoreVO();
			System.out.print("학번('00000n'으로 입력해주세요):");
			String strNum = scan.nextLine();

			boolean bYesSearch = false;
			for (ScoreVO scoreVO1 : scoreList) {
				if (strNum.equals(scoreVO1.getStNum())) {
					bYesSearch = true;
					System.out.println("**동일 학번 입력불가!!!**");
					break;
				}{
					
				}
			}

			System.out.print("국어점수 입력:");
			String strKor = scan.nextLine();
			
			int intKor = Integer.valueOf(strKor);
			try {
				intKor = Integer.valueOf(strKor);
				if (intKor >= 0 && intKor <= 100) {

				} else {
					System.out.println("**1부터 100까지 점수만 입력하세요**");
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("영어점수 입력:");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);
			try {
				intEng = Integer.valueOf(strEng);
				if (intEng >= 0 && intEng <= 100) {

				} else {
					System.out.println("**1부터 100까지 점수만 입력하세요**");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("수학점수 입력:");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);
			try {
				intMath = Integer.valueOf(strMath);
				if (intMath >= 0 && intMath <= 100) {

				} else {
					System.out.println("**1부터 100까지 점수만 입력하세요**");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("음악점수 입력:");
			String strMusic = scan.nextLine();
			int intMusic = Integer.valueOf(strMusic);
			try {
				intMusic = Integer.valueOf(strMusic);
				if (intMusic >= 0 && intMusic <= 100) {

				} else {
					System.out.println("**1부터 100까지 점수만 입력하세요**");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			scoreVO.setStNum(strNum);
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			scoreVO.setMusic(intMusic);

			scoreList.add(scoreVO);
			System.out.println(scoreList);

		}
	}

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (ScoreVO vo : scoreList) {

				printer.print(vo.getStNum());
				printer.print(vo.getKor());
				printer.print(vo.getEng());
				printer.print(vo.getMath());
				printer.print(vo.getMusic());

			}
			printer.close();
			fileWriter.close();
			System.out.println("**파일이 저장되었습니다**");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("**파일생성중 오류가 났습니다**");
		}

	}

	@Override
	public void loadScoreFromFile() {
		// TODO Auto-generated method stub
		// scoreList.removeAll(scoreList);
		// scoreList = new ArrayList<ScoreVO>();
		// ScoreVO vo = new ScoreVO();
		fileName = "src/com/callor/score/data/score.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				System.out.println(reader);

				String[] sco = reader.split(reader);

				ScoreVO vo = new ScoreVO();

				// scoreList.add(vo);
				System.out.println(scoreList);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void totalAndAvg() {
		for (ScoreVO vo : scoreList) {

			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 5;

			vo.setTotal(sum);
			vo.setAvg(avg);

			System.out.printf("%d\t%3.2f\n", sum, avg);
		}
	}

	@Override
	public void printScore() {
		this.totalAndAvg();

		System.out.println("======================================================");
		System.out.println("\t성적일람표");
		System.out.println("------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("------------------------------------------------------");

		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getStNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\t");

		}
		// System.out.println("총점:"+vo.getTotal()+"\t");
		// System.out.printf("평균: %3.2f\t\n",vo.getAvg());
		System.out.println("======================================================");
	}

}
