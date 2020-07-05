package creational_pattern.builder_pattern_example2;

public class ExtraLargeOnionPizza extends VegPizza {
	public String name() {
		return "Onion Pizza";
	}
	
	public String size() {
		return "Extra-Large Size";
	}
	
	public float price() {
		return 200.0f;
	}
}
