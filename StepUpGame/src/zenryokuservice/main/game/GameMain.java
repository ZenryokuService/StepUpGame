/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package zenryokuservice.main.game;

import zenryokuservice.main.game.stepup.TextRpgGame;

/**
 * @author takunoji
 *
 * 2020/06/11
 */
public class GameMain {
	public static void main(String[] args) {
		// ゲームクラス
		TextRpgGame main = new TextRpgGame();
		// 初期処理
		main.init();
		while (true) {
			// 入力受付
			String in = main.input();
			if ("bye".equals(in)) {
				break;
			}
			// データの更新
			if (main.update(in)) {
				// 画面の描画
				main.render();
			}
		}
	}
}
