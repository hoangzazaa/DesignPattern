package behavioral_pattern.strategy_pattern;

public class Subtraction implements Strategy {
	public float calculation(float a, float b) {
		return a - b;
	}
}
