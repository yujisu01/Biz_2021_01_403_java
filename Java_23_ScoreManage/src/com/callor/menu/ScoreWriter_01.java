package com.callor.menu;

public class ScoreWriter_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/menu/scoreRnd.txt";
		
		ScoreServiceImplV01 ssV1 = new ScoreServiceImplV01();
		ssV1.makeScore();
		ssV1.saveScoreToFile(fileName);
		ssV1.loadScoreFromFile();
		
	}

}
