package ����������.model.vo;

public class Goblin extends Monster {

	public Goblin(int hp, int exp) {
		super(hp, exp);
		
	}

	@Override
	public void appear() {
		System.out.println("����� �Ҹ��� �����ϴ�. Ű��Ű��ļ����Ľ��~~~~");
	}
	
}
