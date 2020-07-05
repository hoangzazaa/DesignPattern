package creational_pattern.builder_pattern_example2;

public class LargeCoke extends Coke {
	@Override
	public String name() {
		return "750 ml Coke";
	}
	
	@Override
	public String size() {
		
		return "Large Size";
	}
	
	@Override
	public float price() {
		
		return  50.0f;
	}
}
