package 괴물잡기게임.run;

import java.util.Scanner;

import 괴물잡기게임.views.GameMenu;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("플레이어의 이름을 입력해 주세요 : "	);
		String playerName = sc.nextLine();
		
		new GameMenu(playerName).mainMenu();

	}

}
