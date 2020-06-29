package creational_pattern.abstract_factory_pattern;

public class HDFC implements Bank {

	private String bankName;

	public HDFC() {
		bankName = "HDFC BANK";
	}

	public String getBankName() {
		return bankName;
	}
}
