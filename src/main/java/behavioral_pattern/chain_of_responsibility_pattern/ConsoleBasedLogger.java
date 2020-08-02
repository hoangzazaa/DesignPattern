package behavioral_pattern.chain_of_responsibility_pattern;

public class ConsoleBasedLogger extends Logger {
	
	public ConsoleBasedLogger(int levels) {
		this.levels=levels;
	}
	
	protected void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: "+msg);
	}
}
