package 괴물잡기게임.views;

import 괴물잡기게임.model.vo.Player;

public class Playerinfo {
	private Player player;
	
	public Playerinfo(Player player) {
		this.player = player;
	}
	
	public void displayInformation() {
		System.out.println("==========================================");
		System.out.println(player.getPlayerName() + "님의 현재 정보");
		System.out.println("==========================================");
		System.out.println("레벨 : " + player.getLevel());
		System.out.println("공격력 : " + player.getAttackPower());
		System.out.println("필요경험치 : " + player.getRequiredExp());
		System.out.println("현재경험치 : " + player.getCurrenExp());
		System.out.println("==========================================");
		
	}
	
}
