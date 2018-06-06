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
	
	public void repListScreen() {
		System.out.println("Liste des répertoires");
		System.out.print("Votre réponse ? ");
		System.out.println();
	}
	
	public void createRepScreen() {
		System.out.println("Création d'un répertoire");
		System.out.print("Votre réponse ? ");
		System.out.println();
	}
	
	public void createContactScreen() {
		System.out.println("Création d'un contact");
		System.out.print("Votre réponse ? ");
		System.out.println();
	}
	
}
