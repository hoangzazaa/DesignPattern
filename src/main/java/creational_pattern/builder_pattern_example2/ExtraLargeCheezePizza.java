package creational_pattern.builder_pattern_example2;

public class ExtraLargeCheezePizza extends Pizza {
	public String name() {
		return "Cheeze Pizza";
	}
	
	public String size() {
		return "Extra-Large Size";
	}
	
	public float price() {
		return 300.f;
	}
}
