package creational_pattern.builder_pattern_example2;

public class SmallNonVegPizza extends NonVegPizza {
	public float price() {
		return 180.0f;
	}
	
	public String name() {
		return "Non-Veg Pizza";
	}
	
	public String size() {
		return "Samll Size";
	}
}
