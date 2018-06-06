package fr.dwaps.main;

import java.awt.Menu;
import java.util.Scanner;

public class ScreenDisplayer {
	private Scanner sc;
	private boolean firstStart = true;
	
	public ScreenDisplayer(Scanner sc) {
		this.sc = sc;
		mainMenu();
	}
	
	public void mainMenu() {
		clearScreen();
		deco(" Voir reps (V) | Créer rep (CR) | Créer contact (CC) ");
	}
	
	public void repListScreen() {
		if (!firstStart) mainMenu();
		
		System.out.println("Liste des répertoires");
		System.out.print("Votre réponse ? ");
	}
	
	public void createRepScreen() {
		mainMenu();
		
		System.out.println("Création d'un répertoire");
		System.out.print("Votre réponse ? ");
	}
	
	public void createContactScreen() {
		mainMenu();
		
		System.out.println("Création d'un contact");
		System.out.print("Votre réponse ? ");
	}
	
	public void deco(String str) {
		String deco = "-";
		for (int i = 0; i < str.length(); i++) deco += "-";
		deco += "-";
		
		System.out.println(deco);
		System.out.println("|" + str + "|");
		System.out.println(deco);
		System.out.println();
		
		if (firstStart) {
			repListScreen();
			firstStart = false;
		}
	}
	
	public void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
	
}
