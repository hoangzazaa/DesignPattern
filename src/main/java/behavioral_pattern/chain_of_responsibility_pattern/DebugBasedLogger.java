package behavioral_pattern.chain_of_responsibility_pattern;

public class DebugBasedLogger extends Logger {
	public DebugBasedLogger(int levels) {
		this.levels=levels;
	}
	
	protected void displayLogInfo(String msg) {
		System.out.println("DEBUG LOGGER INFO: "+msg);
	}
}
