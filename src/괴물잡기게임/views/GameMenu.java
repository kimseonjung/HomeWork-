package ����������.views;

import java.util.Scanner;

import ����������.controller.GameController;
import ����������.model.vo.Goblin;
import ����������.model.vo.Monster;
import ����������.model.vo.Player;
import ����������.model.vo.Troll;

public class GameMenu {
	private Player player;
	private GameController gameController;
	
	
	public GameMenu(String playerName) {
		this.player = new Player(playerName);
		this.gameController = new GameController(player);
	}
	
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(player.getPlayerName() + "���� ���� �޴�");
			System.out.println("===================================================");
			System.out.println("1. ���� ���� ����");
			System.out.println("2. �������");
			System.out.println("9. ������");
			
			System.out.println("�޴��� �����ϼ��� : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : gameController.displayPlayerinfo(); break;
			case 2 : choiceMonsterMenu(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�." ); return;
			}
		} while(true);
	}
	
	private void choiceMonsterMenu() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("===============================================");
			System.out.println("����� ������ ������ ������");
			System.out.println("1. ���");
			System.out.println("2. Ʈ��");
			System.out.println("9. ���θ޴���");
			System.out.println("�޴� ��ȣ : ");
			int no = sc.nextInt();
			
			
			Monster nu11 = null;
			Monster monster = nu11;
			switch(no) {
			case 1 : monster = new Goblin(100, 100); break;
			case 2 : monster = new Troll(1500, 2000); break;
			case 9 : return;
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
			
			if(monster != nu11) {
				gameController.attack(monster);
			}
			
		}while(true);
	}
	
	
}

