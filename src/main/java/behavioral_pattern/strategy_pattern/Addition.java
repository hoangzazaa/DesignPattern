package behavioral_pattern.strategy_pattern;

public class Addition implements Strategy {
	public float calculation(float a, float b) {
		return a+b;
	}
}
