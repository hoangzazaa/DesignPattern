package structural_pattern.decorator_pattern;

public class VegFood implements Food {
	public String prepareFood(){
		return "Veg Food";
	}
	
	public double foodPrice(){
		return 50.0;
	}
}
