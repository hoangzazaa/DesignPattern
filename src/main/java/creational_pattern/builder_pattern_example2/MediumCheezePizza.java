package creational_pattern.builder_pattern_example2;

public class MediumCheezePizza extends VegPizza {
	public String name() {
		return "Cheeze Pizza";
	}
	
	public String size() {
		return "Medium Size";
	}
	
	public float price() {
		return 220.f;
	}
}
