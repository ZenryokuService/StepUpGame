/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package zenryokuservice.main.game.stepup;

import java.util.Scanner;

import zenryokuservice.main.game.stepup.charactors.Monster;
import zenryokuservice.main.game.stepup.charactors.Player;

/**
 * @author takunoji
 *
 * 2020/06/11
 */
public class TextRpgGame {
	/** 入力部品 */
	private Scanner scan;
	/** プレーヤー */
	private Player player;
	/** モンスター */
	private Monster monster;

	/** 初期表示を行う */
	public void init() {
		System.out.println("たくのじが現れた！");
		player = new Player(20, 10);
		monster = new Monster(10, 5);
		viewStatus(player.getHp(), player.getMp(), monster.getHp(), monster.getMp());
		
		scan = new Scanner(System.in);
	}

	/** 入力処理 */
	public String input() {
		return scan.next();
	}

	/** 入力後に行う処理 */
	public void update() {
		
	}

	/** 画面を更新する */
	public void render() {
		
	}

	private void viewStatus(int playerHp, int playerMp, int monsterHp, int monsterMp) {
		String line1 = "たたかう: 1   プレーヤー   たくのじ";
		String line2 = "ぼうぎょ: 2   HP: A1　    HP: B1";
		String line3 = "にげる　: 3   MP: A2　    MP: B2";
		// 値を入れ替える
		line2 = line2.replace("A1", String.format("%02d", playerHp)).replace("B1", String.format("%02d", monsterHp));
		line3 = line3.replace("A2", String.format("%02d", playerHp)).replace("B2", String.format("%02d", monsterHp));

		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
	}
}
