package fr.dwaps.business;

import fr.dwaps.main.ScreenDisplayer;

public class CreateContactAction extends AbstractAction {

	@Override
	public void executeAction(ScreenDisplayer displayer) {
		displayer.createContactScreen();
	}

}
