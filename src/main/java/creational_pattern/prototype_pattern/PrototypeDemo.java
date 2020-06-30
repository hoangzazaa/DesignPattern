package creational_pattern.prototype_pattern;

public class PrototypeDemo {
	public static void main(String[] args) {
		EmployeeRecord e1=new EmployeeRecord(1,"hoangnv","edesignation",1.5,"ssssss");
		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2=(EmployeeRecord) e1.getClone();
		e2.showRecord();
	}
}
