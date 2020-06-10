package 괴물잡기게임.model.vo;

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
			System.out.println("hp가 " + amount + "만큼 감소합니다.");
		}else {
			if(hp != 0) {
				System.out.println("hp가 " + hp + "만큼 감소합니다.");
			}
			
			hp = 0;
			aliveStatus = false;
			
			System.out.println("hp가 0이 되어 죽었습니다.");
			
		}
	}
	
	public abstract void appear();
	
}


