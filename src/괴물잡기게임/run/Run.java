package ����������.run;

import java.util.Scanner;

import ����������.views.GameMenu;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�÷��̾��� �̸��� �Է��� �ּ��� : "	);
		String playerName = sc.nextLine();
		
		new GameMenu(playerName).mainMenu();

	}

}
