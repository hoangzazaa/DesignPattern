package creational_pattern.builder_pattern_example2;

public class SmallCoke extends Coke {
	@Override
	public String name() {
		return "300 ml Coke";
	}
	
	@Override
	public String size() {
		
		return "Small Size";
	}
	
	@Override
	public float price() {
		
		return  25.0f;
	}
}
