package creational_pattern.builder_pattern_example2;

public class MediumNonVegPizza extends NonVegPizza {
	public float price() {
		return 200.0f;
	}
	
	public String name() {
		return "Non-Veg Pizza";
	}
	
	public String size() {
		return "Medium Size";
	}
}
