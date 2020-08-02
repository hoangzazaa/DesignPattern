package behavioral_pattern.memento_pattern;

public class Memento {
	
	private String state;
	
	public Memento(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
}
