package fr.dwaps.business;

import java.util.HashMap;
import java.util.Map;

public abstract class ActionManager {
	private static Map<String, AbstractAction> actions;
	
	static {
		actions = new HashMap<>();
		actions.put("V", new RepListAction());
		actions.put("CR", new CreateRepAction());
		actions.put("CC", new CreateContactAction());
	}
	
	public static AbstractAction getAction(String actionName) {
		return actions.get(actionName);
	}
}
