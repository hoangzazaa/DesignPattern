package behavioral_pattern.template_pattern;

public class Soccer extends Game {
	
	void initialize() {
		System.out.println("Soccer Game Initialized! Start playing.");
	}
	
	void start() {
		System.out.println("Game Started. Welcome to in the Soccer game!");
	}
	
	void end() {
		System.out.println("Game Finished!");
	}
}
