package com.callor.score;

import com.callor.menu.MenuServiceImplV1;
import com.callor.menu.ScoreServiceImplV01;
import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;


public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		
		MenuService mSer = new MenuServiceImplV1();
		ScoreService cSer = new ScoreServiceImplV01();
		
		while(true) {
			Integer menuItem = mSer.selectMenu();
			if(menuItem ==null) {
				break;
			}else if (menuItem.equals("1")) {
				cSer.makeScore();
			}else if(menuItem.equals("2")) {
				cSer.saveScoreToFile();
			}else if(menuItem.equals("3")) {
				cSer.loadScoreFromFile();
			}
		}System.out.println("종료");
	}

}
