package creational_pattern.abstract_factory_pattern;

public class ICICI implements Bank {

	private final String bankName;

	public ICICI () {
		bankName = "ICICI BANK";
	}

	public String getBankName() {
		return bankName;
	}
}
