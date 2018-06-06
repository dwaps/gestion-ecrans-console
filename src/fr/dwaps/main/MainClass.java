package fr.dwaps.main;

import java.util.Scanner;

import fr.dwaps.business.AbstractAction;
import fr.dwaps.business.ActionManager;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScreenDisplayer displayer = new ScreenDisplayer(sc);
		String actionName;
		
		while(true) {
			actionName = sc.nextLine();
			AbstractAction action = ActionManager.getAction(actionName);
			if (action == null) break;
			action.executeAction(displayer);
		}
		
		displayer.clearScreen();
		displayer.deco(" Fin du programme ! ");
		sc.close();
	}
}
