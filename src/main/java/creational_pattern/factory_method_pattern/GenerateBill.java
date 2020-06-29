package creational_pattern.factory_method_pattern;

public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();
		Plan p = planFactory.getPlan("DOMESTICPLAN");
		p.getRate();
		p.caculateBill();
	}
}
