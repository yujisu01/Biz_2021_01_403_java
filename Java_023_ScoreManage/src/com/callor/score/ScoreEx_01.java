package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		MenuService mSer = new MenuServiceImplV1();
		ScoreService sSer = new ScoreServiceImplV1();
		
		while(true) {
			Integer menu = mSer.selectMenu();
			
			if(menu == null) {
				break;
			} else if (menu == Values.MENU_MAKE_RND) {
				sSer.makeScore();
			} else if (menu == Values.MENU_SAVE_FILE) {
				sSer.saveScoreToFile();
			} else if (menu == Values.MENU_LOAD_TO_FILE) {
				sSer.loadScoreFromFile();
			}
			
		}
		
		
	}// main end
}// class end