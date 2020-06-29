package creational_pattern.factory_method_pattern;

public class GetPlanFactory {
	public Plan getPlan(String _planType) {
		if (_planType == null) {
			return null;
		}

		if(_planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		else if(_planType.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan();
		}
		else if(_planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		} else {
			throw new IllegalArgumentException(String.format("_planType is invalid %s", _planType));
		}
	}
	
}
