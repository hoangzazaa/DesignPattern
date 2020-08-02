package behavioral_pattern.template_pattern;

public class TemplatePatternDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Class c=Class.forName("Soccer");
		Game game=(Game) c.newInstance();
		game.play();
	}
}
