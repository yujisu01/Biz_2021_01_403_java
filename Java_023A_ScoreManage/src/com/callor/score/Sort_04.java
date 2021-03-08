package com.callor.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.values.Values;

public class Sort_04 {

	public static void main(String[] args) {
		// ScoreVO를 담을것이다
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();

		
		for (int i = 0; i < 10; i++) {
			int sum = 0;
			// subs라는 배열을 만듬 갯수는 5개
			int[] subs = new int[5];
			for (int j = 0; j < subs.length; j++) {
				subs[j] = rnd.nextInt(100) + 1;
				// sum을 위에 선언하고 총점도 구함 
				sum += subs[j];

			}
			//평균구하기
			float avg = (float)sum / 5;
			
			// 위에서 저장해준 랜덤값을 이용해서 VO를 세팅
			ScoreVO vo = new ScoreVO(String.format("%05d", i + 1), 
					Integer.valueOf(subs[0]), Integer.valueOf(subs[1]),
					Integer.valueOf(subs[2]), Integer.valueOf(subs[3]),
					Integer.valueOf(subs[4]));
			//총점 평균까지 다 List에 추가함
			vo.setTotal(sum);
			vo.setAvg(avg);

			scoreList.add(vo);
		}
		// 알아서 toString을 호출해서 출력해줌
		for(ScoreVO vo : scoreList) {
		System.out.println(vo.toString());
		
		}
		System.out.println("정렬");
		// 총점순으로 정렬하기
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize; i++) {
			for(int j = i+1 ; j < nSize; j++) {
				// 복잡하니까 빼내는과정
				ScoreVO vo_i = scoreList.get(i);
				ScoreVO vo_j = scoreList.get(j);
				
				// 통째로 서로 교환이 되는과정
				// total값을 비교하여
				// scoreList의 vo요소를 서로 교환하기 
				// i와 j의 값 헷갈리지 않기!!!! 
				if(vo_i.getTotal() < vo_j.getTotal()) {
					ScoreVO t = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, t);		// 이 자리에 i를 넣었더니 정렬이 안됐다,
				}
			}
		}
		System.out.println(Values.dLine);
		for(ScoreVO vo : scoreList) {
			System.out.println(vo.toString());
		}
		// 총점순으로 내림차순 정렬된 리스트의
		// 각 요소(Vo)의 Rank변수에 순서대로 1부터 저장
		// 순위가 설정
		for(int i = 0; i< nSize; i++) {
		scoreList.get(i).setRank(i+1);
		}
		System.out.println(Values.dLine);
		for(ScoreVO vo : scoreList) {
			System.out.println(vo.toString());
		}
	}

}
