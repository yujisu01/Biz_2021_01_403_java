package com.callor.score.service;

public interface ScoreService {
	public void makeScore();
	public void saveScoreToFile();
	public void loadScoreFromFile();
	void saveScoreToFile(String fileName);
	


}
