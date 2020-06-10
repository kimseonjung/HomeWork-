package 괴물잡기게임.model.vo;

public class Goblin extends Monster {

	public Goblin(int hp, int exp) {
		super(hp, exp);
		
	}

	@Override
	public void appear() {
		System.out.println("고블린이 소리를 지릅니다. 키기키기캬갹가캭가~~~~");
	}
	
}
