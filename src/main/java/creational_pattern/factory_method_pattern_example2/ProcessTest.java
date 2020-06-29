package creational_pattern.factory_method_pattern_example2;

public class ProcessTest {

	public static void main(String[] args)
	{
		ProcessFile fileProcess=new ProcessFile("Low");
		fileProcess.chooseProcessor();
		fileProcess.process();
	}
	
}
