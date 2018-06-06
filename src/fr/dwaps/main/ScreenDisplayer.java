package fr.dwaps.main;

import java.util.Scanner;

public class ScreenDisplayer {
	private Scanner sc;
	
	public ScreenDisplayer(Scanner sc) {
		this.sc = sc;
	}
	
	public void mainMenu() {
		String menu = " Voir reps (V) | Créer rep (CR) | Créer contact (CC) ";
		String deco = "-";
		for (int i = 0; i < menu.length(); i++) deco += "-";
		deco += "-";
		
		System.out.println(deco);
		System.out.println("|" + menu + "|");
		System.out.println(deco);
		System.out.println();
	}
	
}
