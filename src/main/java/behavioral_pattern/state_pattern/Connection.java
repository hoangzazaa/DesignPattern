package behavioral_pattern.state_pattern;

public interface Connection {
	void open();
	void close();
	void log();
	void update();
}
