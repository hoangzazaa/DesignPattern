package creational_pattern.builder_pattern_example2;

public class LargeMasalaPizza extends VegPizza {
	public String name() {
		return "Masala Pizza";
	}
	
	public String size() {
		return "Large Size";
	}
	
	public float price() {
		return 150.0f;
	}
}
