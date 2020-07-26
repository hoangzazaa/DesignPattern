package structural_pattern.bridge_pattern;

public interface Question {
	void nextQuestion();
	void previousQuestion();
	void newQuestion(String q);
	void deleteQuestion(String q);
	void displayQuestion();
	void displayAllQuestions();
}
