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
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;
/*
 *Service클래스 코드순서
 *
 * 1. 입력한 데이터를 담아둘 List 객체 선언및 생성
 * 2. 데이터를 입력또는 생성하여 List에 담아두기
 * 
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	private String fileName;
	private List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";
	}

	@Override
	public void inputScroe() {
		// 다른곳에서 쓸것같으면 이 스캔문만 옮기면 된다.
		Scanner scan = new Scanner(System.in);
		
	}
	/*
	 * Random클래스를 사용하여 점수생성하기
	 * 		makeScore() 에서만 사용할 것이므로,
	 * 		makeScore() 메소드 내에서 생성한다.
	 */
	@Override
	public void makeScore() {
		// TODO Random성적표 생성
		
		// makeScore()는 호출될때마다 20개씩 데이터를 생성하여 추가한다.
		// 이전에 저장된 데이터가 있더라도,
		// 계속 추가된다.
		
		/*
		 * list.remove(위치주소)
		 * list에 담긴 특정위치의 항목을 삭제함
		 * 
		 * list.removeAll(다른리스트)
		 * list에 담긴 데이터중 다른리스트에 포함된
		 * 데이터들을 모두 삭제하라
		 * 
		 * 트릭을 사용한다.
		 * scoreList에 담긴 데이터들중에서 
		 * 자신의 데이터와 일치하는 값들 모두를 삭제하라
		 */
		scoreList.removeAll(scoreList);
		
		Random rnd = new Random();
		
		for(int i = 0 ; i< 20 ; i++) {
			ScoreVO scoreVO = new ScoreVO();
			
			/*
			 * i값(여기서는 5)에 따라서 
			 * 0 0 0 0 1 ~ 0 0 0 2 0 까지 문자열을 생성한다.
			 * 그후 strNum에 저장한다
			 * (순서대로 학번을 만들어서 부여한 코드.)
			 * 
			 * 보기싫다-> 2021%03d로 수정. (학번만들기)
			 * 2021은 그문자 그대로 보여주기
			 * 뒤의 %03d 은 i+1값을 가지고 %03d의 패턴으로 만들어달라는 것
			 */
			String strNum = String.format("2021%03d", i+1);
			scoreVO.setStNum(strNum);
			
			// 한줄로 다 작성하는 코드
			scoreVO.setKor(rnd.nextInt(100) + 1);
			
			// 변수생성해서 만든 코드 
			int intEng = rnd.nextInt(100)+1;
			scoreVO.setEng(intEng);
			
			int intMath = rnd.nextInt(100)+1;
			scoreVO.setMath(intMath);
			
			int intMusic = rnd.nextInt(100)+1;
			scoreVO.setMusic(intMusic);
			
			int intHistory = rnd.nextInt(100)+1;
			scoreVO.setHistory(intHistory);
			
			// scoreList에 과목점수 추가하기
			scoreList.add(scoreVO);
			
		}// end for
		
		// 잘 작성됐는지 확인하는 검사코드 (toString이용)
		// for(ScoreVO vo : scoreList) {
			// System.out.println(vo.toString());
		}
		
	

	@Override
	public void saveScoreToFile() {
		
		
		// 객체이름 명명 
		// 객체이름은 보통 클래스이름의 첫글자를 소문자로하여
		// 클래스이름을 모두 사용한다 (일반적인 방식)
		FileWriter fileWriter = null; 	// 예를들어 fw로 하면 헷갈린다 
		PrintWriter printer = null;	// 얘는 그래도 프린터로 할것이다
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			// socreList에 담긴 데이터를 파일로 출력해야 한다.
			
			// 한 학생의 데이터 완료
			for(ScoreVO vo : scoreList) {
				
				printer.print(vo.getStNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + ":");
				printer.print(vo.getHistory() + "\n");
			}
			// 프린터와 flieWriter 닫기
			printer.close();
			fileWriter.close();
			System.out.println("파일저장 성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일생성중 문제발생!!!");
		}
		
	}

	/*
	 * 성적이 저장되어있는 score.txt파일을 읽어서
	 * 성적정보를 scoreList에 담는 메서드이다.
	 */
	@Override
	public void loadScoreFromFile() {
		// TODO Auto-generated method stub
		
		// 기존에 저장되어 있던 리스트를 모두 제거하자
		// scoreList = new ArrayList<ScoreVO>() 이거랑 똑같음 (초기화하는거)
		scoreList.removeAll(scoreList);
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				if(reader ==null) {
					break;
				}
				// 읽어들인 문자열을 콜론(:)을 기준으로
				// 잘라서, 배열로 만들어달라
				// 그배열을 scores[]라는 배열에 담아라
				String scores[] = reader.split(":");
				// 필드생성자를 호출하여, 
				// 인스턴스 변수에 저장할 값을 전달하면서
				// 동시에 객체를 초기화(생성) 
				// 메서드의 매개변수 순서와 같아야 한다. 
				
				// score[0]에는 Integer.valueof없음
				// 만약 Integer를 넣으면, 오류가 생김
				// (문자열인데 정수값을 전달하니까 거부함, 오류메시지 꼭보기)
				ScoreVO vo = new ScoreVO(scores[0], // 바로문자열 추가
					Integer.valueOf(scores[1]),
					Integer.valueOf(scores[2]),
					Integer.valueOf(scores[3]),
					Integer.valueOf(scores[4]),
					Integer.valueOf(scores[5])
					);
				
				scoreList.add(vo);
					
			}
			buffer.close();
			fileReader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일을 읽는동안 문제발생");
		}
		// 파일을 읽어들이고 바로 출력가능
		// catch문 뒤에 사용해도된다. (close뒤에 사용해도 된다)
		this.printScore(); 
		
	}

	private void totalAndAvg() {
		// scoreList데이터 하나만 가지고 처리하고있는중이다 (공유중)
		for(ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum/5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
	}
	// 순위 메기기
	private void rankSet() {
		
		// List를 내림차순 정렬
		int nSize = scoreList.size();
		
		for(int i = 0 ; i< nSize; i++) {
			for(int j = i+1 ; j < nSize ; j++) {
				
				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
					ScoreVO tVO = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, tVO);
				}
			}
		}
		for(int i =0; i< nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			vo.setRank(i+1);
		}
		// 학번순으로 정렬 (동점자 처리 안한상태)
		// 학번을 숫자로 변경한후 정렬한것.
		for(int i = 0; i< nSize; i++) {
			for(int j = i+1; j<nSize ; j++) {
				// 그대로 if문으로 사용하면 오류가 뜬다 (문자열이라서)
				// Integer로 형변환시켜주기
				
				int num1 = Integer.valueOf(scoreList.get(i).getStNum());
				int num2 = Integer.valueOf(scoreList.get(j).getStNum());
				if(num1> num2) {
					ScoreVO temp = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, temp);
				}
			}
		}//for end
		// 문자열 비교메서드를 사용하여 정렬해보는것
		for(int i = 0 ; i<nSize; i++) {
			for(int j = i+1 ;j<nSize; j++) {
				
				ScoreVO voI = scoreList.get(i);
				ScoreVO voJ = scoreList.get(j);
				
				// voI의 학번이 뒷번호인경우 (I와 J를 바꾸어라 그렇지 않으면 무시) 
				// 학번에 문자열이 들어가있을경우 어쩔수없이
				// 이런방법을 사용해줘야 한다.
				if(voI.getStNum().compareTo(voJ.getStNum())> 0) {
					ScoreVO tVo = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, tVo);
				}
			}
		}
	}
	@Override
	public void printScore() {
		// 출력하기전에 총점 평균계산 
		this.totalAndAvg();
		
		// 출력하기전에 순위 생성
		this.rankSet();
		
		System.out.println(Values.dLine);
		System.out.println("\t빛나라 고교 성적처리 시스템");
		System.out.println(Values.dLine);
		System.out.println("학번\t국어\t영어\t수학\t음악\t국사\t총점\t평균\t석차");
		System.out.println(Values.sLine);
		
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
		
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg() , "\t");
			
			System.out.print(vo.getRank() + "\n");
		}
		System.out.println(Values.dLine);
		
	}

}
