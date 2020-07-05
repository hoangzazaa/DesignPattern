package creational_pattern.builder_pattern_example2;

public class LargeOnionPizza extends VegPizza {
	public String name() {
		return "Onion Pizza";
	}
	
	public String size() {
		return "Large size";
	}
	
	public float price() {
		return 180.0f;
	}
}
