package creational_pattern.factory_method_pattern;

public abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void caculateBill() {
		System.out.println(3 * rate);
	}
}
