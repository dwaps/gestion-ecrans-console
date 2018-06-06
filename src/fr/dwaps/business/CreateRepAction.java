package fr.dwaps.business;

import fr.dwaps.main.ScreenDisplayer;

public class CreateRepAction extends AbstractAction {

	@Override
	public void executeAction(ScreenDisplayer displayer) {
		displayer.createRepScreen();
	}

}
