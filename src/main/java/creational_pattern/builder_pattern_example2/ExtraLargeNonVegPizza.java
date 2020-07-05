package creational_pattern.builder_pattern_example2;

public class ExtraLargeNonVegPizza extends NonVegPizza {
	@Override
	public float price() {
		return 250.0f;
	}
	
	@Override
	public String name() {
		return "Non-Veg Pizza";
	}
	
	@Override
	public String size() {
		return "Extra-Large Size";
	}
}
