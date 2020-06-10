package ����������.model.vo;

public abstract class Monster {
	private int hp;
	private int exp;
	private boolean aliveStatus;
	
	protected Monster(int hp, int exp) {
		this.hp = hp;
		this.exp = exp;
		this.aliveStatus = true;
	}

	public int gethp() {
		return hp;
	}
	
	public int getexp() {
		return exp;
	}
	
	public boolean isAlive() {
		return aliveStatus;
	}
	
	public void lossHp(int amount) {
		if(hp >= amount) {
			this.hp -= amount;
			System.out.println("hp�� " + amount + "��ŭ �����մϴ�.");
		}else {
			if(hp != 0) {
				System.out.println("hp�� " + hp + "��ŭ �����մϴ�.");
			}
			
			hp = 0;
			aliveStatus = false;
			
			System.out.println("hp�� 0�� �Ǿ� �׾����ϴ�.");
			
		}
	}
	
	public abstract void appear();
	
}


