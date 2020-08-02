package behavioral_pattern.state_pattern;

public class Sales implements Connection {
	
	public void open() {
		System.out.println("open database for sales");
	}
	
	public void close() {
		System.out.println("close the database");
	}
	
	public void log() {
		System.out.println("log activities");
	}
	
	public void update() {
		System.out.println("Sales has been updated");
	}
}
