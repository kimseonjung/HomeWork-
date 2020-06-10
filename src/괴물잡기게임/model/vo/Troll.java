package 괴물잡기게임.model.vo;

public class Troll extends Monster {
	
	public Troll(int hp, int exp) {
		super(hp, exp);
	}

	@Override
	public void appear() {
		System.out.println("트롤이 포효 합니다. 크아아악아가아아악아아아앙!!~~~~~");
		
	}

	

}
