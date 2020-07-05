package creational_pattern.builder_pattern_example2;

public class MediumOnionPizza extends VegPizza {
	public String name() {
		return "Onion Pizza";
	}
	
	public String size() {
		return "Medium Size";
	}
	
	public float price() {
		return 150.0f;
	}
}
