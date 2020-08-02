package behavioral_pattern.command_pattern;

public class CommanPatternClient {
	public static void main(String[] args) {
		Document doc = new Document();
		
		ActionListenerCommand clickOpen = new ActionOpen(doc);
		ActionListenerCommand clickSave = new ActionSave(doc);
		
		MenuOptions menu = new MenuOptions(clickOpen, clickSave);
		
		menu.clickOpen();
		menu.clickSave();
	}
}
