package 괴물잡기게임.views;

import java.util.Scanner;

import 괴물잡기게임.controller.GameController;
import 괴물잡기게임.model.vo.Goblin;
import 괴물잡기게임.model.vo.Monster;
import 괴물잡기게임.model.vo.Player;
import 괴물잡기게임.model.vo.Troll;

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
			System.out.println(player.getPlayerName() + "님의 게임 메뉴");
			System.out.println("===================================================");
			System.out.println("1. 현재 상태 보기");
			System.out.println("2. 괴물사냥");
			System.out.println("9. 나가기");
			
			System.out.println("메뉴를 선택하세요 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : gameController.displayPlayerinfo(); break;
			case 2 : choiceMonsterMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다." ); return;
			}
		} while(true);
	}
	
	private void choiceMonsterMenu() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("===============================================");
			System.out.println("사냥할 괴물을 종류를 고르세요");
			System.out.println("1. 고블린");
			System.out.println("2. 트롤");
			System.out.println("9. 메인메뉴로");
			System.out.println("메뉴 번호 : ");
			int no = sc.nextInt();
			
			
			Monster nu11 = null;
			Monster monster = nu11;
			switch(no) {
			case 1 : monster = new Goblin(100, 100); break;
			case 2 : monster = new Troll(1500, 2000); break;
			case 9 : return;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력하세요");
			}
			
			if(monster != nu11) {
				gameController.attack(monster);
			}
			
		}while(true);
	}
	
	
}

