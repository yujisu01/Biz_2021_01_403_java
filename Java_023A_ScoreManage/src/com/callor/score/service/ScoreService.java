package com.callor.score.service;

/*
 * ScoreService 인터페이스
 * 
 * 성적처리 할때 
 * 가장 많이 사용되는 클래스정의
 * 주 업무처리 클래스정의
 * 
 * 1.학생 성적입력
 * 2.학생 성적 파일에 저장
 * 3.파일을 잃어서 성적 결과 출력.
 * 
 * 4.랜덤클래스를 이용하여 가상의 점수를 만들자.
 */
public interface ScoreService {
	
	public void inputScroe();
	public void makeScore();
	public void saveScoreToFile();
	public void loadScoreFromFile();
	
	public void printScore();
	

}
