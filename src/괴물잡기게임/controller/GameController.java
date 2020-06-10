package ����������.controller;

import ����������.model.vo.Monster;
import ����������.model.vo.Player;
import ����������.views.Playerinfo;

public class GameController {
	private Player player;
	
	public GameController(Player player) {
		this.player = player;
	}
	
	public void displayPlayerinfo() {
		new Playerinfo(player).displayInformation();
	}
	
	public void attack(Monster monster) {
		while(monster.isAlive()) {
			monster.lossHp(player.getAttackPower());
		}
		
		checkAlive(monster);
		checkPlayerLevelUp();
		
	}
	
	private void checkAlive(Monster monster) {
		if(!monster.isAlive()) {
			monster.appear();
			incrementPlayerExp(monster.getexp());
		}
	}
	
	private void incrementPlayerExp(int monsterExp) {
		player.incrementExp(monsterExp);
	}
	
	private void checkPlayerLevelUp() {
		while(player.isAvailableLevelUp()) {
			player.levelUp();
		}
	}
	
	
}
