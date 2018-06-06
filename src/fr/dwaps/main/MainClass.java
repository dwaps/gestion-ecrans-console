package fr.dwaps.main;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScreenDisplayer displayer = new ScreenDisplayer(sc);
		
		while(true) {
			displayer.mainMenu();
			break;
		}
		
		sc.close();
		
	}
}
