package behavioral_pattern.template_pattern;

public class Chess extends Game {
	void initialize() {
		System.out.println("Chess Game Initialized! Start playing.");
	}
	
	void start() {
		System.out.println("Game Started. Welcome to in the chess game!");
	}
	
	void end() {
		System.out.println("Game Finished!");
	}
}
