package ����������.views;

import ����������.model.vo.Player;

public class Playerinfo {
	private Player player;
	
	public Playerinfo(Player player) {
		this.player = player;
	}
	
	public void displayInformation() {
		System.out.println("==========================================");
		System.out.println(player.getPlayerName() + "���� ���� ����");
		System.out.println("==========================================");
		System.out.println("���� : " + player.getLevel());
		System.out.println("���ݷ� : " + player.getAttackPower());
		System.out.println("�ʿ����ġ : " + player.getRequiredExp());
		System.out.println("�������ġ : " + player.getCurrenExp());
		System.out.println("==========================================");
		
	}
	
}
