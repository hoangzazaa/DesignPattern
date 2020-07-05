package creational_pattern.builder_pattern_example2;

public class SmallMasalaPizza extends VegPizza {
	public String name() {
		return "Masala Pizza";
	}
	
	public String size() {
		return "Samll Size";
	}
	
	public float price() {
		return 100.0f;
	}
}
