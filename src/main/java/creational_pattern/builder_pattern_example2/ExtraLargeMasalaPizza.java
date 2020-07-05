package creational_pattern.builder_pattern_example2;

public class ExtraLargeMasalaPizza extends VegPizza {
	public String name() {
		return "Masala Pizza";
	}
	
	public String size() {
		return "Extra-Large Size";
	}
	
	public float price() {
		return 180.0f;
	}
}
