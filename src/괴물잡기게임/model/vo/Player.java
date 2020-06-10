package 괴물잡기게임.model.vo;

public class Player {
	private String playerName;
	private int currentExp;
	private int requiredExp;
	private int level;
	private int attackPower;
	
	public Player(String playerName) {
		this.playerName = playerName;
		this.currentExp = 0;
		this.level = 1;
		this.requiredExp = level *100;
		this.attackPower = 20;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public int getCurrenExp() {
		return currentExp;
	}
	
	public int getRequiredExp() {
		return requiredExp;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public void incrementExp(int MonsterExp) {
		currentExp += MonsterExp;
	}
	
	public boolean isAvailableLevelUp() {
		return (currentExp - requiredExp >= 0)? true: false;
	}
	
	public void levelUp() {
		System.out.println("플레이어의 레벨이 +1 증가하였습니다.");
		level += 1;
		currentExp = currentExp - requiredExp;
		requiredExp *= 2;
		attackPower *= 1.5;
	}
	
}
