package creational_pattern.builder_pattern_example2;

public class SmallCheezePizza extends VegPizza {
	public String name() {
		return "Cheeze Pizza";
	}
	
	public String size() {
		return "Small size";
	}
	
	public float price() {
		return 170.0f;
	}
}
