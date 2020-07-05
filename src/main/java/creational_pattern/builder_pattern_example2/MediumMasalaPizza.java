package creational_pattern.builder_pattern_example2;

public class MediumMasalaPizza extends VegPizza {
	public String name() {
		return "Masala Pizza";
	}
	
	public String size() {
		return "Medium Size";
	}
	
	public float price() {
		return 120.0f;
	}
}
