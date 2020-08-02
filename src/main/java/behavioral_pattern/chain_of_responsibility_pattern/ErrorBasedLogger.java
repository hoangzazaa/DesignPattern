package behavioral_pattern.chain_of_responsibility_pattern;

public class ErrorBasedLogger extends Logger {
	public ErrorBasedLogger(int levels) {
		this.levels=levels;
	}
	
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: "+msg);
	}
}
