package behavioral_pattern.state_pattern;

public class Accounting implements Connection {
	
	public void open() {
		System.out.println("open database for accounting");
	}
	
	public void close() {
		System.out.println("close the database");
	}
	
	
	public void log() {
		System.out.println("log activities");
	}
	
	public void update() {
		System.out.println("Accounting has been updated");
	}
}
