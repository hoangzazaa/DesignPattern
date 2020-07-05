package creational_pattern.builder_pattern_example2;

public class LargeCheezePizza extends VegPizza {
	public String name() {
		return "Cheeze Pizza";
	}
	
	public String size() {
		return "Large Size";
	}
	
	public float price() {
		return 260.0f;
	}
}
