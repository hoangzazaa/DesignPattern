package creational_pattern.abstract_factory_pattern;

public class SBI implements Bank {

	private final String bankName;

	public SBI() {
		bankName = "SBI BANK";
	}

	public String getBankName() {
		return bankName;
	}
}
