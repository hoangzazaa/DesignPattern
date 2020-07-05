package creational_pattern.builder_pattern_example2;

public class SmallOnionPizza extends VegPizza {
	public String name() {
		return "Onion Pizza";
	}
	
	public String size() {
		return "Small Size";
	}
	
	public float price() {
		return 120.0f;
	}
}
